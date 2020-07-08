package com.dilip.SpringCore_Setter_Constructor_Injection;

public class Student {
	
	private String studentName;
	int id;
	
	
	
	
//	public void setId(int id) {
//		this.id = id;
//	}
//
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//		//this.id = id;
//	}
//	

	
	
	/****************For Constructor Injection********************/
	
	public Student(String studentName, int id) {
		super();
		this.studentName = studentName;
		this.id = id;
	} 	
	
	
	void displayInfo() {
		
		System.out.println("Student Name="+ studentName + " Id="+id);
		
	}


}
