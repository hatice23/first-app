package com.haticedev.firstapp;

import com.haticedev.firstapp.model.User;
import com.haticedev.firstapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
	}

	@Autowired
	UserService userService;

	@Override
	public void run(String... args) throws Exception {

		userService.createUser(new User("user1","name1",false,19));
		userService.createUser(new User("user2","name2",false,20));
		userService.createUser(new User("user3","name3",false,20));

	}
}
