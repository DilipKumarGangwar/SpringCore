package com.dilip.Autowiring;

public class Human {

	private Heart heart;

	public Human(Heart heart) {           //this is used when autowire is done via constructor
		this.heart = heart;
	}

	
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
