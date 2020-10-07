package com.cs539.project.dao;

import java.util.List;

import com.cs539.project.entity.Instructor;

public interface InstructorDao {
	/**
	 * get all instructors
	 * @return instructorList
	 */
	List<Instructor> getAllInstructors();
}
