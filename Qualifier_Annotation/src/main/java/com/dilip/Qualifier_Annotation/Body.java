package com.dilip.Qualifier_Annotation;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Body 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       // System.out.println("Bean names: " + Arrays.toString(context.getBeanNamesForType(Heart.class))); 
        
        Human human=context.getBean("human",Human.class);
        
        human.startPump();
        
        
        
    }
}
