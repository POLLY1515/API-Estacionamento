package com.poliana.demo_park_api.dto.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import com.poliana.demo_park_api.dto.UserCreateDTO;
import com.poliana.demo_park_api.dto.UserResponseDTO;
import com.poliana.demo_park_api.entities.User;

public class UserMapper {
	
	public static User toUser(UserCreateDTO createDTO) {
		return new ModelMapper().map(createDTO, User.class);
	}
	
	public static UserResponseDTO toDTO(User user) {
		String role = user.getRole().name().substring("ROLE_".length());
		PropertyMap<User, UserResponseDTO> props = new PropertyMap<User, UserResponseDTO>(){

			@Override
			protected void configure() {
				map().setRole(role);
								
			}
		};
		ModelMapper mapper = new ModelMapper();
		mapper.addMappings(props);
		return mapper.map(user, UserResponseDTO.class);
	}

	public static List<UserResponseDTO> toListDTO(List<User> usuarios){
		return usuarios.stream().map(user -> toDTO(user)).collect(Collectors.toList());
	}
}
