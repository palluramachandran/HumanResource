package com.hrms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hrms.model.Template;

@Controller
public class TemplateController {

	@RequestMapping("/addTemplate")
	public ModelAndView addTemplate() {
		ModelAndView model = new ModelAndView();
		model.setViewName("TemplateForm");
		Template template = new Template();
		model.addObject("template", template);
		List<String> timeList = new ArrayList<>();
		timeList.add("00:00");
		timeList.add("00:30");
		timeList.add("01:00");
		timeList.add("01:30");
		model.addObject("timeList", timeList);
		return model;
		
	}
	
}
