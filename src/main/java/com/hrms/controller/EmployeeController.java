package com.hrms.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hrms.model.Employee;
import com.hrms.model.EmployeeSkills;
import com.hrms.service.DepartmentsService;
import com.hrms.service.EmployeeService;

/**
 * All employee specific mappings
 * @author Pallavi
 *
 */
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
	
	
	/**
	 * Employee skill chart json data 
	 * @return
	 */

	@RequestMapping(value="/employeeSkills",method=RequestMethod.GET,headers="Accept=application/json")
	public @ResponseBody List<EmployeeSkills> getEmployeeSkills()
	{
		List<EmployeeSkills> empSkillList=employeeService.getEmployeeSkills();
		return empSkillList;
	}
	
	/**
	 * Employee details table
	 * @return
	 */
	@RequestMapping(value="/employeeConfiguration",method=RequestMethod.GET)
	public ModelAndView getEmployees()
	{
		List<Employee> employee=employeeService.getEmployees();
		ModelAndView model=new ModelAndView();
		model.addObject("employee", employee);
		model.setViewName("EmployeeConfiguration");
		return model;
		
	}

	/**
	 * Edit employee 
	 * @return
	 */
	@RequestMapping(value="/editEmployee",method=RequestMethod.GET)
	public ModelAndView editEmployee(HttpServletRequest request)
	{
		int empId=Integer.parseInt(request.getParameter("empId"));
		Employee employee=employeeService.editEmployee(empId);
		ModelAndView model=new ModelAndView();
		model.addObject("employee", employee);
		Map<Integer,String> departmentMap=departmentsService.getDepartmentMap();
		model.addObject("departments", departmentMap);
		model.setViewName("UpdateEmployeeForm");
		return model;
	}
	
	/**
	 * Update employee
	 * @return
	 */

	@RequestMapping(value="/updateEmployee",method=RequestMethod.POST)
	public String updateEmployee(@ModelAttribute Employee employee)
	{
		employeeService.updateEmployee(employee);
		return "redirect:employeeConfiguration";
	}

	
	/**
	 * Delete employee
	 * @return
	 */
	@RequestMapping(value="/deleteEmployee",method=RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request)
	{
		int empId=Integer.parseInt(request.getParameter("empId"));
		employeeService.deleteEmployee(empId);
		List<Employee> employee=employeeService.getEmployees();
		ModelAndView model=new ModelAndView();
		model.addObject("deleteMsg", "employee deleted Successfully");
		model.addObject("employee", employee);
		model.setViewName("EmployeeConfiguration");
		return model;
		//return "redirect:/employeeConfiguration";

	}
	
	/**
	 * Add employee
	 * @return
	 */
	@RequestMapping(value="/addEmployee",method=RequestMethod.GET)
	public ModelAndView addEmployee()
	{
		ModelAndView model=new ModelAndView();
		model.setViewName("EmployeeForm");
		Map<Integer,String> departmentMap=departmentsService.getDepartmentMap();
		model.addObject("departments", departmentMap);
		Employee employee=new Employee();
		model.addObject("employee",employee);
		return model;

	}

	/**
	 * Submit employee 
	 * @return
	 */
	@RequestMapping(value="/submitEmployee",method=RequestMethod.POST)
	public ModelAndView submitEmployee(@Validated @ModelAttribute Employee employee,BindingResult bindingresult) 
	{
		if(bindingresult.hasErrors())
		{
			ModelAndView model=new ModelAndView();
			model.setViewName("EmployeeForm");
			Map<Integer,String> departmentMap=departmentsService.getDepartmentMap();
			model.addObject("departments", departmentMap);
			//model.addObject("employee",employee);
			return model;
		}
		employeeService.submitEmployee(employee);
		List<Employee> employees=employeeService.getEmployees();
		ModelAndView model=new ModelAndView();
		model.addObject("employee", employees);
		model.addObject("addMsg","employee added successfully");
		model.setViewName("EmployeeConfiguration");
		return model;
		
		//return new ModelAndView("redirect:employeeConfiguration");
	}
	
	
}
