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

import com.hrms.model.Department;
import com.hrms.model.DepartmentEmpDetails;
import com.hrms.model.DepartmentSkills;
import com.hrms.service.DepartmentsService;

/**
 * All Department specific mappings
 * @author Pallavi
 *
 */
@Controller
public class DepartmentController {

	public DepartmentsService departmentsService;

	@Autowired
	public void setDepartmentsService(DepartmentsService departmentsService)
	{
		this.departmentsService=departmentsService;
	}

	/**
	 * Mapping the default url
	 * @return
	 */
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home()
	{
		return "redirect:analytics";
	}
	
	
	/**
	 * Mapping analytics 
	 * @return
	 */
	@RequestMapping(value="/analytics",method=RequestMethod.GET)
	public ModelAndView getAnalytics()
	{
		List<DepartmentEmpDetails> departmentEmpDetailsList=departmentsService.getDepartmentEmpDetails();
		ModelAndView model=new ModelAndView();
		model.addObject("departmentEmpDetailsList", departmentEmpDetailsList);
		model.setViewName("Analytics");
		return model;
	}

	/**
	 * Department overview chart json data 
	 * @return
	 */
	@RequestMapping(value="/departmentEmpDetails",method=RequestMethod.GET,headers="Accept=application/json")
	public @ResponseBody List<DepartmentEmpDetails> getDepartmentEmpDetails()
	{
		List<DepartmentEmpDetails>	departmentEmpDetailsList=departmentsService.getDepartmentEmpDetails();
		return departmentEmpDetailsList;
	}
	
	/**
	 * Department salary chart json data 
	 * @return
	 */

	@RequestMapping(value="/departmentEmpSalaryDetails",method=RequestMethod.GET,headers="Accept=application/json")
	public @ResponseBody List<DepartmentEmpDetails> getDepartmentEmpSalaryDetails()
	{
		List<DepartmentEmpDetails>	departmentEmpDetailsList=departmentsService.getDepartmentEmpDetails();
		ModelAndView model=new ModelAndView();
		model.addObject("departmentEmpDetailsList",departmentEmpDetailsList);
		model.setViewName("Analytics");
		
		return departmentEmpDetailsList;
	}

	/**
	 * Department skills chart json data 
	 * @return
	 */
	@RequestMapping(value="/departmentSkills",method=RequestMethod.GET,headers="Accept=application/json")
	public @ResponseBody List<DepartmentSkills> getDepartmentSkills()
	{
		List<DepartmentSkills> departmentSkillList=departmentsService.getDepartmentSkills();
		return departmentSkillList;
	}

	/**
	 * Department details table 
	 * @return
	 */
	@RequestMapping(value="/departmentConfiguration",method=RequestMethod.GET)
	public ModelAndView getDepartments()
	{
		List<Department> departmentList=departmentsService.getDepartments();
		ModelAndView model=new ModelAndView();
		model.addObject("departmentList",departmentList);
		model.setViewName("DepartmentConfiguration");
		return model;
	}
	
	/**
	 * Edit department
	 * @return
	 */
	@RequestMapping(value="/editDepartment",method=RequestMethod.GET)
	public ModelAndView editDepartment(HttpServletRequest request)
	{
		int deptId=Integer.parseInt(request.getParameter("deptId"));
		
		ModelAndView model=new ModelAndView();
		model.setViewName("UpdateDepartmentForm");
		Department departments=departmentsService.editDepartment(deptId);
		model.addObject("department",departments);
		return model;
		
	}
	/**
	 * Update department
	 * @return
	 */

	@RequestMapping(value="/updateDepartment",method=RequestMethod.POST)
	public String updateDepartment(@ModelAttribute Department department)
	{
		
		departmentsService.updateDepartment(department);
		return "redirect:departmentConfiguration";
	}

	/**
	 * Delete department
	 * @return
	 */
	@RequestMapping(value="/deleteDepartment",method=RequestMethod.GET)
	public ModelAndView deleteDepartment(HttpServletRequest request)
	{
		int deptId=Integer.parseInt(request.getParameter("deptId"));
		boolean isDeleted = departmentsService.deleteDepartment(deptId);
		List<Department> departmentList=departmentsService.getDepartments();
		ModelAndView model=new ModelAndView();
		model.addObject("departmentList", departmentList);
		
		if(isDeleted) {
		model.addObject("deleteMsg", "Deleted Successfully");
		}else
		{
			model.addObject("deleteMsg","Department cannot be deleted due to dependency.");
		}
		model.setViewName("DepartmentConfiguration");
		return model;
		//return "redirect:/departmentConfiguration";
	}
	
	

	/**
	 * Add department
	 * @return
	 */
	@RequestMapping(value="/addDepartment",method=RequestMethod.GET)
	public ModelAndView addDepartment()
	{
		
		ModelAndView model=new ModelAndView();
		model.setViewName("DepartmentForm");
		Department departments=new Department();
		model.addObject("department",departments);
		return model;
		
	}

	/**
	 * Submit department
	 * @return
	 */
	@RequestMapping(value="/submitDepartment",method=RequestMethod.POST)
	public ModelAndView submitDepartment(@Validated @ModelAttribute Department department,BindingResult bindingresult)
	{
		
		if(bindingresult.hasErrors())
		{
			ModelAndView model=new ModelAndView();
			model.setViewName("DepartmentForm");
			Map<Integer,String> departmentMap=departmentsService.getDepartmentMap();
			model.addObject("departments", departmentMap);
			
			return model;
		}
		departmentsService.submitDepartment(department);
		List<Department> departmentList=departmentsService.getDepartments();
		ModelAndView model=new ModelAndView();
		model.addObject("departmentList", departmentList);
		model.addObject("msg", "department added succesfully");
		model.setViewName("DepartmentConfiguration");
		//return "redirect:departmentConfiguration";
		return model;
	}


}
