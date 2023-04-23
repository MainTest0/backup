package com.tenco.tencoshop.repository.interfaces;

import org.apache.ibatis.annotations.Mapper;

import com.tenco.tencoshop.dto.UserDto;
import com.tenco.tencoshop.repository.model.User;
import com.tenco.tencoshop.repository.model.UserLogin;

@Mapper
public interface LoginRepository {

	public UserLogin findByUsernameAndPassword(UserDto userDto);
	
}
