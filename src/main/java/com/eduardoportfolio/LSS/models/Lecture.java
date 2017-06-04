package com.eduardoportfolio.LSS.models;

import javax.persistence.Embeddable;
import javax.persistence.Lob;

/**
 * 
 * @author Eduardo Geralde Neto
 * 
 * 
 */

//This embeddable class represents the lists of Lectures inside Event class.
@Embeddable
public class Lecture {
	
	private String lecturerName;
	private String lectureTitle;
	//Indicates that it will be saved like a CLOB or BLOB in the DB.
	@Lob
	private String lectureDescription;
	private String eventBelonging;
	
	public String getLecturerName() {
		return lecturerName;
	}
	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
	}
	public String getLectureTitle() {
		return lectureTitle;
	}
	public void setLectureTitle(String lectureTitle) {
		this.lectureTitle = lectureTitle;
	}
	public String getLectureDescription() {
		return lectureDescription;
	}
	public void setLectureDescription(String lectureDescription) {
		this.lectureDescription = lectureDescription;
	}
	public String getEventBelonging() {
		return eventBelonging;
	}
	public void setEventBelonging(String eventBelonging) {
		this.eventBelonging = eventBelonging;
	}
	
}
