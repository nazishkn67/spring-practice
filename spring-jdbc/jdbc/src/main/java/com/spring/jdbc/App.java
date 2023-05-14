package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		System.out.println("Program has been started...");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		
		//insert query
		String query = "insert into student values(?, ?, ?)";
		
		//executing query
		int result = template.update(query, 104, "Saurabh", "Bokaro");
		System.out.println("Records inserted: " + result);
		
	}
}
