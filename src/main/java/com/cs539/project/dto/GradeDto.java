package com.cs539.project.dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.cs539.project.entity.Grade;
import com.cs539.project.entity.Section;
import com.cs539.project.entity.Student;

public class GradeDto {
	private Integer gId;
	private String sec_year;
	private String sec_sem;
	private Integer sec_id;
	private Integer sec_no;
	private Integer student_id;
	private String student_name;
	private String grade;
	
	public GradeDto(Grade grade) {
		this.gId = grade.getgId();
		this.grade = grade.getGrade();
		
		if(grade.getStudent() != null) {
			String name = "";
			if(grade.getStudent().getfName() != null) name += grade.getStudent().getfName();
			if(grade.getStudent().getmName() != null) name += " " + grade.getStudent().getmName();
			if(grade.getStudent().getlName() != null) name += " " + grade.getStudent().getlName();
			this.student_name = name;
			this.setStudent_id(grade.getStudent().getsId());
		} else {
			this.student_name = "";
		}
		
		if(grade.getSection() != null) {
			DateFormat format = new SimpleDateFormat("yyyy");
			this.sec_year = format.format(grade.getSection().getYear());
			this.sec_sem  = grade.getSection().getSem();
			this.sec_no   = grade.getSection().getSecNo();
			this.setSec_id(grade.getSection().getSecId());
		}
	}
	
	public Integer getgId() {
		return gId;
	}
	public void setgId(Integer gId) {
		this.gId = gId;
	}
	public String getSec_year() {
		return sec_year;
	}
	public void setSec_year(String sec_year) {
		this.sec_year = sec_year;
	}
	public String getSec_sem() {
		return sec_sem;
	}
	public void setSec_sem(String sec_sem) {
		this.sec_sem = sec_sem;
	}
	
	public Integer getSec_no() {
		return sec_no;
	}

	public void setSec_no(Integer sec_no) {
		this.sec_no = sec_no;
	}

	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Integer getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	public Integer getSec_id() {
		return sec_id;
	}

	public void setSec_id(Integer sec_id) {
		this.sec_id = sec_id;
	}
	
	
}
