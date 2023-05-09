package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	/*
	 * SpEL syntax:- @Value("#{expression}")
	 */
	
	@Value("#{11+23}")		
	private int x;
	
	@Value("#{5*8}")
	private int y;
	
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

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}
}
