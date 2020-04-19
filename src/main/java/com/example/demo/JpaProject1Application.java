package com.example.demo;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepo;

@SpringBootApplication
public class JpaProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(JpaProject1Application.class, args);
	}
	
	
	@Autowired
	UserRepo userRepo;
	
	@PostConstruct
	private void createUser() {
		userRepo.save(new User("username" , "email", "password", 25000.00, new Date(1990,12,12)));
		userRepo.save(new User("Hritika" , "h@email", "H123", 55000.00, new Date(1990,12,12)));
		userRepo.save(new User("Priyanka" , "p@email", "p123", 55000.00, new Date(1990,12,12)));
	}
}
