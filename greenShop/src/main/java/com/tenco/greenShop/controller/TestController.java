package com.tenco.greenShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@Controller
@RequestMapping("/test")
public class TestController {

	@GetMapping("/login")
	public String login() {
		
		System.out.println("1");
		
		return "layout/login";
	}
	
}
