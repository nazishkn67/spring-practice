package com.spring.core.standalone_collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> students;
	private Map<String, Integer> courseFee;
	private Properties properties;

	public List<String> getStudents() {
		return students;
	}

	public void setStudents(List<String> students) {
		this.students = students;
	}

	public Map<String, Integer> getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(Map<String, Integer> courseFee) {
		this.courseFee = courseFee;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [students=" + students + ", courseFee=" + courseFee + ", properties=" + properties + "]";
	}

}
