package com.cs539.project.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cs539.project.BaseTest;
import com.cs539.project.entity.College;

public class CollegeDaoTest extends BaseTest {
	@Autowired
	private CollegeDao collegeDao;
	
	@Test
	public void testGetAllColleges() {
		List<College> collegList = collegeDao.getAllColleges();
		System.out.println(collegList.size());
//		for(College c: collegList) {
//			System.out.println(c.getInstructor().getId());
//		}
		for(College college : collegList) System.out.println(college.getcName() + " " +college.getInstructor().getiName());
	}
}
