package com.dilip.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	private Heart heart;

	public Human() {
	    System.out.println("Default Constructor called");
	}

    @Autowired       // to make annotation on , use context:annotation-config in beans.xml
	public Human(Heart heart) {           //this is used when autowire is done via constructor
		this.heart = heart;
	}

	//@Autowired  can be written here also,but at one place only
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
