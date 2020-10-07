package com.cs539.project.entity;

public class Course {
	private Integer cCode;
	private String coName;
	private Integer credits;
	private String level;
	private String cDesc;
	private Department department;
	public Integer getcCode() {
		return cCode;
	}
	public void setcCode(Integer cCode) {
		this.cCode = cCode;
	}
	public String getCoName() {
		return coName;
	}
	public void setCoName(String coName) {
		this.coName = coName;
	}
	public Integer getCredits() {
		return credits;
	}
	public void setCredits(Integer credits) {
		this.credits = credits;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getcDesc() {
		return cDesc;
	}
	public void setcDesc(String cDesc) {
		this.cDesc = cDesc;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
