package org.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("org/springcore/ref/ref-config.xml");
         A temp=(A)context.getBean("aref");
         
         System.out.println(temp.getX());
         System.out.println(temp.getObj().getY());
         System.out.println(temp);
         
	}

}