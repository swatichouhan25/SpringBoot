package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insertEmployee(Employee e) {
		String sql="insert into employee values(?,?,?)";
		
		return  jdbcTemplate.update(sql,e.getId(), e.getName(), e.getSalary());
	}
	
	public int updateEmployee(Employee e) {
		String sql="update employee set name=?, salary=? where id=?";
		return jdbcTemplate.update(sql,e.getName(),e.getSalary(),e.getId());
	}
	
	public int deleteEmployee(int id) {
		String sql="delete  from employee where id=?";
		return jdbcTemplate.update(sql,id);
	}
	
	public List<Employee> getAllEmployee() {
		String sql= "select * from employee";
		return jdbcTemplate.query(sql,(rs,rowNum)->new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3)));
	}
	
	public  Employee getEmployeeById(int id) {
		String sql="select * from employee where id=?";
		return  jdbcTemplate.queryForObject(sql,(rs,rowNum) -> new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3)), id);
		
	}
}

