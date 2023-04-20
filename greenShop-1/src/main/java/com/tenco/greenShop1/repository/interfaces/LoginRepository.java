package com.tenco.greenShop1.repository.interfaces;

import org.apache.ibatis.annotations.Mapper;

import com.tenco.greenShop1.dto.UserDto;
import com.tenco.greenShop1.repository.model.User;

@Mapper
public interface LoginRepository {

	// 아이디, 패스워드 찾기
	public User findByUsernameAndPassword(UserDto userDto);
	
}
