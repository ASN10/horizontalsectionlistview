package com.horizontallistview.model;



import com.horizontallistviewwithsections.interfaces.Item;

import java.io.Serializable;


public class EventScrollerItem implements Item, Serializable {

	private int year;

	private int monthPosition;

	private boolean isMonthlyView;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonthPosition() {
		return monthPosition;
	}

	public void setMonthPosition(int monthPosition) {
		this.monthPosition = monthPosition;
	}

	public boolean isMonthlyView() {
		return isMonthlyView;
	}

	public void setMonthlyView(boolean isMonthlyView) {
		this.isMonthlyView = isMonthlyView;
	}

	private final String title;

	public EventScrollerItem(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public boolean isSection() {
		return true;
	}
}
