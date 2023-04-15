package com.data_access_annotation;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int  insertEmployee(Employee e) {
		String sql="insert into employee values(?,?,?)";
		return jdbcTemplate.update(sql,e.getId(),e.getName(),e.getSalary());
	}
	
	public List<String> getEmployeeNames(){
		String sql="select name from employee";
		return jdbcTemplate.query(sql,(rs,rowNumber)-> rs.getString(1));
			
		}
	
	public String getEmployeeNameById(int eId){
		String sql="select name from employee where id=?";
		return jdbcTemplate.queryForObject(sql,(rs,rowNumber)->rs.getString(1));
			
		}
	
	public int updateEmployee(Employee e) {
		String sql="update employee set name=?, salary=? where id=?";
		return jdbcTemplate.update(sql,e.getName(),e.getSalary(),e.getId());
	}
	
	public int deletebyId(int id) {
		String sql="delete  from employee where id=?";
		return jdbcTemplate.update(sql,id);
	}
		
		
	
		}
		
	


