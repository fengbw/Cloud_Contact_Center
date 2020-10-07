package com.cs539.project.dao;

import java.util.List;

import com.cs539.project.entity.Course;;

public interface CourseDao {
	/**
	 * Print All Colleges
	 * @return collegeList
	 */
	List<Course> getAllCourses();
}
