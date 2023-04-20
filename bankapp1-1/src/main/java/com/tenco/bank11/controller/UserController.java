package com.tenco.bank11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tenco.bank11.repository.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/sign-in")
	public String signIn() {
		
		return "/user/signIn";
	}
	
	@PostMapping("/sign-in")
	public String signInProc() {
		
		
		return "/user/signIn";
	}
	
}
