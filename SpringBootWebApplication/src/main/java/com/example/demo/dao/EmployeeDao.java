package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Employee> getAllEmployee(){
		String sql ="select * from employee";
		return jdbcTemplate.query(sql,(rs,rowNumber) -> new Employee(rs.getInt(1) ,rs.getString(2),rs.getFloat(3)));
		
	}
	public Employee getEmployeeById(int id) {
		String sql = "select * from employee where id=?";
		return jdbcTemplate.queryForObject(sql,(rs,rowNumber) -> new Employee(rs.getInt(1),rs.getString(2),rs.getFloat(3)), id);
	}
	
	public int insertEmployee(Employee emp) {
		String sql="insert into employee values(?,?,?)";
		return jdbcTemplate.update(sql, emp.getId(),emp.getName(),emp.getSalary());
	}
	
	public int updateEmployeeById(Employee emp,int id) {
		String sql="update employee set name=?,salary=? where id=?";
		return jdbcTemplate.update(sql,emp.getName(),emp.getSalary(),emp.getId());
	}
	
	public int deleteEmployeeById(int id) {
		String sql="delete from employee where id=?";
		return jdbcTemplate.update(sql,id);
	}
	


}
