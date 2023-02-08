package com.wissen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wissen.model.User;
import com.wissen.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user)
	{
		
		System.out.println("Contrller");
		User savedUser = userService.createUser(user);
		return new ResponseEntity<User>(savedUser,HttpStatus.CREATED);
		
	}
}
