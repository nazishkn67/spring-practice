package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle-config.xml");
		
		Samosa s1=(Samosa)context.getBean("s1"); 
		System.out.println(s1);
		
		Pepsi p1=(Pepsi)context.getBean("p1");
		System.out.println(p1);
		
		context.registerShutdownHook();		//using pre-shutdown hook we can call destroy() method
		
		Example e1=(Example)context.getBean("example");
		System.out.println(e1);
	
	}

}