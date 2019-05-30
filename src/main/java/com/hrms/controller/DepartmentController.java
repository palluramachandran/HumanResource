package com.hrms.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hrms.dao.DepartmentsDAO;
import com.hrms.model.Department;
import com.hrms.model.DepartmentEmpDetails;
import com.hrms.model.DepartmentSkills;
import com.hrms.model.EmployeeSkills;
import com.hrms.service.DepartmentsService;


@Controller
public class DepartmentController {

	public DepartmentsService departmentsService;

	@Autowired
	public void setDepartmentsService(DepartmentsService departmentsService)
	{
		this.departmentsService=departmentsService;
	}

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home()
	{
		return "redirect:analytics";
	}
	
	@RequestMapping(value="/analytics",method=RequestMethod.GET)
	public ModelAndView getAnalytics()
	{
		List<DepartmentEmpDetails> departmentEmpDetailsList=departmentsService.getDepartmentEmpDetails();
		ModelAndView model=new ModelAndView();
		model.addObject("departmentEmpDetailsList", departmentEmpDetailsList);
		model.setViewName("Analytics");
		return model;
	}

	@RequestMapping(value="/departmentEmpDetails",method=RequestMethod.GET,headers="Accept=application/json")
	public @ResponseBody List<DepartmentEmpDetails> getDepartmentEmpDetails()
	{
		List<DepartmentEmpDetails>	departmentEmpDetailsList=departmentsService.getDepartmentEmpDetails();
		//ModelAndView model=new ModelAndView();
		//model.addObject("departmentEmpDetailsList",departmentEmpDetailsList);
		//model.setViewName("DepartmentEmpDetails");
		//return model;
		return departmentEmpDetailsList;
	}

	@RequestMapping(value="/departmentEmpSalaryDetails",method=RequestMethod.GET,headers="Accept=application/json")
	public @ResponseBody List<DepartmentEmpDetails> getDepartmentEmpSalaryDetails()
	{
		List<DepartmentEmpDetails>	departmentEmpDetailsList=departmentsService.getDepartmentEmpDetails();
		ModelAndView model=new ModelAndView();
		model.addObject("departmentEmpDetailsList",departmentEmpDetailsList);
		model.setViewName("Analytics");
		
		return departmentEmpDetailsList;
	}

	@RequestMapping(value="/departmentSkills",method=RequestMethod.GET,headers="Accept=application/json")
	public @ResponseBody List<DepartmentSkills> getDepartmentSkills()
	{
		List<DepartmentSkills> departmentSkillList=departmentsService.getDepartmentSkills();
		//ModelAndView model=new ModelAndView();
		//model.addObject("departmentSkillList",departmentSkillList);
		//model.setViewName("DepartmentSkillCount");
		return departmentSkillList;
	}

	@RequestMapping(value="/departmentConfiguration",method=RequestMethod.GET)
	public ModelAndView getDepartments()
	{
		List<Department> departmentList=departmentsService.getDepartments();
		ModelAndView model=new ModelAndView();
		model.addObject("departmentList",departmentList);
		model.setViewName("DepartmentConfiguration");
		return model;
	}
	@RequestMapping(value="/editDepartment/{deptId}",method=RequestMethod.GET)
	public ModelAndView  editDepartment(@PathVariable int deptId) 
	{
		Department department=departmentsService.editDepartment(deptId);
		ModelAndView model=new ModelAndView();
		model.addObject("department",department);
		model.setViewName("UpdateDepartmentForm");
		return model;
	}

	@RequestMapping(value="/updateDepartment",method=RequestMethod.POST)
	public String updateDepartment(@ModelAttribute Department department)
	{
		departmentsService.updateDepartment(department);
		return "redirect:departmentConfiguration";
	}

	@RequestMapping(value="/deleteDepartment/{deptId}",method=RequestMethod.GET)
	public String deleteDepartment(@PathVariable int deptId)
	{
		departmentsService.deleteDepartment(deptId);
		return "redirect:/departmentConfiguration";
	}

	@RequestMapping(value="/addDepartment",method=RequestMethod.GET)
	public ModelAndView addDepartment(Department department)
	{
		ModelAndView model=new ModelAndView();
		//model.setViewName("AddDepartment");
		model.setViewName("DepartmentForm");
		Department departments=new Department();
		model.addObject("departments",departments);
		return model;
		
	}

	@RequestMapping(value="/submitDepartment",method=RequestMethod.POST)
	public String submitDepartment(@ModelAttribute Department department)
	{
		departmentsService.submitDepartment(department);
		return "redirect:departmentConfiguration";
	}


}
