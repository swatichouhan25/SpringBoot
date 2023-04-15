package com.data_access;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//in this class Dao class we write all implementation like update,delete ,insert
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class ProductDaoPrepared {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insertProduct (Product p) {
		String sql ="insert into product values(?,?,?)";
		return jdbcTemplate.update(sql,p.getPid(),p.getPname(),p.getPrice());
		
	}
	
	public int updateProduct(Product p) {
		String sql = "update product set pname =?,price=? where pid=?";
		return jdbcTemplate.update(sql,p.getPname(),p.getPrice(),p.getPid());
	}
	
	public int deleteProductById(int pid) {
		String sql ="delete from product where pid= ?"; 
		return jdbcTemplate.update(sql,pid);
	}
	
	public List<Product>getAllProducts(){
		String sql =" select * from product";
		return jdbcTemplate.query(sql, new RowMapper<Product>() {
			public Product mapRow(ResultSet rs, int rowNumber) throws SQLException {
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getDouble(3));
				return p;
				
			}
		});
				
	}
	public Product getProductById(int pid) {
		String sql ="select * from product where pid=?";
		return  jdbcTemplate.queryForObject(sql,( rs, rowNumber) -> {
			Product p = new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPrice(rs.getDouble(3));
			return p;
			}, pid);
	}

}
