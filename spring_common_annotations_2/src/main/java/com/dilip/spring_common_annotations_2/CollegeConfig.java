package com.dilip.spring_common_annotations_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;



@Configuration
@ComponentScan(basePackages="com.dilip.spring_common_annotations_2")

@PropertySource("classpath:collegeInfo.properties")
public class CollegeConfig {

	
	
	
	
}
