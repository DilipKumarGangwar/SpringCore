package com.dilip.ValueandRequired_Annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${stu.rollno}")  // //fetching values from properties file ,here it also means that @Required is present by default
	int rollno;
	String name;
	String course;
	String hobby;
	
    
	public int getRollno() {
		return rollno;
	}
	
	
	  
	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println("Roll no initialised");
	}
	
	
	
	public String getName() {
		return name;
	}
	
	@Required
	@Value("${stu.name}") 
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	
	@Required
	@Value("${stu.course}")
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
