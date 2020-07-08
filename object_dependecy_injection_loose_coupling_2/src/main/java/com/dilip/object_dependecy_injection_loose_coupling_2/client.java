package com.dilip.object_dependecy_injection_loose_coupling_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client 
{
    public static void main( String[] args )
    {
       
        
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        
        Airtel airtel=context.getBean("airtel",Airtel.class);
        
        airtel.activateService();
        
        
        
        
    }
}
