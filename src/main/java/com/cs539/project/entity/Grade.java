package com.cs539.project.entity;

public class Grade {
	private Integer gId;
	private Section section;
	private Student student;
	private String grade;
	public Section getSection() {
		return section;
	}
	public Integer getgId() {
		return gId;
	}
	public void setgId(Integer gId) {
		this.gId = gId;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
