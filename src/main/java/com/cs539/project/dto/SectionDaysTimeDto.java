package com.cs539.project.dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cs539.project.entity.Section;
import com.cs539.project.entity.SectionDaysTime;

public class SectionDaysTimeDto {
	private Integer sd_id;
	private Integer sect_id;
	private List<String> days_time;
	private String startTime;
	private String endTime;
	
	public SectionDaysTimeDto(SectionDaysTime sd) {
		this.sd_id = sd.getSd_id();
		this.days_time = new ArrayList<>();
		this.sect_id = sd.getSection().getSecId();
		DateFormat format = new SimpleDateFormat("HH:mm");
		this.startTime = format.format(sd.getStartTime());
		this.endTime	= format.format(sd.getEndTime());
		if(sd.getMon() != 0) days_time.add("Mon");
		if(sd.getTue() != 0) days_time.add("Tue");
		if(sd.getWed() != 0) days_time.add("Wed");
		if(sd.getThu() != 0) days_time.add("Thu");
		if(sd.getFri() != 0) days_time.add("Fri");
		if(sd.getSat() != 0) days_time.add("Sat");
		if(sd.getSun() != 0) days_time.add("Sun");
	}

	public Integer getSd_id() {
		return sd_id;
	}

	public void setSd_id(Integer sd_id) {
		this.sd_id = sd_id;
	}

	public Integer getSect_id() {
		return sect_id;
	}

	public void setSect_id(Integer sect_id) {
		this.sect_id = sect_id;
	}

	public List<String> getDays_time() {
		return days_time;
	}

	public void setDays_time(List<String> days_time) {
		this.days_time = days_time;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	
}
