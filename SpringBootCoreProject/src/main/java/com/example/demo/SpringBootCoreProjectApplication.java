package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootCoreProjectApplication {

	public static void main(String[] args) {
	 ApplicationContext context =	SpringApplication.run(SpringBootCoreProjectApplication.class, args);
	 System.out.println("Hello");
	 System.out.println("Welcome Spring Boot");
	 
	 //Greeting
	 Greeting greet= context.getBean(Greeting.class);
	 System.out.println("Message is: "+ greet.getMessage());
	System.out.println("**********************************");
	
	//Employee 
	 Employee emp = context.getBean(Employee.class);
	 System.out.println(" ID: "+ emp.getId());
	 System.out.println(" Name: "+ emp.getName());
	 System.out.println("Salary"+ emp.getSalary());
	 System.out.println("Dob: "+ emp.getDob());
	 Address address =emp.getAddress();
	 
	 
	 Address ad =context.getBean(Address.class);
	 System.out.println("Address Details!!");
	 System.out.println("Street:" +ad.getStreet());
	 System.out.println("City: "+ad.getCity());
	 System.out.println("State:" +ad.getState());
	 System.out.println("***************************");
	 
	}

}
