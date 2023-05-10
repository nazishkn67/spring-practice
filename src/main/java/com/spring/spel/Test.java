package com.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/spel/spel-config.xml");
        Demo demo = context.getBean("demo", Demo.class);
        System.out.println(demo);
        
        //SpelExpressionParser is also used to parse and execute expressions 
        SpelExpressionParser parser = new SpelExpressionParser();
        
        //expression result is stored in Expression object and can be retrieved using getValue() method 
        Expression expression = parser.parseExpression("1+2+3+4+5+6+7+8+9+10");	
        System.out.println(expression.getValue());
	}
	
	//creating static method for invoking it and storing the output in a variable using spel 
	public static String writeMessage(String message) {
		return message;
	}
}
