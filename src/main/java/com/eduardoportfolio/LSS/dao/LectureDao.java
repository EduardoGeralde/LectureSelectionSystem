package com.eduardoportfolio.LSS.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.eduardoportfolio.LSS.models.Lecture;

/**
 * 
 * @author Eduardo Geralde Neto
 * 
 * 
 */

//Indicates that this class besides being managed for the Spring, it is responsible for the data access.
@Repository
public class LectureDao {
	
	//Used to inject Entity Manager
	@PersistenceContext
	private EntityManager manager;
	
	public void save (Lecture lecture){
		manager.persist(lecture);
	}
}
