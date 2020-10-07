package com.cs539.project.dao;

import java.util.List;

import com.cs539.project.entity.College;

public interface CollegeDao {
	/**
	 * Print All Colleges
	 * @return collegeList
	 */
	List<College> getAllColleges();
}
