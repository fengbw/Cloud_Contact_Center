package com.cs539.project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs539.project.dao.SectionDao;
import com.cs539.project.dto.SectionDto;
import com.cs539.project.entity.Section;
import com.cs539.project.service.SectionService;

@Service
public class SectionServiceImpl implements SectionService {
	@Autowired
	private SectionDao sectionDao;
	
	@Override
	public List<SectionDto> getAllSection() {
		// TODO Auto-generated method stub
		List<Section> list = sectionDao.getSectionList();
		List<SectionDto> secList = new ArrayList<>();
		for(Section sec: list) {
			SectionDto sectionDto = new SectionDto(sec);
			secList.add(sectionDto);
		}
		return secList;
	}

}
