package com.poliana.demo_park_api.dto;

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
public class UserSenhaDTO {

	private String senhaAtual;
	private String novaSenha;
	private String confirmaSenha;


}
