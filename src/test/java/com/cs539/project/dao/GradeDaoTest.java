package com.cs539.project.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cs539.project.BaseTest;
import com.cs539.project.entity.Grade;

public class GradeDaoTest extends BaseTest{
	@Autowired
	private GradeDao gradeDao;
	
	@Test
	public void testGetGradeList() {
		List<Grade> list = gradeDao.getGradeList();
		
		for(Grade grade: list) {
			System.out.println(grade.getGrade() + " " + grade.getStudent().getfName() + " " + grade.getSection().getSem());
		}
	}
}
