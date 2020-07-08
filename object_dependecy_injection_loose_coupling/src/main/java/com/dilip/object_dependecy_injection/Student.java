package com.dilip.object_dependecy_injection;

public class Student {

	int id;
	
	cheatInterface cheat;


	public void setCheat(cheatInterface cheat) {
		this.cheat = cheat;
	}


	public void setId(int id) {
		
		this.id = id;
		System.out.println("id  initialised");
	}


	

	void cheat() {
		
		cheat.display();
	}
	
	
	
}
