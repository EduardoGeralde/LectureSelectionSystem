package com.eduardoportfolio.LSS.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eduardoportfolio.LSS.models.Lecture;

/**
 * 
 * @author Eduardo Geralde Neto
 * 
 * 
 */

@Controller
public class LecturesController {
	
	@RequestMapping ("/lectures")
	public String save (Lecture lecture) {
		System.out.println("Registering the Lecture");
		return "lectures/ok";
	}
}
