package com.eduardoportfolio.LSS.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eduardoportfolio.LSS.models.User;

@Controller
public class UserController {
	
	@RequestMapping ("/users")
	public String save (User user) {
		System.out.println("Registering the user");
		return "users/ok";
	}

}
