package com.eduardoportfolio.LSS.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventsController {
	
	@RequestMapping ("/events")
	public String save () {
		System.out.println("Registering the event");
		return "events/ok";
	}
}
