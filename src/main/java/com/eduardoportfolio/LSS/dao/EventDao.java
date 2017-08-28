package com.eduardoportfolio.LSS.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.eduardoportfolio.LSS.models.Event;
import com.eduardoportfolio.LSS.models.Lecture;

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
	
	public List<Event> list(){
		return manager.createQuery("select distinct (p) from Event p join fetch p.eventLectures", Event.class).getResultList();
	}
	
	public void delete(Event event){
		manager.remove(event);
	}
	
	public Event find(Integer id) {
		TypedQuery<Event> query = manager.createQuery(
				"select (p) from Event p join fetch p.eventLectures where p.id=:id",
						Event.class).setParameter("id", id);
		return query.getSingleResult();
	}
	
}
