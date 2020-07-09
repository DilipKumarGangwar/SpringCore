package com.dilip.spring_common_annotations;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Client 
{
    public static void main( String[] args )
    {
    	// ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
         
         College college = context.getBean("CollegeBean",College.class);
         System.out.println("College object instantiated " + college);
         college.test();
         
         context.close();
         
         
    }
}
