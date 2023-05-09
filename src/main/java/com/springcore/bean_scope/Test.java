package com.springcore.bean_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/bean_scope/scope-config.xml");
        Employee e1 = context.getBean("employee", Employee.class);
        System.out.println("e1 hashcode: " + e1.hashCode());
        
        Employee e2 = context.getBean("employee", Employee.class);
        System.out.println("e2 hashcode: " + e2.hashCode());
        
        Student s1 = context.getBean("student", Student.class);
        System.out.println("s1 hashcode: " + s1.hashCode());
        
        Student s2 = context.getBean("student", Student.class);
        System.out.println("s2 hashcode: " + s2.hashCode());
	}

}
