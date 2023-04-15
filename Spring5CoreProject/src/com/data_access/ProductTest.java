package com.data_access;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductDao dao = context.getBean("productDao", ProductDao.class);
		Scanner sc= new Scanner(System.in);
		
		//insert Product
		System.out.println("Enter Product id");
		int pid =sc.nextInt();
		System.out.println("Enter Product Name");
		String pname = sc.next();
		System.out.println("Enter Product Price");
		double price = sc.nextDouble();		
		
		int rows = dao.insertProduct(new Product(pid, pname, price));
		if(rows>0) {
			System.out.println("Product Details inserted successfully!");
		}
		
		//Update Product Details
		System.out.println("Enter Product ID to update Details");
		pid=sc.nextInt();
		System.out.println("Enter Product Name to Update");
		pname=sc.next();
		System.out.println("Enter Price to Update");
		price=sc.nextDouble();
		
	  rows=dao.updateProduct(new Product(pid,pname,price));
	  if(rows>0) {
		  System.out.println("Product Details Updated Successfully");
	  }
	  else {
		  System.out.println("Product not updated");
	  
		}
	  
	  //Delete Product Details
	  System.out.println("Enter Product Id to delete the records!!");
	  pid=sc.nextInt();
	  rows=dao.deleteProductById(pid);
	  if(rows>0) {
		  System.out.println("Product Details Deleted Successfully");
	  }
	  else {
		  System.out.println("Product Details not Deleted ");
		  
	  }
	  
	  //select all products
	  
	  List<Product> list = dao.getAllProduct();
	  System.out.println("PID \t ProductName \t Price");
	  list.forEach(p ->System.out.println( p.getPid()+"\t"+ p.getPname()+"\t"+ p.getPrice()));
	
	    //select product by Id
		
		Product p1 =dao.getProductById(pid);
		System.out.println("Enter ID to Show Details!");
		pid=sc.nextInt();
		System.out.println("Product Details Are: ");
		//System.out.println("ID: "+p1.getPid()+"Name: "+p1.getPname()+"Price:"+p1.getPrice());
		System.out.println(pid);
	}
	
	
		
	}


