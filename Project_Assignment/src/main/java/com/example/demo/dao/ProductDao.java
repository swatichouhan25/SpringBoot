package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.example.demo.bean.Product;

@Repository
public class ProductDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Product> getAllProduct(){
		String sql= "select * from product";
		return jdbcTemplate.query(sql,(rs,rowNumber)-> new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3)));
	}
	
	/*public Product getProductById(int id) {
		String sql ="select * from product where id=?";
		return jdbcTemplate.queryForObject(sql,(rs,rowNumber)-> new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3)),id);
	}*/
	
	public int insertProduct(Product p) {
		String sql="insert into product values(?,?,?)";
		return jdbcTemplate.update(sql, p.getId(),p.getName(),p.getPrice());
	}
	
	/*public int updateProductById(Product p,int id) {
		String sql="update product set name=?,price=? where id=?";
		return jdbcTemplate.update(sql,p.getName(),p.getPrice(),p.getId());
	}*/
	
	public int deleteProductById(int id) {
		String sql="delete from product where id=?";
		return jdbcTemplate.update(sql,id);
	}
	
	
	
	
	

	

}
