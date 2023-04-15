package com.demo;

import java.util.List;

public class StudentAssignment {
	private int rollNo;
	private String name;
	private float percentage;
	private char grade;
	private List<String> subject;
	
	public StudentAssignment()
	{
		
	}

	public StudentAssignment(int rollNo, String name, float percentage, char grade, List<String> subject) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
		this.grade = grade;
		this.subject = subject;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "StudentAssignment [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", grade="
				+ grade + ", subject=" + subject + "]";
	}
	
	
	
	

}
