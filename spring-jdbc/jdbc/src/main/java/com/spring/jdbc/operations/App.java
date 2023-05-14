package com.spring.jdbc.operations;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.operations.dao.StudentDao;
import com.spring.jdbc.operations.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		System.out.println("Program has been started...");
		
//		For XML based configuration
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/operations/operations-config.xml");
		
//		For Java based configuration		
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		
		
//		Inserting one record
//		Student student = new Student();
//		student.setId(104);
//		student.setName("Saurabh");
//		student.setCity("Delhi");
//		int result = studentDao.insert(student);
//		System.out.println("Records inserted: " + result);

//		Updating one record		
//		Student student = new Student();
//		student.setId(104);
//		student.setName("Kashif");
//		student.setCity("Kolkata");
//		int result = studentDao.update(student);
//		System.out.println("Records updated: " + result);
		
//		Deleting one record
//		int result = studentDao.delete(104);		
//		System.out.println("Records deleted: " + result);
		
//		Reading single object
//		Student student =studentDao.getStudent(101);
//		System.out.print(student);
		
//		Reading multiple objects
		List<Student> students = studentDao.getAllStudents();
		for(Student s : students)
			System.out.println(s);
		
	}
}
