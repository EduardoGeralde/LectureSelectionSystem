package com.eduardoportfolio.LSS.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.eduardoportfolio.LSS.models.Event;

/**
 * 
 * @author Eduardo Geralde Neto
 * 
 * 
 */

//Indicates that this class besides being managed for the Spring, it is responsible for the data access.
@Repository
public class EventDao {
	
	//Used to inject Entity Manager
	@PersistenceContext
	private EntityManager manager;
	
	public void save (Event event){
		manager.persist(event);
	}
}
