package org.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("org/springcore/ci/ci-config.xml");
		Person p=(Person)context.getBean("person");
		System.out.println(p);
		
		Addition add=(Addition)context.getBean("add");
		add.doSum();
		
	}

}