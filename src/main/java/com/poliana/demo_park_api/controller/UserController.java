package com.poliana.demo_park_api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poliana.demo_park_api.dto.UserCreateDTO;
import com.poliana.demo_park_api.dto.UserResponseDTO;
import com.poliana.demo_park_api.dto.mapper.UserMapper;
import com.poliana.demo_park_api.entities.User;
import com.poliana.demo_park_api.servicies.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/users")
public class UserController {

	
	private final UserService userService;
	
	@PostMapping
	public ResponseEntity<UserResponseDTO> create(@RequestBody UserCreateDTO createDTO){
	User usuario =	userService.salvar(UserMapper.toUser(createDTO));
	return ResponseEntity.status(HttpStatus.CREATED).body(UserMapper.toDTO(usuario));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserResponseDTO> getById(@PathVariable Long id){
	User usuario =	userService.buscarPorId(id);
	return ResponseEntity.ok(UserMapper.toDTO(usuario));
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<User> updatePassword(@PathVariable Long id, @RequestBody User user){
	User usuario =	userService.editarSenha(id, user.getPassword());
	return ResponseEntity.ok(usuario);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAll(){
	List<User> usuarios = userService.buscarTodos();
	return ResponseEntity.ok(usuarios);
	}
}
