package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bean.StorePractice;

@Service
public class StoreService {

	 private List<StorePractice> list = new ArrayList<>();
	 
	 public StoreService() {
		 list.add(new StorePractice(101,"Shirt",2000));
		 list.add(new StorePractice(102,"Jeans",2000));
		 list.add(new StorePractice(103,"Pent",2000));
		 list.add(new StorePractice(104,"T-Shirt",2000));
		 list.add(new StorePractice(105,"Trauser",2000));
	 }
	 public List<StorePractice> getAllProduct(){
		 return list;
	 }
}
