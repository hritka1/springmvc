package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.UserRepo;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserRepo userRepo;
	
	
	@GetMapping("/")
	public String getUserName(Model model) {
		
		//model.addAttribute("username","Hritika");
		model.addAttribute("user",userRepo.findAll());
		model.addAttribute("copyright","copyright");
		return "user/ShowUser";
	}
	
	
}
