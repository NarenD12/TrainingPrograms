package com.infinite.spring2task;

import java.util.Date;

public class User {

	private String name;
	private String city;
	private Date date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getDate() {
		return new Date();
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
