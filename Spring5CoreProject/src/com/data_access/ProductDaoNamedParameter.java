package com.data_access;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class ProductDaoNamedParameter {
	
	private NamedParameterJdbcTemplate template;

	public void setTemplate(NamedParameterJdbcTemplate template) {
		this.template = template;
	}
	
	public Object insertProduct(Product p) {
		String sql="insert into product values(:id,:name,:price)";
		Map<String,Object> map = new HashMap<>()	;
		map.put("id",p.getPid());
		map.put("name",p.getPname());
		map.put("price", p.getPrice());
		//annonymous inner class
//		return template.execute(sql, map, new PreparedStatementCallback<Object>() {
//			public Object doInPreparedStatement(PreparedStatement ps);
//			SQLException,DataAccessException{ return ps.executeUpdate();
//		}
//			
//		});
		
		return template.execute(sql, map ,ps -> ps.executeUpdate());
		
				}
	
	public int updateProduct(Product p) {
		String sql="update product set pname=:name,price=:price where pid=:id";
		Map<String,Object> map = new HashMap<>()	;
		map.put("id",p.getPid());
		map.put("name",p.getPname());
		map.put("price", p.getPrice());
		return template.execute(sql, map ,ps -> ps.executeUpdate());
		
		
	}

}
