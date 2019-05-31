package com.hrms.model;

/**
 * Model for returning Department Graphs
 * @author Pallavi
 *
 */
public class DepartmentEmpDetails {
	String deptName;
	int noOfEmployees;
	int salary;
	
	public DepartmentEmpDetails(String depName,int noOfEmployees,int salary)
	{
		this.deptName=depName;
		this.noOfEmployees=noOfEmployees;
		this.salary=salary;
	}

	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
