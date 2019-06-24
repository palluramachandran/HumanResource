package com.hrms.model;

public class Template {
	
	int id;
	String templateName;
	String templateDescription;
	boolean active;
	String [] weekdays;
	String weekdaysString;
	String startTime;
	String endTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getTemplateDescription() {
		return templateDescription;
	}
	public void setTemplateDescription(String templateDescription) {
		this.templateDescription = templateDescription;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String[] getWeekdays() {
		return weekdays;
	}
	public void setWeekdays(String[] weekdays) {
		this.weekdays = weekdays;
	}
	public String getWeekdaysString() {
		return weekdaysString;
	}
	public void setWeekdaysString(String weekdaysString) {
		this.weekdaysString = weekdaysString;
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
