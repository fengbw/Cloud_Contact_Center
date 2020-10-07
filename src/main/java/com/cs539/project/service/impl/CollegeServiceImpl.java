package com.cs539.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs539.project.dao.CollegeDao;
import com.cs539.project.entity.College;
import com.cs539.project.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService{
	@Autowired
	private CollegeDao collegeDao;
	
	@Override
	public List<College> getAllColleges() {
		List<College> collegeList = collegeDao.getAllColleges();
		return collegeList;
	}
	
}
