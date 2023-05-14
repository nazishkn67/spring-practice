package com.spring.jdbc.operations;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.operations.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = "com.spring.jdbc.operations")
public class JdbcConfig {
	
	@Bean(name="{ds}")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	@Bean(name="{jdbcTemplate}")
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate(getDataSource());
		return template;
	}
	
//	@Bean(name="studentDao")
//	public StudentDaoImpl getStudentDao() {
//		StudentDaoImpl studentDao = new StudentDaoImpl();
//		studentDao.setJdbcTemplate(getTemplate());
//		return studentDao;
//		
//	}

}
