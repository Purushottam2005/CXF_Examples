package com.angc.poc.ws.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	
	/**
	 * Default Serial ID
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String address;
	private Date birthDay;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

}
