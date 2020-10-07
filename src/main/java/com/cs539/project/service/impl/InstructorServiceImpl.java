package com.cs539.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs539.project.dao.InstructorDao;
import com.cs539.project.entity.Instructor;
import com.cs539.project.service.InstructorService;

@Service
public class InstructorServiceImpl implements InstructorService{
	@Autowired
	private InstructorDao instructorDao;
	
	@Override
	public List<Instructor> getAllInstructors() {
		// TODO Auto-generated method stub
		return instructorDao.getAllInstructors();
	}

}
