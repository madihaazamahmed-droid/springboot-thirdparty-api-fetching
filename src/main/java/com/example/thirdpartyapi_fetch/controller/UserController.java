package com.example.thirdpartyapi_fetch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.thirdpartyapi_fetch.dto.User;
import com.example.thirdpartyapi_fetch.service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public User getUser() {
		return userService.getUser();
	}
}
