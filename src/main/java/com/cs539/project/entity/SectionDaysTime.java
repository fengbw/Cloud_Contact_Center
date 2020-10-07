package com.cs539.project.entity;

import java.util.Date;

public class SectionDaysTime {
	private Integer sd_id;
	private Section section;
	private Integer mon;
	private Integer tue;
	private Integer wed;
	private Integer thu;
	private Integer fri;
	private Integer sat;
	private Integer sun;
	private Date startTime;
	private Date endTime;
	public Integer getSd_id() {
		return sd_id;
	}
	public void setSd_id(Integer sd_id) {
		this.sd_id = sd_id;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	public Integer getMon() {
		return mon;
	}
	public void setMon(Integer mon) {
		this.mon = mon;
	}
	public Integer getTue() {
		return tue;
	}
	public void setTue(Integer tue) {
		this.tue = tue;
	}
	public Integer getWed() {
		return wed;
	}
	public void setWed(Integer wed) {
		this.wed = wed;
	}
	public Integer getThu() {
		return thu;
	}
	public void setThu(Integer thu) {
		this.thu = thu;
	}
	public Integer getFri() {
		return fri;
	}
	public void setFri(Integer fri) {
		this.fri = fri;
	}
	public Integer getSat() {
		return sat;
	}
	public void setSat(Integer sat) {
		this.sat = sat;
	}
	public Integer getSun() {
		return sun;
	}
	public void setSun(Integer sun) {
		this.sun = sun;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
}
