package com.eduardo.LSS.models;

public class Lecture {
	
	private Integer lectureId;
	private String lecturerName;
	private String lectureTitle;
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
