package com.tenco.bank11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/main")
	public String main() {
		
		return "/layout/main";
	}
}
