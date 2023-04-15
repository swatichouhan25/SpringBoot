package com.data_access_annotation;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.data_access.Product;


public class EmployeeTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfiguration.class);
		
		EmployeeDao dao = context.getBean(EmployeeDao.class);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter employee id:");
		int id= sc.nextInt();
		System.out.println("Enter employee Name");
		String name=sc.next();
		System.out.println(("Enter employee salary"));
		double salary= sc.nextDouble();
		int rows= dao.insertEmployee(new Employee(id,name,salary));
		if(rows>0) {
			System.out.println("Employee Record Inserted");
		}
		
				/*List<String> namesList= dao.getEmployeeNames();
				System.out.println("Name of All Employees!!");
				namesList.forEach(s-> System.out.println(s));
				
				System.out.println("**************************");
				//fetch details by id
				System.out.println("Enter id to fetch Name");
				int idName=sc.nextInt();
				dao.getEmployeeNameById( idName);
				
				  System.out.println( "Name: "+ dao.getEmployeeNameById(idName));
				  System.out.println("***************************");
				  
				  //update details
				  
				  System.out.println("Enter id to update details");
				   id=sc.nextInt();
				   System.out.println("Enter new name to update");
				   name= sc.next();
				   System.out.println("Enter new salary to update");
				   salary= sc.nextDouble();
				   rows=dao.updateEmployee(new Employee(id,name,salary));
				   if(rows>0) {
					   System.out.println("updated successfully");
				   }
					   else {
						   System.out.println("not updated");
					   }
				   System.out.println("**************************");*/
				   //delete employee
				   
				   System.out.println("enter id to delete record");
				   id=sc.nextInt();
				   rows=dao.deletebyId(id);
				   if(rows>0) {
					   System.out.println("Record deleted successfully");
					  }
				   else {
					   System.out.println("Record not Deleted!!");
				   }
				   }
	                
				   
				  
				
				
				
		}
	
	 
		
	


