package com.cs539.project.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cs539.project.BaseTest;
import com.cs539.project.entity.Instructor;

public class InstructorDaoTest extends BaseTest {
	@Autowired
	private InstructorDao instDao;
	
	@Test
	public void getAllInstrutorsTest() {
		List<Instructor> instList = instDao.getAllInstructors();
		for(Instructor instructor : instList) System.out.println(instructor.getId() + " " + instructor.getiName()  + " " + instructor.getDepartment().getdName()     );
	}
}
