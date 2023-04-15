package com.data_access;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NamedParameterTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ProductDaoNamedParameter dao = context.getBean("pDao", ProductDaoNamedParameter.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Id:");
		int pid = sc.nextInt();
		System.out.println("Enter Product name");
		String pname = sc.next();
		System.out.println("Enter Product Price");
		double price = sc.nextDouble();
		
	Object obj = dao.insertProduct(new Product(pid,pname,price));
		System.out.println("Product Inserted: "+obj);

		
		System.out.println("Enter Product Id to update :");
		 pid = sc.nextInt();
		System.out.println("Enter Product name to update");
		 pname = sc.next();
		System.out.println("Enter Product Price to update");
		 price = sc.nextDouble();
		int rows =dao.updateProduct(new Product(pid,pname,price));
		if(rows>0) {
			System.out.println("Product Details updated Successfully");
		}
	}

}
