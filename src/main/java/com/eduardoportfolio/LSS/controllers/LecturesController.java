package com.eduardoportfolio.LSS.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LecturesController {
	
	@RequestMapping ("/lectures")
	public String save () {
		System.out.println("Registering the Lecture");
		return "lectures/ok";
	}
}
