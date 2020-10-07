package com.cs539.project.dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.cs539.project.entity.College;
import com.cs539.project.entity.Department;
import com.cs539.project.entity.Instructor;

public class DepartmentDto {
	private String dName;
	private Integer dCode;
	private String dPhone;
	private String dOffice;
	private Instructor chair;
	private String cStartDate;
	private College college;
	
	public DepartmentDto(Department department) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		this.dName = department.getdName();
		this.dCode = department.getdCode();
		this.dPhone = department.getdPhone();
		this.dOffice = department.getdOffice();
		this.chair = department.getChair();
		this.college = department.getCollege();
		
		if(department.getcStartDate() != null) this.cStartDate = format.format(department.getcStartDate());
		else this.cStartDate = null;
	}

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

	public String getcStartDate() {
		return cStartDate;
	}

	public void setcStartDate(String cStartDate) {
		this.cStartDate = cStartDate;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	
}
