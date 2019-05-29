package com.hrms.model;

public class DepartmentSkills {
	String deptName;
	String skill;
	int noOfEmployees;
	public DepartmentSkills(String deptName,String skill,int noOfEmployees)
	{
		this.deptName=deptName;
		this.skill=skill;
		this.noOfEmployees=noOfEmployees;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
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
