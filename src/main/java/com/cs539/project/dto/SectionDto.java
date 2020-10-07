package com.cs539.project.dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


import com.cs539.project.entity.Section;

public class SectionDto {
	private Integer secId;
	private Integer secNo;
	private String  sem;
	private String  year;
	private String  roomNo;
	private String  bIdg;
	private String  course_name;
	private String teacher_name;
	private Integer credits;
	
	public SectionDto(Section sec) {
		this.secId = sec.getSecId();
		this.secNo = sec.getSecNo();
		this.sem   = sec.getSem();
		this.roomNo= sec.getRoomNo();
		this.bIdg  = sec.getbIdg();
		
		if(sec.getTeacher() != null) {
			this.teacher_name = sec.getTeacher().getiName();
		} else {
			this.teacher_name = "no specified";
		}
		
		if(sec.getCourse() != null) {
			this.course_name = sec.getCourse().getCoName();
			this.credits     = sec.getCourse().getCredits();
		} else {
			this.course_name = "";
			this.credits = null;
		}
		
		if(sec.getYear() != null) {
			DateFormat format = new SimpleDateFormat("yyyy");
			this.year = format.format(sec.getYear());
		} else {
			this.year = "Not Specified";
		}
	}
	
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
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
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public Integer getCredits() {
		return credits;
	}
	public void setCredits(Integer credits) {
		this.credits = credits;
	}
	
	
}
