package com.cs539.project.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cs539.project.BaseTest;
import com.cs539.project.entity.Course;

public class CourseDaoTest extends BaseTest {
	@Autowired
	private CourseDao courseDao;
	
	@Test
	public void testGetAllCourses() {
		List<Course> courseList = courseDao.getAllCourses();
		for(Course course : courseList) {
			System.out.println(course.getCoName() + " " + course.getCredits() + " " + course.getDepartment().getdName());
		}
	}
}
