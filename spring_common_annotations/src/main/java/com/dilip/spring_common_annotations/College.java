package com.dilip.spring_common_annotations;



//@Component("CollegeBean")     //here it is same as <bean id="CollegeBean" class="/spring_common_annotations/src/main/java/com/dilip/spring_common_annotations/College"/>
//@Component     //same as @Component(name="college")
public class College {
	
	
	private Affliation affliation; //dependency
	
	private Teacher teacher;
	
	// Constructor Injection
/*	public College(Affliation affliation) {
		this.affliation = affliation;
		System.out.println("dependecy injection via constructor");
	}
*/
	
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
		
		affliation.affliationInfo();
		teacher.teach();
		System.out.println("Testing working fine");
	}



	
}
