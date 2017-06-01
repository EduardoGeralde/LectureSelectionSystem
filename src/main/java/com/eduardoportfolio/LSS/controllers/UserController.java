package com.eduardoportfolio.LSS.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping ("/users")
	public String save () {
		System.out.println("Registering the user");
		return "users/ok";
	}

}
