package com.hrms.model;

/**
 * Model for returning data for Employee skills graph
 * @author Pallavi
 *
 */
public class EmployeeSkills {

	String skill;
	int noOfEmployees;

	public EmployeeSkills(String skill,int noOfEmployees)
	{
		this.skill=skill;
		this.noOfEmployees=noOfEmployees;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
}

