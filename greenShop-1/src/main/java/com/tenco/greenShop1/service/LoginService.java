package com.tenco.greenShop1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.tenco.greenShop1.dto.UserDto;
import com.tenco.greenShop1.handler.LoginException;
import com.tenco.greenShop1.repository.interfaces.LoginRepository;
import com.tenco.greenShop1.repository.model.User;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;

	public User signIn(UserDto userDto) {
		System.out.println("1111");
		User userEntity = loginRepository.findByUsernameAndPassword(userDto);
		System.out.println(userEntity);
		if (userEntity == null) {
			throw new LoginException("아이디 혹은 비번이 틀렸습니다.", HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return userEntity;
	}
}
