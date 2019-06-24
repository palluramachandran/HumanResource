package com.hrms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.dao.EmployeeRatingDAO;
import com.hrms.dao.EmployeesDAO;
import com.hrms.model.CountOfEmployeeRating;
import com.hrms.model.EmployeeRating;
import com.hrms.model.EmployeeRatingDetails;

@Service
public class EmployeeRatingServiceImpl implements EmployeeRatingService {
	public EmployeeRatingDAO employeeRatingDAO;
	@Autowired
	public void setEmployeeRatingDAO(EmployeeRatingDAO employeeRatingDAO)
	{
		this.employeeRatingDAO=employeeRatingDAO;
	}


	@Override
	public List<CountOfEmployeeRating> getNoOfEmployeeRating() {
		
		List<CountOfEmployeeRating> countRating=employeeRatingDAO.getNoOfEmployeeRating();
		return countRating;
		
	}

	@Override
	public List<EmployeeRatingDetails> getEmployeeRatingDetails() {
		List<EmployeeRatingDetails> ratingDetails=employeeRatingDAO.getEmployeeRatingDetails();		
		return ratingDetails;
	}

	@Override
	public void updateRating(EmployeeRatingDetails employeeRatingDetails) {
		employeeRatingDAO.updateRating(employeeRatingDetails);
	}

	@Override
	public void submitrating(EmployeeRating employeeRating) {
		employeeRatingDAO.submitrating(employeeRating);
	}

	@Override
	public void deleteRating(int empId) {
		employeeRatingDAO.deleteRating(empId);

	}

	@Override
	public EmployeeRatingDetails editRating(int empId) {
		EmployeeRatingDetails ratingDetails=employeeRatingDAO.editRating(empId);
		return ratingDetails;
	}

}
