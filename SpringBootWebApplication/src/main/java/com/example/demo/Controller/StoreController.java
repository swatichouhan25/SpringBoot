package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.StorePractice;
import com.example.demo.Service.StoreService;

@RestController
public class StoreController {

	@Autowired
	private StoreService service;
	
	@GetMapping("/getProduct")
	public List<StorePractice> getAll(){
		return service.getAllProduct();
	
	}
	
	
}
