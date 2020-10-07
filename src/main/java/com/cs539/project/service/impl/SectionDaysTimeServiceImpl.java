package com.cs539.project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs539.project.dao.SectionDaysTimeDao;
import com.cs539.project.dto.SectionDaysTimeDto;
import com.cs539.project.entity.SectionDaysTime;
import com.cs539.project.service.SectionDaysTimeService;

@Service
public class SectionDaysTimeServiceImpl implements SectionDaysTimeService {
	@Autowired
	private SectionDaysTimeDao sectionDaysTimeDao;
	
	@Override
	public List<SectionDaysTimeDto> getAllSectionDaysTimes() {
		// TODO Auto-generated method stub
		List<SectionDaysTime> list = sectionDaysTimeDao.getSecDaysTimeList();
		List<SectionDaysTimeDto> sd_list = new ArrayList<>();
		for(SectionDaysTime sd: list) {
			SectionDaysTimeDto sdDto = new SectionDaysTimeDto(sd);
			sd_list.add(sdDto);
		}
		return sd_list;
	}

}
