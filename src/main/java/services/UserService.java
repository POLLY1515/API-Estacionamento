package services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import repositories.UserRepository;


@RequiredArgsConstructor
@Service
public class UserService {

	
	private  UserRepository userRepository;
}
