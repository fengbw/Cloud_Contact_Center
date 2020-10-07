package com.cs539.project.entity;

public class College {
	// Name
	private String cName;
	// Phone
	private String cPhone;
	// Office
	private String cOffice;
	// Instructor
	private Instructor dean;
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcPhone() {
		return cPhone;
	}
	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}
	public String getcOffice() {
		return cOffice;
	}
	public void setcOffice(String cOffice) {
		this.cOffice = cOffice;
	}
	public Instructor getInstructor() {
		return dean;
	}
	public void setInstructor(Instructor dean) {
		this.dean = dean;
	}
	
}
