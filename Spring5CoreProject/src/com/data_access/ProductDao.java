package com.data_access;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//in this class Dao class we write all implementation like update,delete ,insert
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class ProductDao {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insertProduct (Product p) {
		String sql ="insert into product values("+ p.getPid()+ ",'" +p.getPname()+"',"+p.getPrice()+")";
		return jdbcTemplate.update(sql);
		
	}
	
	public int updateProduct(Product p) {
		String sql = "update product set pname ='"+p.getPname()+"' ,price="+p.getPrice()+" where pid="+p.getPid();
		return jdbcTemplate.update(sql);
	}
	
	public int deleteProductById(int pid) {
		String sql ="delete from product where pid=" +pid;
		return jdbcTemplate.update(sql);
	}
	
	public List<Product>getAllProduct(){
		String sql = "select * from product";
		return jdbcTemplate.query(sql,new ResultSetExtractor<List<Product>>(){
			public List<Product>extractData(ResultSet rs) throws SQLException{
				List<Product>list =new ArrayList<>();
				while(rs.next()) {
					Product p = new Product();
					p.setPid(rs.getInt(1));
					p.setPname(rs.getString(2));
					p.setPrice(rs.getDouble(3));
					list.add(p);
				}
				return list;
				
			}
		});
	}
		

		public Product getProductById(int id) {
			String sql = "select * from product where pid = "+id ;
			return jdbcTemplate.query(sql,rs -> {
				
					Product p =new Product();
					if(rs.next()) {
					p.setPid(rs.getInt(1));
						p.setPname(rs.getString(2));
						p.setPrice(rs.getDouble(3));
						
				}
					return p;
					
				
			});
		}
	

}
