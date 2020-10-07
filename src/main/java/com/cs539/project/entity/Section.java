package com.cs539.project.entity;

import java.util.Date;

public class Section {
	private Integer secId;
	private Integer secNo;
	private String  sem;
	private Date    year;
	private String  roomNo;
	private String  bIdg;
	private Course  course;
	private Instructor teacher;
	public Integer getSecId() {
		return secId;
	}
	public void setSecId(Integer secId) {
		this.secId = secId;
	}
	public Integer getSecNo() {
		return secNo;
	}
	public void setSecNo(Integer secNo) {
		this.secNo = secNo;
	}
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getbIdg() {
		return bIdg;
	}
	public void setbIdg(String bIdg) {
		this.bIdg = bIdg;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Instructor getTeacher() {
		return teacher;
	}
	public void setTeacher(Instructor teacher) {
		this.teacher = teacher;
	}
	
	
}
