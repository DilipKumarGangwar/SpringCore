package com.dilip.spring_common_annotations_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component     //same as @Component(name="college")
public class College {
	

	private String collegeName;
	
	@Autowired
	private Affliation affliation; //dependency
	
	@Autowired
	@Qualifier("mathTeacher")
	private Teacher teacher;
	
	// Constructor Injection
/*	public College(Affliation affliation) {
		this.affliation = affliation;
		System.out.println("dependecy injection via constructor");
	}
*/
	
	@Required
	@Value("${college.collegeName}")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	
	//Setter Injection for affliation
	
	public void setAffliation(Affliation affliation) {
		this.affliation = affliation;
		System.out.println("Affliation dependecy injection via setter");
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
		System.out.println("Teacher dependecy injection via setter");
	}

	
	void test() {
		
		System.out.println("College name="+ collegeName);
		
		affliation.affliationInfo();
		teacher.teach();
		System.out.println("Testing working fine");
	}



	
}
