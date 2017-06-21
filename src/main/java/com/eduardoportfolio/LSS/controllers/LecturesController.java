package com.eduardoportfolio.LSS.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.eduardoportfolio.LSS.dao.LectureDao;

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
	
	//Responsible to indicates the injection points inside the class
	@Autowired
	LectureDao lectureDao = new LectureDao();
	
	@RequestMapping("/showLectureForm")
	public String form(){
		return "registration/lectureRegistration";
	}
	
}
