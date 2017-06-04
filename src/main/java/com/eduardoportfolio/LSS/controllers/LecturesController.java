package com.eduardoportfolio.LSS.controllers;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eduardoportfolio.LSS.models.Lecture;

/**
 * 
 * @author Eduardo Geralde Neto
 * 
 * 
 */

//Tells that this class is effectively the responsible to meet requests from a client
@Controller
//Indicates that this methods needs transaction.
@Transactional
public class LecturesController {
	
	@RequestMapping ("/lectures")
	public String save (Lecture lecture) {
		System.out.println("Registering the Lecture");
		return "lectures/ok";
	}
}
