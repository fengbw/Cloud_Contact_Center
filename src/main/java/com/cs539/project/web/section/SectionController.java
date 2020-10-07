package com.cs539.project.web.section;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs539.project.dto.SectionDto;
import com.cs539.project.entity.Course;
import com.cs539.project.service.SectionService;

@Controller
@RequestMapping("/university")
public class SectionController {
	@Autowired
	private SectionService sectionService;
	
	@RequestMapping(value="/sections")
	private String listColleges() {
		System.out.println("/university/sections");
		return "section/sectionlist";
	}
	
	@RequestMapping(value="/section/listallsections", method = RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> listAllColleges() {
		System.out.println("hello");
		Map<String, Object> resMap = new HashMap<String, Object>();
		List<SectionDto> list = new ArrayList<>();
		try {
			list = sectionService.getAllSection();
			resMap.put("allSections", list);
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
