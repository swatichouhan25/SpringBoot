package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("beans.xml");
	    BeanFactory factory = new XmlBeanFactory(resource);
	    Employee emp1 = factory.getBean("emp1",Employee.class);
	    System.out.println("1st Employee Details");
	    System.out.println("ID "+emp1.getId());
	    System.out.println("Name "+emp1.getName());
	    System.out.println("Salary "+emp1.getSalary());
	    System.out.println("**************************");
	    
	    Employee emp2 = factory.getBean("emp2",Employee.class);
	    System.out.println("2nd Employee Details");
	    System.out.println("ID "+emp2.getId());
	    System.out.println("Name "+emp2.getName());
	    System.out.println("Salary "+emp2.getSalary());
	    System.out.println("**************************");
	    
	    
	    Employee emp3 = factory.getBean("emp3", Employee.class);
	    System.out.println("3rd Employee Details");
	    System.out.println("ID "+emp3.getId());
	    System.out.println("Name "+emp3.getName());
	    System.out.println("Salary "+emp3.getSalary());
	    System.out.println("**************************");
	
	
	}

}
