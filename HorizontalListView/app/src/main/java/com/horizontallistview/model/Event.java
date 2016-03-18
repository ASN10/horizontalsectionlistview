package com.horizontallistview.model;







import com.horizontallistviewwithsections.interfaces.Item;

import java.io.Serializable;


public class Event implements Item, Serializable {

	private String meetingId;
	private int eventDay;
	private int eventMonth;
	private int eventYear;

	private String eventSubject;
	private int eventHour;
	private int eventMinutes;
	private int numOfAttendees;
	private int numOfMaterials;
	private String chairFirstName;
	private String chairLastName;
	private String secretaryFirstName;
	private String secretaryLastName;
	private String location;
	private String description;

	
	

	

	private String combinedDate;

	public String getCombinedDate() {
		return combinedDate;
	}

	public void setCombinedDate(String combinedDate) {
		this.combinedDate = combinedDate;
	}

	public int getEventDay() {
		return eventDay;
	}

	public void setEventDay(int eventDay) {
		this.eventDay = eventDay;
	}

	public int getEventMonth() {
		return eventMonth;
	}

	public void setEventMonth(int eventMonth) {
		this.eventMonth = eventMonth;
	}

	public int getEventYear() {
		return eventYear;
	}

	public void setEventYear(int eventYear) {
		this.eventYear = eventYear;
	}

	public String getEventSubject() {
		return eventSubject;
	}

	public void setEventSubject(String eventSubject) {
		this.eventSubject = eventSubject;
	}

	public int getEventHour() {
		return eventHour;
	}

	public void setEventHour(int eventHour) {
		this.eventHour = eventHour;
	}

	public int getEventMinutes() {
		return eventMinutes;
	}

	public void setEventMinutes(int eventMinutes) {
		this.eventMinutes = eventMinutes;
	}

	public int getNumOfAttendees() {
		return numOfAttendees;
	}

	public void setNumOfAttendees(int numOfAttendees) {
		this.numOfAttendees = numOfAttendees;
	}

	public int getNumOfMaterials() {
		return numOfMaterials;
	}

	public void setNumOfMaterials(int numOfMaterials) {
		this.numOfMaterials = numOfMaterials;
	}






	public String getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(String meetingId) {
		this.meetingId = meetingId;
	}

	public String getChairFirstName() {
		return chairFirstName;
	}

	public void setChairFirstName(String chairFirstName) {
		this.chairFirstName = chairFirstName;
	}

	public String getChairLastName() {
		return chairLastName;
	}

	public void setChairLastName(String chairLastName) {
		this.chairLastName = chairLastName;
	}

	public String getSecretaryFirstName() {
		return secretaryFirstName;
	}

	public void setSecretaryFirstName(String secretaryFirstName) {
		this.secretaryFirstName = secretaryFirstName;
	}

	public String getSecretaryLastName() {
		return secretaryLastName;
	}

	public void setSecretaryLastName(String secretaryLastName) {
		this.secretaryLastName = secretaryLastName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean isSection() {
		return false;
	}





}
