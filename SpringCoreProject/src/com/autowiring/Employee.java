package com.autowiring;

import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	private List<Address> address;
	private ContactNumber number;
	
	
	public Employee() {
		
	}


	public Employee(int id, String name, float salary, List<Address> address, ContactNumber number) {
		super();
		this.id = id;
		this.name = name;
	this.salary = salary;
		this.address = address;
		this.number = number;
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




	public ContactNumber getNumber() {
		return number;
	}


	public void setNumber(ContactNumber number) {
		this.number = number;
	}


	public List<Address> getAddress() {
		return address;
	}


	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	

}
