package com.hrms.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hrms.model.Department;
import com.hrms.model.Employee;
import com.hrms.model.EmployeeSkills;
import com.hrms.service.DepartmentsService;
import com.hrms.service.EmployeeService;
@Controller
public class EmployeeController {

	public EmployeeService employeeService;
	public DepartmentsService departmentsService;
	

	@Autowired
	public void setEmployeeService(EmployeeService employeeService)
	{
		this.employeeService=employeeService;
	}
	@Autowired
	public void setDepartmentsService(DepartmentsService departmentsService)
	{
		this.departmentsService=departmentsService;
	}
	
	

	@RequestMapping(value="/employeeSkills",method=RequestMethod.GET)
	public ModelAndView getEmployeeSkills()
	{
		List<EmployeeSkills> empSkillList=employeeService.getEmployeeSkills();
		ModelAndView model=new ModelAndView();
		model.addObject("empSkillList",empSkillList);
		model.setViewName("EmployeeSkillCount");
		return model;
	}

	@RequestMapping(value="/employees",method=RequestMethod.GET)
	public ModelAndView getEmployees()
	{
		List<Employee> employee=employeeService.getEmployees();
		ModelAndView model=new ModelAndView();
		model.addObject("employee", employee);
		model.setViewName("EmployeeTable");
		return model;
		
	}


	@RequestMapping(value="/editEmployee/{empId}",method=RequestMethod.GET)
	public ModelAndView editEmployee(@PathVariable int empId)
	{
		Employee employee=employeeService.editEmployee(empId);
		ModelAndView model=new ModelAndView();
		model.addObject("employee", employee);
		model.setViewName("EditEmployee");
		return model;
	}

	@RequestMapping(value="/updateEmployee",method=RequestMethod.POST)
	public String updateEmployee(@ModelAttribute Employee employee)
	{
		employeeService.updateEmployee(employee);
		return "redirect:employees";
	}

	@RequestMapping(value="/deleteEmployee/{empId}",method=RequestMethod.GET)
	public String deleteEmployee(@PathVariable int empId)
	{
		employeeService.deleteEmployee(empId);
		return "redirect:/employees";

	}

	@RequestMapping(value="/addEmployee",method=RequestMethod.GET)
	public ModelAndView addEmployee(Employee employee)
	{
		ModelAndView model=new ModelAndView();
		model.setViewName("AddEmployee");
		Map<Integer,String> departmentMap=departmentsService.getDepartmentMap();
		model.addObject("departments", departmentMap);
		Employee employees=new Employee();
		model.addObject("employees",employees);
		return model;

	}

	@RequestMapping(value="/submitEmployee",method=RequestMethod.POST)
	public String submitEmployee(@ModelAttribute Employee employee) 
	{
		employeeService.submitEmployee(employee);
		return "redirect:employees";
	}
}
