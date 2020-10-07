package com.cs539.project.web.showdepartments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs539.project.dto.DepartmentDto;
import com.cs539.project.entity.College;
import com.cs539.project.service.DepartmentService;

@Controller
@RequestMapping("/university")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value="/departments")
	private String listColleges() {
		System.out.println("/university/departments");
		return "department/departmentlist";
	}
	
	@RequestMapping(value="/department/listalldepartments", method = RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> listAllDepartments() {
		System.out.println("hello");
		Map<String, Object> resMap = new HashMap<String, Object>();
		List<DepartmentDto> list = new ArrayList<DepartmentDto>();
		try {
			list = departmentService.getAllDepartments();
			resMap.put("allDepartment", list);
			resMap.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resMap.put("success", false);
			resMap.put("errMsg", e.toString());
		}
		return resMap;
	}
}
