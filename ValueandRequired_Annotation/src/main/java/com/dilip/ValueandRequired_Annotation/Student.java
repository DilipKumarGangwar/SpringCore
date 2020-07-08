package com.dilip.ValueandRequired_Annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	int rollno;
	String name;
	String course;
	String hobby;
	

	public int getRollno() {
		return rollno;
	}
	
	@Required
	@Value("3")
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
	public String getName() {
		return name;
	}
	
	@Required
	@Value("Ashu")
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	
	@Required
	@Value("course")
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getHobby() {
		return hobby;
	}
	

	//@Value("football")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	void display() {
		
		System.out.println("RollNo ="+ getRollno());
		System.out.println("Name ="+ getName());
		System.out.println("Course ="+ getCourse());
		System.out.println("Hobby ="+ getHobby());
	}
	
	
	
	

}
