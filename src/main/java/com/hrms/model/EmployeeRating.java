package com.hrms.model;

public class EmployeeRating {
	int empId;
	int rating;
	String description;
	public EmployeeRating()
	{
		
	}
	public EmployeeRating(int empId,int rating,String description)
	{
		this.empId=empId;
		this.rating=rating;
		this.description=description;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
