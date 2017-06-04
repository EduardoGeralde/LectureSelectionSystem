package com.eduardoportfolio.LSS.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eduardoportfolio.LSS.dao.EventDao;
import com.eduardoportfolio.LSS.models.Event;

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
public class EventsController {
	
	//Responsible to indicates the injection points inside the class.
	@Autowired
	private EventDao eventDao;
	
	@RequestMapping("/showEventForm")
	public String show(){
		return "registration/eventRegistration";
	}
	
	@RequestMapping ("/events")
	public String save (Event event) {
		eventDao.save(event);
		System.out.println("Saving the event" + event);
		return "events/ok";
	}
}
