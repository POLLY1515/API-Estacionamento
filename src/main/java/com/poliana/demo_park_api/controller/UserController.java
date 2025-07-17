package com.poliana.demo_park_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poliana.demo_park_api.servicies.UserService;

import entities.User;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/users")
public class UserController {

	
	private final UserService userService;
	
	@PostMapping
	public ResponseEntity<User> create(@RequestBody User user){
	User usuario =	userService.salvar(user);
	return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
}
