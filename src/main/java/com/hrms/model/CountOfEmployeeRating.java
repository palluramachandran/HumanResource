package com.hrms.model;

public class CountOfEmployeeRating {
	int noOfEmployees;
	int rating;

	public CountOfEmployeeRating() {

	}

	public CountOfEmployeeRating(int noOfEmployees, int rating) {
		this.noOfEmployees = noOfEmployees;
		this.rating = rating;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
