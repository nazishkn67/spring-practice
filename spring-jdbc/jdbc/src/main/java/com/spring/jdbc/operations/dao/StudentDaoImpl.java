package com.spring.jdbc.operations.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.operations.entity.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//this method inserts record
	@Override
	public int insert(Student student) {
		
		String query = "insert into student values(?, ?, ?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

	//this method updates record
	@Override
	public int update(Student student) {

		String query = "update student set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName() , student.getCity(), student.getId());
		return r;
	}

	//this method deletes record
	@Override
	public int delete(int id) {
		
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, id);
		return r;
	}

	//this method reads single object 
	@Override
	public Student getStudent(int id) {

		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, id);
		return student;
	}

	//this method reads multiple objects
	@Override
	public List<Student> getAllStudents() {

		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}
	
	
}
