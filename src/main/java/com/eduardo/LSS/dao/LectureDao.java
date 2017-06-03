package com.eduardo.LSS.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.eduardo.LSS.models.Lecture;

@Repository
public class LectureDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void save (Lecture lecture){
		manager.persist(lecture);
	}
}
