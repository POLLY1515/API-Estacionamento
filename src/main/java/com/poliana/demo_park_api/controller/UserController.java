package com.poliana.demo_park_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poliana.demo_park_api.servicies.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/users")
public class UserController {

	
	private final UserService userService;
}
