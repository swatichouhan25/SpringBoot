package com.example.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDataAccessApplication implements CommandLineRunner {

	@Autowired
	private EmployeeDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataAccessApplication.class, args);
	
	System.out.println("Hello From SpringBootDataAccess");
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee Details!!");
		System.out.println("Enter ID: ");
		int id =sc.nextInt();
		System.out.println("Enter Name:");
		String name=sc.next();
		System.out.println("Enter salary");
		double salary=sc.nextDouble();
		
		int rows=dao.insertEmployee(new Employee(id,name,salary));
		if(rows>0) {
			System.out.println("inserted");
		}
		System.out.println("*******************************");
		System.out.println("Enter id to Update Details!");
		id=sc.nextInt();
		System.out.println("Enter new name to Update");
		name=sc.next();
		System.out.println("Enter new salary to update");
		salary=sc.nextDouble();
		
		rows=dao.updateEmployee(new Employee(id,name,salary));
		if(rows>0) {
			System.out.println(" Details updated successfully!!");
		}
		else {
			System.out.println("Details not updated");
		}
		System.out.println("************************");
		
		System.out.println("Enter id to delete");
		id=sc.nextInt();
		rows=dao.deleteEmployee(id);
		if(rows>0) {
			System.out.println(" Details deleted successfully!!");
		}
			else {
				System.out.println("Details not deleted");
			}
			System.out.println("************************");
		
	
    List<Employee> list=dao.getAllEmployee();
    System.out.println("List of All employees");
    list.forEach(e->System.out.println(e));
    System.out.println("**********************");
    
    System.out.println("Show employee Details By Id");
    System.out.println("Enter id to Show details!!");
    id=sc.nextInt();
    
    Employee emp =dao.getEmployeeById(id);   
    System.out.println("Employee Details by Id!!");
    System.out.println("Id:"+  emp.getId()+ "Name:"+emp.getName()+ "Salary:"+ emp.getSalary());
		
	}

}
