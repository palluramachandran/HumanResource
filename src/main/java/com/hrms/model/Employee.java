package com.hrms.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Model for all Employee specific operations
 * @author Pallavi
 *
 */
public class Employee {
	int deptId;
	int empId;
	@Size(min=3,max=30,message="length should be 3-15")
	String firstName;
	String lastName;
	@Email(message="please enter  valid format example@gmail.com")
	@NotEmpty
	String emailId;
	String designation;
	String skillSet;
	String gender="male";
	String password;
	int salary;
	
	public Employee()
	{
		
	}
	public Employee(int deptId,int empId,String firstName,String lastName,String emailId,String designation,String skillSet,String gender,String password,int salary)
		{
		this.deptId=deptId;
		this.empId=empId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		this.designation=designation;
		this.skillSet=skillSet;
		this.gender=gender;
		this.password=password;
		this.salary=salary;
		}
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
