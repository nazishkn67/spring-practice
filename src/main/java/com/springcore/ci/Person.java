package com.springcore.ci;

public class Person {
	
	private String name;
	private int PersonId;
	private Certificate ci;
	public Person(String name, int personId, Certificate ci) {
		this.name = name;
		this.PersonId = personId;
		this.ci=ci;
	}
	@Override
	public String toString() {
		return this.name+" : "+this.PersonId+"{"+this.ci.name+"}";
	}
	
	

}
