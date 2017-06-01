package com.eduardoportfolio.LSS.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Tells that this class is effectively the responsible to meet requests from a client
@Controller
public class HomeController {
	
	//Binding (connection between a route and a method) Which method have to call for each URL
	@RequestMapping("/")
	public String index(){
		return "homeLSS";
	}

	
}
