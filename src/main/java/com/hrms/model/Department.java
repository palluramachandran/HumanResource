package com.hrms.model;

public class Department {
	int deptId;
	String deptName;
	String description;
	boolean active=true;
	public Department() {}
	public Department(int deptId,String deptName,String description,boolean active)
	{
		this.deptId=deptId;
		this.deptName=deptName;
		this.description=description;
		this.active=active;
	}

	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
}
