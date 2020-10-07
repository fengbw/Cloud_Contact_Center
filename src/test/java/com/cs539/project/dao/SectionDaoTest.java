package com.cs539.project.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cs539.project.BaseTest;
import com.cs539.project.entity.Section;


public class SectionDaoTest extends BaseTest{
	@Autowired
	private SectionDao sectionDao;
	
	@Test
	public void testGetSecList() {
		List<Section> list = sectionDao.getSectionList();
		
		for(Section sec: list) {
			DateFormat format = new SimpleDateFormat("yyyy");
			String year = format.format(sec.getYear());
			try {
				System.out.println(sec.getSecNo() + " " + year + " " + sec.getCourse().getCoName()+" "+sec.getTeacher().getiName());
			} catch(Exception e) {
				
			}
			
		}
	}
}
