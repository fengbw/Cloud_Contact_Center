package com.cs539.project.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cs539.project.BaseTest;
import com.cs539.project.entity.Department;

public class DepartmentDaoTest extends BaseTest{
	@Autowired
	private DepartmentDao departmentDao;
	
	@Test
	public void testGetDeptList() {
		List<Department> deptList = departmentDao.getDepartmentList();
		
		for(Department dept: deptList) {
			System.out.println(dept.getcStartDate()+ " "+dept.getdName() + " " + dept.getdPhone() + " " + dept.getChair().getiName() + " " + dept.getCollege().getcName());
		}
	}
}
