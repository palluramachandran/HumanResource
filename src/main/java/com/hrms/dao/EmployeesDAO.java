package com.hrms.dao;
import com.hrms.model.EmployeeSkills;

import java.util.List;

import com.hrms.model.CountOfEmployeeRating;
import com.hrms.model.Employee;
import com.hrms.model.EmployeeRating;
import com.hrms.model.EmployeeRatingDetails;

/**
 * 
 * @author Pallavi
 *
 */
public interface EmployeesDAO {
	public List<EmployeeSkills> getEmployeeSkills();
	public List<Employee> getEmployees();
	public Employee editEmployee(int empId);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(int empId);
	public void submitEmployee(Employee employee);
    

}
