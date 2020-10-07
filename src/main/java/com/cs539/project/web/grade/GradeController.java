package com.cs539.project.web.grade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs539.project.dto.GradeDto;
import com.cs539.project.service.GradeService;

@Controller
@RequestMapping("/university")
public class GradeController {
	@Autowired
	private GradeService gradeService;
	
	@RequestMapping(value="/grades")
	private String listColleges() {
		System.out.println("/university/grades");
		return "grade/gradelist";
	}
	
	@RequestMapping(value="/grade/listallgrades", method = RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> listAllColleges() {
		System.out.println("hello");
		Map<String, Object> resMap = new HashMap<String, Object>();
		List<GradeDto> list = new ArrayList<>();
		try {
			list = gradeService.getAllSections();
			resMap.put("allGrades", list);
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
