package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //which package configure
@ComponentScan("com.demo")  //package from where component present to scan
public class TestClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(TestClass.class);
		Person p1= context.getBean(Person.class);
		System.out.println("Person Details:");
		System.out.println("Name : "+p1.getName());
		System.out.println("Dob : "+p1.getDob());
		System.out.println("**********************");
		
		Employee emp1 = context.getBean(Employee.class);
		System.out.println("Employee Details!");
		System.out.println("ID : "+emp1.getId());
		System.out.println("Name: "+emp1.getName());
		System.out.println(("Salary: "+emp1.getSalary()));
		System.out.println("Address: "+emp1.getAddress());
		System.out.println("********************************");
		
	}

}
