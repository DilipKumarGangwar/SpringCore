package com.dilip.spring_common_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.dilip.spring_common_annotations")
public class CollegeConfig {

	@Bean
	public Affliation affliationBean() {            //principal Bean
		System.out.println("Affliation Bean Created");
		return new Affliation();
		
	}
	
	@Bean
	public Teacher teachBean() {
		
		System.out.println("Teacher Bean Created");
		
		return new MathTeacher();  
	}
	
	
	
	@Bean             //ok, creates bean with name as CollegeBean, same as method name
	
	//@Bean(name= {"collegeid1","col2"})   //ok
	 //@Bean(name= "collegeid1")   //ok
	public College CollegeBean() {              // College Bean
		System.out.println("College Bean Created");
		//College college = new College(affliationBean());  //for constructor injection
		College college = new College();
		
		college.setAffliation(affliationBean()); //injecting dependency
		
		college.setTeacher(teachBean());
		return college;
	}
	
	
	
}
