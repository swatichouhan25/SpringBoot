package com.autowiring;

public class Person {
	
	private String name;
	private String dob;
	private ContactNumber contactNumber;
	
	public Person() {
		
	}
	
	
	
	public Person(String name, String dob, ContactNumber contactNumber) {
		super();
		this.name = name;
		this.dob = dob;
		this.contactNumber = contactNumber;
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
	public ContactNumber getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(ContactNumber contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	

}
