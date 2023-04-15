package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Product;
import com.example.demo.dao.ProductDao;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao dao;
	
	public List<Product>getAllProduct(){
		return dao.getAllProduct();
	}
	
	/*public Product getProductById(int id) {
		return dao.getProductById(id);
	}*/
	
	public int  insertProduct(Product p) {
		return dao.insertProduct(p);
	}
	
	/*public int updateProduct(Product p ,int id) {
		return dao.updateProductById(p, id);
	}*/
	public int deleteProduct(int id) {
		return dao.deleteProductById(id);
	}
	
	

}
