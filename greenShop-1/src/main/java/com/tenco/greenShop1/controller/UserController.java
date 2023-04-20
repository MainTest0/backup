package com.tenco.greenShop1.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tenco.greenShop1.dto.UserDto;
import com.tenco.greenShop1.handler.LoginException;
import com.tenco.greenShop1.repository.model.User;
import com.tenco.greenShop1.service.LoginService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired // DI 처리
	private HttpSession session;
	
	@GetMapping("/login")
	public String signIn() {
		
		return "layout/login";
	}
	
	@PostMapping("/login")
	public String signInProc(UserDto userDto) {
		// 유효성 검사
		
		if(userDto.getUserId() == null || userDto.getUserId().isEmpty()) {
			throw new LoginException("ID입력", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(userDto.getPassword() == null || userDto.getPassword().isEmpty()) {
			throw new LoginException("PW입력", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		User principal = loginService.signIn(userDto);
		principal.setPassword(null);
		session.setAttribute("principal", principal);
		// todo
		// 로그인 완료 후 화면
		return "layout/testsuccess";
	}

}
