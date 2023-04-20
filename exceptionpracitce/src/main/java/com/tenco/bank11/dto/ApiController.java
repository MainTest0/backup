package com.tenco.bank11.dto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController extends RuntimeException{
	
	@GetMapping("/user")
	public User user(@RequestParam String name, @RequestParam Integer age) {
		
		User user = new User();
		user.setName(name);
		user.setAge(age);
		
		return user;
	}

}
