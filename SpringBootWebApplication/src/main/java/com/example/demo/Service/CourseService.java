package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bean.Course;

@Service
public class CourseService {
	private List<Course> list = new ArrayList<>();
	
	public CourseService() {
	list.add(new Course(101,"Java"));
	list.add(new Course(102,"HTML"));
	list.add(new Course(103,"Spring"));
	list.add(new Course(104,"C++"));
	list.add(new Course(105,"SpringBootL"));
	
	}
	
	//get all  course list
	public List<Course> getAllCourses(){
		return list;
	}

	//get listby ID
	public Course getCourseById(int courseId) {
		for(Course c : list) {
			if(c.getCourseId() == courseId) {
				return c;
			}
		}
		return null;
		}
	
	//get list by Name
	public Course getCourseByName(String CourseName) {
		for (Course c : list) {
			if(c.getCourseName().equalsIgnoreCase (CourseName)) {
				return c;
			}
		}
		return null;
	}
		
	public boolean addCourse(Course c) {
		return list.add(c);
    	
    }
	//update record
	public boolean updateCourse(int courseId, Course c1) {
		for(int i=0;i<list.size(); i++) {
			Course c = list.get(i);
			if(c.getCourseId() == courseId) {
				Course c2 = list.set(i, c1);
				if(c2!=null) {
					return true;
				}
			}
		}
		return false;
		}
	
	//delete the record
	public boolean deleteCourse(int cid) {
		for(int i=0;i<list.size(); i++) {
			Course c = list.get(i);
			if(c.getCourseId() == cid) {
				Course c2 = list.remove(i);
				if(c2!=null) {
					return true;
				}
			}
		}
		return false;
		
	}
	
	}
    
    	
    
