package com.cs539.project.web.showcourses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs539.project.entity.College;
import com.cs539.project.entity.Course;
import com.cs539.project.service.CollegeService;
import com.cs539.project.service.CourseService;

@Controller
@RequestMapping("/university")
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/courses")
	private String listColleges() {
		System.out.println("/university/courses");
		return "course/courselist";
	}
	
	@RequestMapping(value="/course/listallcourses", method = RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> listAllColleges() {
		System.out.println("hello");
		Map<String, Object> resMap = new HashMap<String, Object>();
		List<Course> list = new ArrayList<Course>();
		try {
			list = courseService.getAllCourses();
			resMap.put("allCourses", list);
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
