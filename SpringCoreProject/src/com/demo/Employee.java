package com.demo;

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	
	public Employee() {
		System.out.println("Employee Default Constructor");;
	}
	
	
	
	public void setId(int id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setSalary(float salary) {
		this.salary = salary;
	}



	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
		System.out.println("Employee Parameterized  Constructor");
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public float getSalary() {
		return salary;
	}
	
	
	}
