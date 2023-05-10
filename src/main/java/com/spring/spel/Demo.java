package com.spring.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	/*
	 * SpEL syntax:- #{expression}
	 * invoking static method:- T(Class).method(value)
	 * invoking static variable:- T(Class).variable
	 * creating object:- new object(value) 
	 */
	
	//passing primitive type using spel
	@Value("#{11+23}")		
	private int x;
	
	@Value("#{5*8}")
	private int y;
	
	//invoking static method using spel
	@Value("#{ T(java.lang.Math).sqrt(144)}")
	private double z;
	
	@Value("#{ T(com.spring.spel.Test).writeMessage('this is a greeting message')}")
	private String message;
	
	//invoking static variable using spel
	@Value("#{ T(java.lang.Math).PI }")
	private double pi;
	
	//creating string object using spel
	@Value("#{ new java.lang.String('Nazish Kamran') }")
	private String name;
	
	//passing boolean value using spel
	@Value("#{8-2>3}")
	private boolean isActive;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", message=" + message + ", pi=" + pi + ", name=" + name
				+ ", isActive=" + isActive + "]";
	}
}
