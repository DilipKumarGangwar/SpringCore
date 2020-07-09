package com.dilip.spring_common_annotations_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client 
{
    public static void main( String[] args )
    {
    	// ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
         
         College college = context.getBean("college",College.class);
         System.out.println("College object instantiated " + college);
         college.test();
         
         context.close();
         
         
    }
}
