package com.spring.core.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	/* 	
	 * @ComponentScan(basePackages="") 		- used for component scanning 
	 * @Configuration 						- used for configuring the beans
	 * @Bean 								- used to create a bean
	 */
	
	@Bean(name="employee")
	public Employee getEmployee() {
		return new Employee();
	}
	
	@Bean(name="student")
	public Student getStudent() {
		Student student = new Student(getEmployee());
		return student;
	}
}
