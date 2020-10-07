package com.cs539.project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs539.project.dao.StudentDao;
import com.cs539.project.dto.StudentDto;
import com.cs539.project.entity.Student;
import com.cs539.project.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentDao;

	@Override
	public List<StudentDto> getStudentList() {
		// TODO Auto-generated method stub
		List<Student> list = studentDao.getStudentList();
		List<StudentDto> stuList = new ArrayList<>();
		for(Student stu: list) {
			StudentDto studentDto = new StudentDto(stu);
			stuList.add(studentDto);
		}
		return stuList;
	}
	
	
}
