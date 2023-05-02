package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/autowire-config.xml");
		Emp e=context.getBean("emp1", Emp.class);
		System.out.println(e);
	}

}