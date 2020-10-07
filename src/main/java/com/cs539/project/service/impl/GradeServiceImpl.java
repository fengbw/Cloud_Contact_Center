package com.cs539.project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs539.project.dao.GradeDao;
import com.cs539.project.dto.GradeDto;
import com.cs539.project.entity.Grade;
import com.cs539.project.service.GradeService;

@Service
public class GradeServiceImpl implements GradeService {
	@Autowired
	private GradeDao gradeDao;
	@Override
	public List<GradeDto> getAllSections() {
		// TODO Auto-generated method stub
		List<Grade> list = gradeDao.getGradeList();
		List<GradeDto> gradeList = new ArrayList<>();
		for(Grade grade: list) {
			GradeDto gradeDto = new GradeDto(grade);
			gradeList.add(gradeDto);
		}
		return gradeList;
	}

}
