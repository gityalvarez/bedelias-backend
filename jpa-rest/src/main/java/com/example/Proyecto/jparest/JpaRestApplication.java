package com.example.Proyecto.jparest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaRestApplication {
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaRestApplication.class, args);
	}
	/*@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Yamandu", "Alvarez"));
		userRepository.save(new User("Fernando", "Guarisco"));
		userRepository.save(new User("Leonardo", "Manzuetti"));
		userRepository.save(new User("Marcos", "Viera"));
		userRepository.save(new User("Hector", "Alfonso"));
		
	}*/
}
