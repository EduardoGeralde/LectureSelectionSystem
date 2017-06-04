package com.eduardoportfolio.LSS.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eduardoportfolio.LSS.models.Event;

/**
 * 
 * @author Eduardo Geralde Neto
 * 
 * 
 */

@Controller
public class EventsController {
	
	@RequestMapping ("/events")
	public String save (Event event) {
		System.out.println("Registering the event");
		return "events/ok";
	}
}
