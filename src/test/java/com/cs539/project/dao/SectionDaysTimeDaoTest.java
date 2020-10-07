package com.cs539.project.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cs539.project.BaseTest;
import com.cs539.project.entity.SectionDaysTime;

public class SectionDaysTimeDaoTest extends BaseTest{
	@Autowired
	private SectionDaysTimeDao sectionDaysTimeDao;
	
	@Test
	public void testGetAllSecDaysList() {
		List<SectionDaysTime> list = sectionDaysTimeDao.getSecDaysTimeList();
		
		for(SectionDaysTime sd: list) {
			System.out.println(sd.getMon() + " "+sd.getTue()+sd.getWed()+sd.getThu()+sd.getFri()+sd.getSection().getSecId());
		}
	}
}
