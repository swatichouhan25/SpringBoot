package com.data_access;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class ProductDaoPreparedStatementCallBack {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Boolean insertProduct(Product p) {
		String query ="insert into product values(?,?,?)";
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>() {
		
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException {
				ps.setInt(1, p.getPid());
				ps.setString(2, p.getPname());
				ps.setDouble(3,p.getPrice());
				return ps.execute();
			}
		});
	}
	
	public Boolean updateProduct(Product p) {
		String query ="update product set pname=?,price=? where pid=?";
		return jdbcTemplate.execute(query, (PreparedStatement ps) -> {
			ps.setInt(3, p.getPid());
			ps.setString(1, p.getPname());
			ps.setDouble(2,p.getPrice());
			return ps.execute();
			
		});
	}
	
	public Boolean deleteProduct(int pid) {
		String query ="delete from product where pid=?";
		return jdbcTemplate.execute(query, (PreparedStatement ps) -> {
			ps.setInt(1, pid);
			
			return ps.execute();
			
		});
}
	
}

