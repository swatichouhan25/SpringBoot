package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		
		Person p1=context.getBean("person1",Person.class);
		System.out.println("1st Person Details");
		System.out.println("Name :"+p1.getName());
		System.out.println(("Date of Birth: "+p1.getDob()));
		System.out.println("Address : "+ p1.getAddress());
		System.out.println("***********************");
	
		Person p2=context.getBean("person2",Person.class);
		System.out.println("2nd Person Details");
		System.out.println("Name :"+p2.getName());
		System.out.println(("Date of Birth: "+p2.getDob()));
		System.out.println("Address : "+ p2.getAddress());
		System.out.println("***********************");
	
		Person p3=context.getBean("person3",Person.class);
		System.out.println("3rd Person Details");
		System.out.println("Name :"+p3.getName());
		System.out.println(("Date of Birth: "+p3.getDob()));
		System.out.println("Address : "+ p3.getAddress());
		System.out.println("***********************");
	
	Person swatiP4 =context.getBean("swatipractice", Person.class);
	 System.out.println("practice:4th person details");
	 System.out.println("Name:"+ swatiP4.getName());
	 System.out.println("Dob: "+ swatiP4.getDob());
	 System.out.println("Address: "+ swatiP4.getAddress());
	 System.out.println("******************************");
	
	
	}

}
