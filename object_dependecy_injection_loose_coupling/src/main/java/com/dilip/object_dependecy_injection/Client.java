package com.dilip.object_dependecy_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	System.out.println("config loaded");
    	
    	
    	Student student =context.getBean("stu",Student.class);
    	student.cheat();
    	
    	Student anotherstudent =context.getBean("anotherStudent",Student.class);
    	anotherstudent.cheat();
    	
    	
        
        
        
    }
}
