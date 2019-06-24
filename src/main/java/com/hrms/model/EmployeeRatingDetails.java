package com.hrms.model;

public class EmployeeRatingDetails {

	int empId;
	String firstName;
	int rating;
	String description;
	public EmployeeRatingDetails()
	{
		
	}
	public EmployeeRatingDetails(int empId,String firstName,int rating,String description)
	{
		this.empId=empId;
		this.firstName=firstName;
		this.rating=rating;
		this.description=description;
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
