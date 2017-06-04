package com.eduardoportfolio.LSS.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.eduardoportfolio.LSS.models.User;

/**
 * 
 * @author Eduardo Geralde Neto
 * 
 * 
 */

@Repository
public class UserDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void save (User user) {
		manager.persist(user);
	}
}
