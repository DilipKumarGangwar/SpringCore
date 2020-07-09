package com.dilip.spring_common_annotations_2;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements  Teacher {

	public void teach() {
		// TODO Auto-generated method stub
		
		System.out.println("I am your Math Teacher");
		
	}

}
