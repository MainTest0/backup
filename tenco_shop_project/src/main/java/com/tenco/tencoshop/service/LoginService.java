package com.tenco.tencoshop.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.tenco.tencoshop.dto.UserDto;
import com.tenco.tencoshop.handler.LoginException;
import com.tenco.tencoshop.repository.interfaces.LoginRepository;
import com.tenco.tencoshop.repository.model.User;
import com.tenco.tencoshop.repository.model.UserLogin;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;

	public UserLogin signIn(UserDto userDto) {
		UserLogin userEntity = loginRepository.findByUsernameAndPassword(userDto);
		System.out.println(userEntity);
		if (userEntity == null) {
			throw new LoginException("아이디, 비밀번호를 확인해주세요", HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return userEntity;
	}
}
