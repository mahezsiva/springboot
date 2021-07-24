package com.project.collections;

import java.util.List;

public class Emp {
	private String name;
	private List<String>phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Emp(String name, List<String> phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public Emp() {
		super();
		
	}
	

}
