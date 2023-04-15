package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.bean.Employee;

@RestController
public class EmployeeCotroller {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployee();
		
	}
	
	@GetMapping("/getEmpById/{id}")
	public Employee getEmployeeById( @PathVariable("id") int id) {
		return service.getEmployeeById(id);
	}
	
	@PostMapping("/insertEmployee")
	public String insertEmployee(@RequestBody Employee emp) {
		int rows= service.insertEmployee(emp);
		if(rows>0) {
			return "Employee Record Inserted Successfully!!!";
		}
		return "Employee Record NOT Inserted !!!";
	}
	
	@PutMapping("/updateEmployee/{id}")
	public String updateEmployee( @PathVariable("id")int id, @RequestBody Employee emp) {
		int rows=service.updateEmployee(emp, id);
		if(rows>0) {
			return "Employee Record updated Successfully!!!";
		}
		return "Employee Record NOT Updated !!!";
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee( @PathVariable("id") int id) {
		int rows=service.deleteEmployee(id);
		if(rows>0) {
			return "Employee Record deleted Successfully!!!";
		}
		return "Employee Record NOT deleted !!!";
	}
		
	}


