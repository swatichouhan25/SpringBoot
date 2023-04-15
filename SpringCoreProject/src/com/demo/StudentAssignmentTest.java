package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentAssignmentTest {
	public static void main(String[] args) {
		
	
	
	Resource resource = new ClassPathResource("beans.xml");
	BeanFactory factory = new XmlBeanFactory(resource);
	StudentAssignment std= factory.getBean("student", StudentAssignment.class);
	  System.out.println("Student Details");
	  System.out.println("Roll No: "+std.getRollNo());
	  System.out.println("Name: "+ std.getName());
	  System.out.println("Percentage: "+std.getPercentage());
	  System.out.println("Grade: "+std.getGrade());
	  System.out.println("Subjects are: "+std.getSubject());
	  System.out.println("*********************************");
	 

}
}