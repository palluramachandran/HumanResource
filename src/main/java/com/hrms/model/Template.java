package com.hrms.model;

public class Template {
	
	int id;
	String wotName;
	String wotDescription;
	String active;
	String [] workDays;
	String workDaysString;
	String startTime;
	String endTime;
	
	public Template() {}
	
	public Template(int id, String wotName, String wotDescription, String active, String[] workDays,
			String workDaysString, String startTime, String endTime) {
		super();
		this.id = id;
		this.wotName = wotName;
		this.wotDescription = wotDescription;
		this.active = active;
		this.workDays = workDays;
		this.workDaysString = workDaysString;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWotName() {
		return wotName;
	}
	public void setWotName(String wotName) {
		this.wotName = wotName;
	}
	public String getWotDescription() {
		return wotDescription;
	}
	public void setWotDescription(String wotDescription) {
		this.wotDescription = wotDescription;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String[] getWorkDays() {
		return workDays;
	}
	public void setWorkDays(String[] workDays) {
		this.workDays = workDays;
	}
	public String getWorkDaysString() {
		return workDaysString;
	}
	public void setWorkDaysString(String workDaysString) {
		this.workDaysString = workDaysString;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
}
