package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spel-config.xml");
        Demo demo = context.getBean("demo", Demo.class);
        System.out.println(demo);
        
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("1+2+3+4+5+6+7+8+9+10");
        System.out.println(expression.getValue());
	}

}
