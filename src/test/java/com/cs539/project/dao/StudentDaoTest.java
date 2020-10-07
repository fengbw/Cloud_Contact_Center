package com.cs539.project.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cs539.project.BaseTest;
import com.cs539.project.entity.Student;

public class StudentDaoTest extends BaseTest{
	
	@Autowired
	private StudentDao stuDao;
	
	@Test
	public void testGetStuList() {
		List<Student> stuList = stuDao.getStudentList();
		
		for(Student stu: stuList) {
			System.out.println(stu.getlName() + " " + stu.getDob() + " " + stu.getDepartment().getdName());
		}
	}
}
