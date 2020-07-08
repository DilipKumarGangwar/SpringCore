package com.dilip.object_dependecy_injection;

public class Student {

	int id;
	
	EnglishCheat englishCheat;


	public void setId(int id) {
		
		this.id = id;
		System.out.println("id  initialised");
	}


	public void setEnglishCheat(EnglishCheat englishCheat) {
		
		this.englishCheat = englishCheat;
		System.out.println("english object initialised");
	}

	void cheat() {
		
		englishCheat.display();
	}
	
	
	
}
