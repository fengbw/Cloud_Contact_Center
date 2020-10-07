package com.cs539.project.web.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs539.project.dto.StudentDto;
import com.cs539.project.service.StudentService;

@Controller
@RequestMapping("/university")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/students")
	private String listColleges() {
		System.out.println("/university/students");
		return "student/studentlist";
	}
	
	@RequestMapping(value="/student/listallstudents", method = RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> listAllColleges() {
		System.out.println("hello");
		Map<String, Object> resMap = new HashMap<String, Object>();
		List<StudentDto> list = new ArrayList<>();
		try {
			list = studentService.getStudentList();
			resMap.put("allColleges", list);
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
