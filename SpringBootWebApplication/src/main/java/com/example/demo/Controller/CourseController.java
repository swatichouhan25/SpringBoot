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

import com.example.demo.Service.CourseService;
import com.example.demo.bean.Course;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@GetMapping("/getCourses")
	public List<Course> getAll(){
		return service.getAllCourses();
	}
	
	@GetMapping("/getCourseById/{cid}")
	public Course getCourseById(@PathVariable("cid") int id) {
		return service.getCourseById(id);
	}
	
	@GetMapping("/getCourseByName/{cName}")
	public Course getCourseByName(@PathVariable("cName") String Name) {
		return service.getCourseByName(Name);
	}

	@PostMapping("/addCourse")
	public String addCourse(@RequestBody Course c) {
		boolean status= service.addCourse(c);
		if(status) {
			return "Course Details Added Successfully";
		}
		return "Course Details Not Addedd!!!";
	}
	
	@PutMapping("/updateCourse/{cid}")
	public String updateCourse(@PathVariable("cid") int id,@RequestBody Course c) {
		boolean status= service.updateCourse(id,c);
		if(status) {
			return "Course Details Updated Successfully";
		}
		return "Course Details Not Updated!!!";
	}
	@DeleteMapping("/deleteCourse/{id}")
	public String deleteCourse( @PathVariable("id")int  id) {
		
		boolean status= service.deleteCourse(id);
		if(status) {
			return "Course Details deleted Successfully";
		}
		return "Course Details Not Deleted!!!";
	
		
	}

}
