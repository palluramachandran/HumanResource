package com.hrms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hrms.model.Employee;
import com.hrms.model.Template;
import com.hrms.service.TemplateService;

@Controller
public class TemplateController {
	public TemplateService templateService;
	@Autowired
	public void setTemplateService(TemplateService templateService)
	{
		this.templateService=templateService;
	}
	@Autowired
	@Qualifier("templateValidator")
	private Validator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	@RequestMapping("/getTemplate")
	public ModelAndView getTemplate() {
		ModelAndView model = new ModelAndView();
		model.setViewName("TemplateConfiguration");
		List<Template> templates = templateService.getTemplates();
		model.addObject("templates",templates);
		return model;
		
	}

	@RequestMapping("/addTemplate")
	public ModelAndView addTemplate() {
		ModelAndView model = new ModelAndView();
		model.setViewName("TemplateForm");
		Template template = new Template();
		model.addObject("template", template);
		
		
		model.addObject("timeList",getTimeList());
		return model;
		
	}
	
	@RequestMapping("/submitTemplate")
	public ModelAndView submitTemplate(@Valid @ModelAttribute Template template,BindingResult bindingresult ) {
		if(bindingresult.hasErrors())
		{
			ModelAndView model=new ModelAndView();
			model.addObject("timeList",getTimeList());
			model.setViewName("TemplateForm");
			return model;
		}
		templateService.submitTemplate(template);
		List<Template> templates=templateService.getTemplates();
		ModelAndView model=new ModelAndView();
		model.addObject("templates", templates);
		model.addObject("addMsg","Template Succesfully added");
		model.setViewName("TemplateConfiguration");
		return model;
		
	}
	@RequestMapping(value="/editTemplate",method=RequestMethod.GET)
	public ModelAndView editTemplate(HttpServletRequest request)
	{
		
		int id=Integer.parseInt(request.getParameter("id"));
		Template template=templateService.editTemplate(id);
		ModelAndView model=new ModelAndView();
		model.addObject("template", template);
		model.addObject("timeList",getTimeList());
		model.setViewName("EditTemplate");
		return model;
	}
	public List<String> getTimeList(){
		List<String> timeList = new ArrayList<>();
		timeList.add("00:00");
		timeList.add("00:30");
		timeList.add("01:00");
		timeList.add("01:30");
		timeList.add("02:00");
		timeList.add("02:30");
		timeList.add("03:00");
		timeList.add("03:30");
		timeList.add("04:00");
		timeList.add("04:30");
		timeList.add("05:00");
		timeList.add("05:30");
		timeList.add("06:00");
		timeList.add("06:30");
		timeList.add("07:00");
		timeList.add("07:30");
		timeList.add("08:00");
		timeList.add("08:30");
		timeList.add("09:00");
		timeList.add("09:30");
		timeList.add("10:00");
		timeList.add("10:30");
		return timeList;
		
	}
	@RequestMapping(value="/updateTemplate",method=RequestMethod.POST)
	public ModelAndView updateTemplate(@Valid @ModelAttribute Template template,BindingResult bindingresult )
	{
		if(bindingresult.hasErrors())
		{
			ModelAndView model=new ModelAndView();
			model.addObject("timeList",getTimeList());
			model.setViewName("TemplateForm");
			return model;
		}
		templateService.updateTemplate(template);
		ModelAndView model=new ModelAndView();
		List<Template> templates=templateService.getTemplates();
		model.addObject("templates",templates);
		model.setViewName("TemplateConfiguration");
		return model;
		
	}
	@RequestMapping(value="/deleteTemplate",method=RequestMethod.GET)
	public ModelAndView deleteTemplate(HttpServletRequest request)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		templateService.deleteTemplate(id);
		
		ModelAndView model=new ModelAndView();
		List<Template> templates=templateService.getTemplates();
		model.addObject("deleteMsg", "employee deleted Successfully");
		model.addObject("templates",templates);
		model.setViewName("TemplateConfiguration");
		return model;
	
	
}
}
