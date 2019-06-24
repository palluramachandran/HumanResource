package com.hrms.service;

import java.util.List;

import com.hrms.model.CountOfEmployeeRating;
import com.hrms.model.EmployeeRating;
import com.hrms.model.EmployeeRatingDetails;

public interface EmployeeRatingService {
	
	public List<CountOfEmployeeRating> getNoOfEmployeeRating();

	public List<EmployeeRatingDetails> getEmployeeRatingDetails();

	public void updateRating(EmployeeRatingDetails employeeRatingDetails);

	public void submitrating(EmployeeRating employeeRating);

	public void deleteRating(int empId);

	public EmployeeRatingDetails editRating(int empId);

}
