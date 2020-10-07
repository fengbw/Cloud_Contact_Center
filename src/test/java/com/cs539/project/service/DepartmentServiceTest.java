package com.cs539.project.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cs539.project.BaseTest;
import com.cs539.project.dto.DepartmentDto;

public class DepartmentServiceTest extends BaseTest{
	@Autowired
	private DepartmentService departmentService;
	
	@Test
	public void testDeptDtoList() {
		List<DepartmentDto> list = departmentService.getAllDepartments();
		for(DepartmentDto d: list) {
			System.out.println(d.getcStartDate());
		}
	}
}
