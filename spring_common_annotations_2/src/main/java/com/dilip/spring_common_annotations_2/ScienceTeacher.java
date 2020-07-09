package com.dilip.spring_common_annotations_2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher {


	public void teach() {
		// TODO Auto-generated method stub
		
		System.out.println("I am your Scienece Teacher");
		
	}

}
