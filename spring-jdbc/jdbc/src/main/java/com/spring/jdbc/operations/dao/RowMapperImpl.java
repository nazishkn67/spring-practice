package com.spring.jdbc.operations.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.operations.entity.Student;

public class RowMapperImpl implements RowMapper<Student> {
	
	/*
	 * RowMapper is an interface which converts ResultSet object into Class object
	 */

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		
		return student;
	}

}
