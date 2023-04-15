package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Employee emp1 = context.getBean("emp1", Employee.class);
		System.out.println("Employee Details:");
		System.out.println("ID : "+emp1.getId());
		System.out.println("Name: "+emp1.getName());
		System.out.println("Salary : "+emp1.getSalary());
		System.out.println("Contact Number: "+emp1.getNumber());
		System.out.println("Address : "+ emp1.getAddress());
		System.out.println("*************************************");
	
	Person p1 = context.getBean("person",Person.class);
	System.out.println(" 1st Person Details!!");
	System.out.println("Name : "+p1.getName());
	System.out.println("DOB: "+ p1.getDob() );
	System.out.println("Contact Number: "+ p1.getContactNumber());
	System.out.println("*********************************");
	

	Person p2 = context.getBean("p2",Person.class);
	System.out.println("2nd Person Details!!");
	System.out.println("Name : "+p2.getName());
	System.out.println("DOB: "+ p2.getDob() );
	System.out.println("Contact Number: "+ p2.getContactNumber());
	System.out.println("*********************************");
	
	
	}

}
