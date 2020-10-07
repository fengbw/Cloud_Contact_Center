package com.cs539.project.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cs539.project.BaseTest;
import com.cs539.project.entity.College;

public class CollegeServiceTest extends BaseTest{
	@Autowired
	private CollegeService collegeService;
	
	@Test
	public void getAllCollegeServiceTest() {
		List<College> list = collegeService.getAllColleges();
		for(College c: list) System.out.println(c.getcName() + " Dean:" + c.getInstructor().getiName());
	}
	
}
