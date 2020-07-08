package com.dilip.SpringCore_Setter_Constructor_Injection;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class Exam 
{
    public static void main( String[] args )
    {
//        Student student=new Student();
//        student.setStudentName("dilip", 1);
//        student.displayInfo();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	System.out.println("Bean names: " + Arrays.toString(context.getBeanNamesForType(Student.class)));
    	
    	Student stu = context.getBean("student",Student.class);  //fetching object from container    	
    	stu.displayInfo();
    	
    	Student stu2 = context.getBean("student2",Student.class);  //fetching object from container    	
    	stu2.displayInfo();
    	
    	
    	
    	
        
        
    }
}
