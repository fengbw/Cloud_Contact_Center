package com.cs539.project.dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.cs539.project.entity.Student;

public class StudentDto {
	private Integer sId;
	private String fName;
	private String mName;
	private String lName;
	private String addr;
	private String phone;
	private String major;
	private String dob;
	private String department;
	
	public StudentDto(Student stu) {
		this.sId = stu.getsId();
		this.fName = stu.getfName();
		this.mName = stu.getmName();
		this.lName = stu.getlName();
		this.addr = stu.getAddr();
		this.phone = stu.getPhone();
		this.major = stu.getMajor();
		
		if(stu.getDob() != null) {
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			this.dob = format.format(stu.getDob());
		} else {
			this.dob = "";
		}
		
		if(stu.getDepartment() != null) {
			this.department = stu.getDepartment().getdName();
		} else {
			this.department = "unspecified";
		}
	}
	
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
