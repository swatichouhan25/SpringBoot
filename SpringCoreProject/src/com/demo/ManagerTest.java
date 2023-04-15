package com.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ManagerTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Manager m1=context.getBean("manager1", Manager.class);
		System.out.println(("1st manager Details"));
		System.out.println("ID: "+m1.getId());
		System.out.println(("Name: "+m1.getName()));
		System.out.println("Salary: "+m1.getSalary());
		System.out.println("Project List: "+m1.getProjects());
		Set<Address>address = m1.getAddress();
		Iterator<Address> it = address.iterator();
		if(it.hasNext()) {
			System.out.println("Personal Address: "+it.next());
		}
		if(it.hasNext()) {
			System.out.println("Company Address : "+it.next());
		}
		System.out.println("Contact Details: ");
		Map<String,ContactNumber> contactNumber= m1.getContactNumber();
		System.out.println(contactNumber);
		System.out.println("***********************************************");
		
		Manager m2=context.getBean("manager2", Manager.class);
		System.out.println(("2nd manager Details"));
		System.out.println("ID: "+m2.getId());
		System.out.println(("Name: "+m2.getName()));
		System.out.println("Salary: "+m2.getSalary());
		System.out.println("Project List: "+m2.getProjects());
		Set<Address>addresses = m1.getAddress();
		Iterator<Address> it1 = addresses.iterator();
		if(it1.hasNext()) {
			System.out.println("Personal Address: "+it1.next());
		}
		if(it1.hasNext()) {
			System.out.println("Company Address : "+it1.next());
		}
		System.out.println("Contact Details: " +m2.getContactNumber());
		}

}
