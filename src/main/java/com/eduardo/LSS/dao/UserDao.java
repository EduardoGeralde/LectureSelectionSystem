package com.eduardo.LSS.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.eduardo.LSS.models.User;

@Repository
public class UserDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void save (User user) {
		manager.persist(user);
	}
}
