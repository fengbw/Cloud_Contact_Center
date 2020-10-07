package com.cs539.project.entity;

public class Instructor {
	private Integer id;
	private Integer rank;
	private String iName;
	private String iOffice;
	private String iPhone;
	private Department department;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getiName() {
		return iName;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}
	public String getiOffice() {
		return iOffice;
	}
	public void setiOffice(String iOffice) {
		this.iOffice = iOffice;
	}
	public String getiPhone() {
		return iPhone;
	}
	public void setiPhone(String iPhone) {
		this.iPhone = iPhone;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
