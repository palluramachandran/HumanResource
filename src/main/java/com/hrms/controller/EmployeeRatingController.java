package com.hrms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hrms.model.CountOfEmployeeRating;
import com.hrms.model.Employee;
import com.hrms.model.EmployeeRating;
import com.hrms.model.EmployeeRatingDetails;

import com.hrms.service.EmployeeRatingService;
import com.hrms.service.EmployeeService;

@Controller
public class EmployeeRatingController {

	public EmployeeRatingService employeeRatingService;

	@Autowired
	public void setEmployeeRatingService(EmployeeRatingService employeeRatingService) {
		this.employeeRatingService = employeeRatingService;
	}
	
	public EmployeeService employeeService;
	@Autowired
	public void setEmployeeService(EmployeeService employeeService)
	{
		this.employeeService=employeeService;
	}
	

	@RequestMapping(value = "/countOfEmployeeRating", method = RequestMethod.GET, headers = "Accept=application/json")

	public @ResponseBody List<CountOfEmployeeRating> getNoOfEmployeeRating() {
		List<CountOfEmployeeRating> countRating = employeeRatingService.getNoOfEmployeeRating();
		return countRating;

	}

	@RequestMapping(value = "/employeeRatingConfiguration", method = RequestMethod.GET)
	public ModelAndView getEmployeeRatingDetails() {
		List<EmployeeRatingDetails> ratingDetails = employeeRatingService.getEmployeeRatingDetails();
		ModelAndView model = new ModelAndView();
		model.addObject("ratingDetails", ratingDetails);
		model.setViewName("EmployeeRatingConfiguration");
		return model;

	}

	/**
	 * Edit employee
	 * 
	 * @return
	 */
	@RequestMapping(value = "/editRating", method = RequestMethod.GET)
	public ModelAndView editRating(HttpServletRequest request) {
		int empId = Integer.parseInt(request.getParameter("empId"));
		EmployeeRatingDetails ratingDetails = employeeRatingService.editRating(empId);
		ModelAndView model = new ModelAndView();
		model.addObject("ratingDetails", ratingDetails);
		model.setViewName("EditEmployeeRating");
		return model;
	}

	@RequestMapping(value = "/updateRating", method = RequestMethod.POST)
	public ModelAndView updateRating(@ModelAttribute EmployeeRatingDetails employeeRatingDetails) {
		employeeRatingService.updateRating(employeeRatingDetails);
		List<EmployeeRatingDetails> ratingDetails = employeeRatingService.getEmployeeRatingDetails();
		ModelAndView model = new ModelAndView();
		model.addObject("updateMsg", "Updated Succesfully");
		model.addObject("ratingDetails", ratingDetails);
		model.setViewName("EmployeeRatingConfiguration");
		return model;
	}

	@RequestMapping(value = "/deleteRating", method = RequestMethod.GET)
	public ModelAndView deleteRating(HttpServletRequest request) {
		int empId = Integer.parseInt(request.getParameter("empId"));
		employeeRatingService.deleteRating(empId);
		List<EmployeeRatingDetails> ratingDetails = employeeRatingService.getEmployeeRatingDetails();
		ModelAndView model = new ModelAndView();
		model.addObject("deleteMsg", "employeeRating deleted Successfully");
		model.addObject("ratingDetails", ratingDetails);
		model.setViewName("EmployeeRatingConfiguration");
		return model;

	}

	/**
	 * Add employee rating
	 * 
	 * @return
	 */
	@RequestMapping(value = "/addEmployeeRating", method = RequestMethod.GET)
	public ModelAndView addEmployee() {
		ModelAndView model = new ModelAndView();
		model.setViewName("AddEmployeeRating");
		
		List<Employee> employee=employeeService.getEmployees();
		List<Integer> employeeIdList=new ArrayList<>();
	    for(Employee employees:employee)
	    {
	    	int empId=employees.getEmpId();
	    	employeeIdList.add(empId);
	    	
	    }
	    
	    model.addObject("employeeIdList",employeeIdList);
		EmployeeRating ratingDetails = new EmployeeRating();
		model.addObject("ratingDetails", ratingDetails);
		return model;

	}
	/**
	 * to get firstname with corresponding empId
	 */
	@RequestMapping(value="/employeeFirstName", method = RequestMethod.GET ,headers = "Accept=application/json")
	public @ResponseBody String employeeFirstName(@RequestParam("empId") int empId)  
	{
		Employee employee=employeeService.editEmployee(empId);
		String firstName=employee.getFirstName();
		return firstName;
		
	}

	/**
	 * Submit rating from add page
	 * 
	 * @return
	 */
	
	@RequestMapping(value = "/submitRating", method = RequestMethod.POST)
	public ModelAndView submitRating(@Validated @ModelAttribute EmployeeRating employeeRating,
			BindingResult bindingresult) {
		employeeRatingService.submitrating(employeeRating);
		List<EmployeeRatingDetails> ratingDetails = employeeRatingService.getEmployeeRatingDetails();
		ModelAndView model = new ModelAndView();
		model.addObject("addMsg", "Rating added suceesfully");
		model.addObject("ratingDetails", ratingDetails);
		model.setViewName("EmployeeRatingConfiguration");
		return model;

	}

	/**
	 * Rest request for submitting rating
	 * @param employeeRating
	 */
	@RequestMapping(value = "/submitRatingRest", method = RequestMethod.POST)
	public void submitRatingRest(EmployeeRating employeeRating) {
		employeeRatingService.submitrating(employeeRating);

	}
	
}
