package com.hrms.service;

import java.util.List;

import com.hrms.model.Employee;
import com.hrms.model.EmployeeSkills;

/**
 * 
 * @author Pallavi
 *
 */
public interface EmployeeService {
	public List<EmployeeSkills> getEmployeeSkills();
	public List<Employee> getEmployees();
	public Employee editEmployee(int empId);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(int empId);
	public void submitEmployee(Employee employee);


}
