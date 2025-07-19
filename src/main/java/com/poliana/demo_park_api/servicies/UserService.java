package com.poliana.demo_park_api.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poliana.demo_park_api.entities.User;
import com.poliana.demo_park_api.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	
	private final UserRepository userRepository;

	@Transactional
	public User salvar(User user) {
		return userRepository.save(user);
	}

	
	@Transactional(readOnly = true)
	public User buscarPorId(Long id) {
		return userRepository.findById(id).orElseThrow(
				() -> new RuntimeException("Usuário não encontrado!!")
				);
	}

    @Transactional
	public User editarSenha(Long id, String password) {
		User user = buscarPorId(id);
		user.setPassword(password);
		return user;
	}


    @Transactional(readOnly = true)
	public List<User> buscarTodos() {
		return userRepository.findAll();
	}

	
}
