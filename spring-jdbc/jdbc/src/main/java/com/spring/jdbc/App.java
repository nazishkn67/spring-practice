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
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		System.out.println("Database has been started...");
		
		String query = "insert into student values(?, ?, ?)";
		
		int result = template.update(query, 103, "Ajay", "Delhi");
		System.out.println("Records inserted: " + result);
		
	}
}
