package com.spring.core.standalone_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/spring/core/standalone_collections/standalone-collections-config.xml");
		
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
		System.out.println(person.getStudents().getClass().getName());
		System.out.println(person.getCourseFee().getClass().getName());
		System.out.println(person.getProperties().getClass().getName());
	}

}
