package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ProductService;

import com.example.demo.bean.Product;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct(){
		return service.getAllProduct();
		}
	/*
	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable("id") int id) {
		return service.getProductById(id);
		
	}*/
	
	@PostMapping("/insertProduct")
	public String insertProduct(@RequestBody Product p) {
	 int rows= service.insertProduct(p);
	 if(rows>0) {
		 return "Product Inserted Successfully";
	 }
	 return "Product NOT Inserted!!!";
		
	}
	
	
/*	@PutMapping("/updateProduct/{id}")
	public String updateProduct( @PathVariable("id")int id, @RequestBody Product p) {
		int rows=service.updateProductById(p, id);
		if(rows>0) {
			return "Product Record updated Successfully!!!";
		}
		return "Product Record NOT Updated !!!";
	}
	*/
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct( @PathVariable("id") int id) {
		int rows=service.deleteProduct( id);
		if(rows>0) {
			return "Product Record deleted Successfully!!!";
		}
		return "Product Record NOT deleted !!!";
	}
		
	
	
	

}
