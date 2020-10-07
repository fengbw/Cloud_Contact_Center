package com.cs539.project.web.instructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.cs539.project.entity.Instructor;
import com.cs539.project.service.InstructorService;

@Controller
@RequestMapping("/university")
public class InstructorController {
	@Autowired
	private InstructorService instructorService;
	
	@RequestMapping(value="/instructors")
	private String listColleges() {
		System.out.println("/university/departments");
		return "instructor/instructorlist";
	}
	
	@RequestMapping(value="/instructor/listallinstructors", method = RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> listAllColleges() {
		System.out.println("hello instructors");
		Map<String, Object> resMap = new HashMap<String, Object>();
		List<Instructor> list = new ArrayList<>();
		try {
			list = instructorService.getAllInstructors();
			resMap.put("allInstructors", list);
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
