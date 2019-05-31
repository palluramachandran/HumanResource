package com.hrms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.dao.EmployeesDAO;
import com.hrms.model.Employee;
import com.hrms.model.EmployeeSkills;

/**
 * All Employee specific service layer code
 * @author Pallavi
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
	public EmployeesDAO employeesDAO;
	@Autowired
	public void setEmployeeDAO(EmployeesDAO employeesDAO)
	{
		this.employeesDAO=employeesDAO;
	}


	@Override
	public List<EmployeeSkills> getEmployeeSkills() {
		List<EmployeeSkills> empSkillList=employeesDAO.getEmployeeSkills();
		return empSkillList;
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> employee=employeesDAO.getEmployees();
		return employee;
	}

	@Override
	public Employee editEmployee(int empId) {

	Employee employee=employeesDAO.editEmployee(empId);
	return employee;
}

	@Override
	public void updateEmployee(Employee employee) {
	employeesDAO.updateEmployee(employee);

	}

	@Override
	public void deleteEmployee(int empId) {
		employeesDAO.deleteEmployee(empId);
	}

	

	@Override
	public void submitEmployee(Employee employee) {
		employeesDAO.submitEmployee(employee);

	}

}
