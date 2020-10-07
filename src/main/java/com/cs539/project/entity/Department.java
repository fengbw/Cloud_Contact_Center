package com.cs539.project.entity;

import java.util.Date;

public class Department {
	private String dName;
	private Integer dCode;
	private String dPhone;
	private String dOffice;
	private Instructor chair;
	private Date cStartDate;
	private College college;
	
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public Integer getdCode() {
		return dCode;
	}
	public void setdCode(Integer dCode) {
		this.dCode = dCode;
	}
	public String getdPhone() {
		return dPhone;
	}
	public void setdPhone(String dPhone) {
		this.dPhone = dPhone;
	}
	public String getdOffice() {
		return dOffice;
	}
	public void setdOffice(String dOffice) {
		this.dOffice = dOffice;
	}
	public Instructor getChair() {
		return chair;
	}
	public void setChair(Instructor chair) {
		this.chair = chair;
	}
	public Date getcStartDate() {
		return cStartDate;
	}
	public void setcStartDate(Date cStartDate) {
		this.cStartDate = cStartDate;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	
	
}
