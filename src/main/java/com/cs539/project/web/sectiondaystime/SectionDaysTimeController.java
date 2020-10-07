package com.cs539.project.web.sectiondaystime;

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
import com.cs539.project.dto.SectionDaysTimeDto;
import com.cs539.project.service.SectionDaysTimeService;

@Controller
@RequestMapping("/university")
public class SectionDaysTimeController {
	@Autowired
	private SectionDaysTimeService sdService;
	
	@RequestMapping(value="/sectiondaystimes")
	private String listColleges() {
		System.out.println("/university/sectiondaystimes");
		return "sectiondaystime/sectiondaystimelist";
	}
	
	@RequestMapping(value="/sectiondaystime/listallsectiondaystimes", method = RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> listAllColleges() {
		System.out.println("hello");
		Map<String, Object> resMap = new HashMap<String, Object>();
		List<SectionDaysTimeDto> list = new ArrayList<>();
		try {
			list = sdService.getAllSectionDaysTimes();
			resMap.put("allSectionDaysTimes", list);
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
