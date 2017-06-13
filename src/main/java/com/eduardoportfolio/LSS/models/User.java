package com.eduardoportfolio.LSS.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Eduardo Geralde Neto
 * 
 * 
 */

//Indicates that the class have to be represented by a table in DB.
@Entity
@Table(name="USER_DETAILS")
public class User {

	//Indicates that the attribute is a primary key.
	@Id
	//Indicates how the primary key will be generated.
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	
	@OneToMany
	private Collection <Event> events = new ArrayList <Event>();
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Integer getUserId() {
		return userId;
	}
	
	public Collection<Event> getEvents() {
		return events;
	}
	public void setEvents(Collection<Event> events) {
		this.events = events;
	}
	
	@Override
	public String toString() {
		return "User [Name=" + userName + ", Email=" + userEmail + "]";
	}
	
}
