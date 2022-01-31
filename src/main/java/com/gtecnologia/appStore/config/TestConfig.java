package com.gtecnologia.appStore.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gtecnologia.appStore.entities.Category;
import com.gtecnologia.appStore.entities.Order;
import com.gtecnologia.appStore.entities.User;
import com.gtecnologia.appStore.entities.enums.OrderStatus;
import com.gtecnologia.appStore.repositories.CategoryRepository;
import com.gtecnologia.appStore.repositories.OrderRepository;
import com.gtecnologia.appStore.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria", "maria@gmail.com", "90909090", "1234567");
		User u2 = new User(null, "Alex", "alex@gmail.com", "90909090", "1234567");
		User u3 = new User(null, "Jose", "jose@gmail.com", "90909090", "1234567");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");

		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}

}
