package com.tenco.greenshopProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@GetMapping("/login")
	public String test() {

		return "account/login";
	}

}
