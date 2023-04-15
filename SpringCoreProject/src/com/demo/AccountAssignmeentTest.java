package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AccountAssignmeentTest {
	public static void main(String[] args) {
		
		Resource resource =new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		AccountAssignment acc = factory.getBean("account", AccountAssignment.class);
		
		System.out.println("Account Details are:");
		System.out.println("Account NUmber: "+acc.getAcct_id());
		System.out.println("Customer Name: "+acc.getName());
		System.out.println("Account Typer: "+acc.getAcc_type());
		System.out.println("Account Creation Date: "+acc.getDate());
		System.out.println("Account Balance: "+acc.getBalance());
		System.out.println("Account Holder Address: "+acc.getAddress());
		System.out.println("*****************************");
	}

}
