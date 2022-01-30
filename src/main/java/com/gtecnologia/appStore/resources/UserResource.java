package com.gtecnologia.appStore.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gtecnologia.appStore.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> finAll() {
		User n1 = new User(1L, "Maria", "maria@gmail.com", "90909090", "1234567");
		User n2 = new User(2L, "Alex", "alex@gmail.com", "90909090", "1234567");
		User n3 = new User(3L, "Jose", "jose@gmail.com", "90909090", "1234567");
		return ResponseEntity.ok().body(n1);
	}
	
}
