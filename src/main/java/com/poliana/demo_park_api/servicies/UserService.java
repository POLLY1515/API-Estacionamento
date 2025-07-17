package com.poliana.demo_park_api.servicies;

import org.springframework.stereotype.Service;

import com.poliana.demo_park_api.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	
	private final UserRepository userRepository;

	
}
