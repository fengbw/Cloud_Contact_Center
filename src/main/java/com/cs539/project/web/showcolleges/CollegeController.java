package com.cs539.project.web.showcolleges;

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
import com.cs539.project.service.CollegeService;

@Controller
@RequestMapping("/university")
public class CollegeController {
	@Autowired
	private CollegeService collegeService;
	
	@RequestMapping(value="/colleges")
	private String listColleges() {
		System.out.println("/university/colleges");
		return "college/collegelist";
	}
	
	@RequestMapping(value="/colleges/listallcolleges", method = RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> listAllColleges() {
		System.out.println("hello");
		Map<String, Object> resMap = new HashMap<String, Object>();
		List<College> list = new ArrayList<College>();
		try {
			list = collegeService.getAllColleges();
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
