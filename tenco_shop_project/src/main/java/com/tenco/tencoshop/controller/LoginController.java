package com.tenco.tencoshop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tenco.tencoshop.dto.UserDto;
import com.tenco.tencoshop.handler.LoginException;
import com.tenco.tencoshop.repository.model.UserLogin;
import com.tenco.tencoshop.service.LoginService;

@Controller
@RequestMapping("/user")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired // DI 처리
	private HttpSession session;
	
	@GetMapping("/login")
	public String signIn() {
		
		return "user/login";
	}
	
	@PostMapping("/login")
	public String signInProc(UserDto userDto) {
		
		// 유효성 검사
		if(userDto.getUsername() == null || userDto.getUsername().isEmpty()) {
			throw new LoginException("ID입력", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(userDto.getPassword() == null || userDto.getPassword().isEmpty()) {
			throw new LoginException("PW입력", HttpStatus.INTERNAL_SERVER_ERROR);
		} 
		UserLogin principal = loginService.signIn(userDto);
		principal.setPassword(null);
		session.setAttribute("principal", principal);
		// todo
		// 로그인 완료 후 화면
		return "user/login";
	}
	
	@GetMapping("/join")
	public String signUp() {
		
		return "layout/join";
	}
	
	@PostMapping("/join")
	public String signUpProc(UserDto userDto) {
		
		// 유효성 검사
		// id, pw null 값 확인
		
		if(userDto.getUsername() == null || userDto.getUsername().isEmpty()) {
			throw new LoginException("ID입력", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(userDto.getPassword() == null || userDto.getPassword().isEmpty()) {
			throw new LoginException("PW입력", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		UserLogin principal = loginService.signIn(userDto);
		principal.setPassword(null);
		session.setAttribute("principal", principal);
		
		return "layout/testsccess";
	}

}
