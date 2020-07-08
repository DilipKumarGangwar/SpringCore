package com.dilip.Qualifier_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	private Heart heart;

	public Human() {
	    System.out.println("Default Constructor called");
	}

   
	
    public Human(Heart heart) {           //this is used when autowire is done via constructor
		this.heart = heart;
	}
    
    @Autowired
    @Qualifier("humanHeart")
	public void setHeart(Heart heart) {      //this is used when autowire is done via byName , byType
		this.heart = heart;
	    System.out.println("Heart Constructor called");
	}
	
	
	
	 void startPump() {
		
		if(heart == null) {
			System.out.println("Dead..");
			
			
		}
		else {
			heart.pump();
		}
	}
	
	
}
