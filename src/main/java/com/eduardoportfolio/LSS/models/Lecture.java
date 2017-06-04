package com.eduardoportfolio.LSS.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

//Indicates that the class have to be represented by a table in DB.
@Entity
public class Lecture {
	
	//Indicates that the attribute is a primary key.
	@Id
	//Indicates how the primary key will be generated.
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private Integer lectureId;
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
	public Integer getLectureId() {
		return lectureId;
	}
	
}
