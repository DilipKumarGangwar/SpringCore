package com.dilip.object_dependecy_injection;

public class AnotherStudent {
	
	
	EnglishCheat englishCheat;


	


	public void setEnglishCheat(EnglishCheat englishCheat) {
		
		this.englishCheat = englishCheat;
		System.out.println("english object  initialised for another student");
	}

	void cheat() {
		
		englishCheat.display();
	}
	

}
