package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;
import com.example.demo.dao.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao dao;
	
	public List<Employee>getAllEmployee(){
		return dao.getAllEmployee();		
	}
	
	public Employee getEmployeeById(int id) {
		return dao.getEmployeeById(id);
	}
	
	public int insertEmployee(Employee emp) {
		return dao.insertEmployee(emp);
	}
	
	public int updateEmployee(Employee emp,int id) {
		return dao.updateEmployeeById(emp,id);
	}
	public int deleteEmployee(int id) {
		return dao.deleteEmployeeById(id);
	}

}
