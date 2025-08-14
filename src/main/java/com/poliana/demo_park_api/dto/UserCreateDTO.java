package com.poliana.demo_park_api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 
@ToString
public class UserCreateDTO {
	
	@NotBlank //O NOTBLANK, valida se nao esta nulo, se nao eswta vazio, e testa se tem ao menos um caractere
	
	@Email(message = "formato do e-mail inválido!")
	private String userName;
	@NotBlank
	@Size(min= 6, max = 6)
	private String password;
	
	

}
