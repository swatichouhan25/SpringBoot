package com.demo;

public class Person {
	
	private String name;
	private String dob;
	private Address address;
	
	public Person() {
		System.out.println("Person Default Constructor");
		
	}

	public Person(String name, String dob, Address address) {
		super();
		this.name = name;
		this.dob = dob;
		this.address = address;
		System.out.println("Person Parameterized Constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
