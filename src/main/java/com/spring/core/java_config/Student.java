package com.spring.core.java_config;

public class Student {
	
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public Student(Employee employee) {
		super();
		this.employee = employee;
	}

	public void study() {
		employee.display();
		System.out.println("Student is studying maths");
	}

}
