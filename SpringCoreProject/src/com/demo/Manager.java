package com.demo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Manager {
	
	private int id;
	private String name;
	private float salary;
	private List<String> projects;
	private Set<Address>address;
	private Map<String,ContactNumber> contactNumber;
	
	public Manager() {
		
	}

	
	public Manager(int id, String name, float salary, List<String> projects, Set<Address> address,
			Map<String, ContactNumber> contactNumber) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.projects = projects;
		this.address = address;
		this.contactNumber = contactNumber;
	}


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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}


	public Map<String, ContactNumber> getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(Map<String, ContactNumber> contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	
	

}
