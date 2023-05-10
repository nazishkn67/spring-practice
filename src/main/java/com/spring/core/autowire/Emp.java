package com.spring.core.autowire;

public class Emp {
	
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