package com.cs539.project.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs539.project.dao.DepartmentDao;
import com.cs539.project.dto.DepartmentDto;
import com.cs539.project.entity.Department;
import com.cs539.project.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public List<DepartmentDto> getAllDepartments() {
		List<Department> list = departmentDao.getDepartmentList();
		List<DepartmentDto> deptList = new ArrayList<>();
		
		for(Department dept: list) {
			DepartmentDto deptDto = new DepartmentDto(dept);
			deptList.add(deptDto);	
		}
		return deptList;
	}

}
