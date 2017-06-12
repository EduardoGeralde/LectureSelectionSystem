package com.eduardoportfolio.LSS.models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 * 
 * @author Eduardo Geralde Neto
 * 
 * 
 */

//Indicates that the class have to be represented by a table in DB.
@Entity
public class Event {
	
	//Indicates that the attribute is a primary key.
	@Id
	//Indicates how the primary key will be generated.
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private Integer eventId;
	private String eventName;
	//Indicates that it will be saved like a CLOB (Character Large Objects) or BLOB (Binary Large Objects) depends of the DB.
	@Lob
	private String eventDescription;
	private String eventSite;
	private String eventOrganizer;
	private String eventLocal;
	private String eventLogoPath;
	@DateTimeFormat(iso=ISO.DATE)
	private Calendar eventDate;
	//Used to define a collection of Embeddable objects
	@ElementCollection
	private List<Lecture> eventLectures = new ArrayList<Lecture>();
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	public String getEventSite() {
		return eventSite;
	}
	public void setEventSite(String eventSite) {
		this.eventSite = eventSite;
	}
	public String getEventOrganizer() {
		return eventOrganizer;
	}
	public void setEventOrganizer(String eventOrganizer) {
		this.eventOrganizer = eventOrganizer;
	}
	public String getEventLocal() {
		return eventLocal;
	}
	public void setEventLocal(String eventLocal) {
		this.eventLocal = eventLocal;
	}
	public String getEventLogoPath() {
		return eventLogoPath;
	}
	public void setEventLogoPath(String eventLogoPath) {
		this.eventLogoPath = eventLogoPath;
	}
	public Calendar getEventDate() {
		return eventDate;
	}
	public void setEventDate(Calendar eventDate) {
		this.eventDate = eventDate;
	}
	
	
	public List<Lecture> getEventLectures() {
		return eventLectures;
	}
	public void setEventLectures(List<Lecture> eventLectures) {
		this.eventLectures = eventLectures;
	}
	public Integer getEventId() {
		return eventId;
	}
	
	@Override
	public String toString() {
		return "Event [Name=" + eventName + ", Description=" + eventDescription + ", Organizer=" + eventOrganizer + 
				", Local=" + eventLocal + ", Date=" + eventDate + "]";
	}
	
}
