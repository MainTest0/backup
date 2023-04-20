package com.tenco.bank11.repository.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tenco.bank11.repository.model.User;

@Mapper
public interface UserRepository {

	public int insert(User user);
	public int update(User user);
	public int delete(Integer id);
	public User findById(Integer id);
	public List<User> findAll();
	
}
