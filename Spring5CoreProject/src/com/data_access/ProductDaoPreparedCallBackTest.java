package com.data_access;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductDaoPreparedCallBackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductDaoPreparedStatementCallBack dao = context.getBean("productPreparedCallBack", ProductDaoPreparedStatementCallBack.class);
		Scanner sc= new Scanner(System.in);
		
		//insert Product
		System.out.println("Enter Product id");
		int pid =sc.nextInt();
		System.out.println("Enter Product Name");
		String pname = sc.next();
		System.out.println("Enter Product Price");
		double price = sc.nextDouble();		
		
	  dao.insertProduct(new Product(pid, pname, price));
		
		
		//Update Product Details
		System.out.println("Enter Product ID to update Details");
		pid=sc.nextInt();
		System.out.println("Enter Product Name to Update");
		pname=sc.next();
		System.out.println("Enter Price to Update");
		price=sc.nextDouble();
		
	  dao.updateProduct(new Product(pid,pname,price));
	 
	  
	  //Delete Product Details
	  System.out.println("Enter Product Id to delete the records!!");
	  pid=sc.nextInt();
	  dao.deleteProduct(pid);
	
	  
	  
	}

}
