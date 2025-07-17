package com.poliana.demo_park_api.servicies;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poliana.demo_park_api.repositories.UserRepository;

import entities.User;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	
	private final UserRepository userRepository;

	@Transactional
	public User salvar(User user) {
		return userRepository.save(user);
	}

	
}
