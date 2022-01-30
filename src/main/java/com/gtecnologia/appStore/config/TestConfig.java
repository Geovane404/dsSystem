package com.gtecnologia.appStore.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gtecnologia.appStore.entities.User;
import com.gtecnologia.appStore.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User n1 = new User(null, "Maria", "maria@gmail.com", "90909090", "1234567");
		User n2 = new User(null, "Alex", "alex@gmail.com", "90909090", "1234567");
		User n3 = new User(null, "Jose", "jose@gmail.com", "90909090", "1234567");

		userRepository.saveAll(Arrays.asList(n1, n2, n3));

	}

}
