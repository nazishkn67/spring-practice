package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	@Autowired						//annotation used for autowiring beans
	@Qualifier("address1")			//used for resolve ambiguity when more than 1 desired bean is found
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside Constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	

}