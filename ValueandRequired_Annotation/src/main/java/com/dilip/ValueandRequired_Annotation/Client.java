package com.dilip.ValueandRequired_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client 
{
    public static void main( String[] args )
    {
       
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Beans.xml config loaded");
        Student student = context.getBean("stu",Student.class);
        
        System.out.println("Student object "+ student);
        
        student.display();
        
        
    }
}
