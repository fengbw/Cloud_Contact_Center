package com.cs539.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs539.project.dao.CourseDao;
import com.cs539.project.entity.Course;
import com.cs539.project.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getAllCourses() {
		return courseDao.getAllCourses();
	}

}
