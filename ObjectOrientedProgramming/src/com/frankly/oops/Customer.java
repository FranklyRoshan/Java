package com.frankly.oops;

public class Customer {

//	State
	private String name;
//	Object Composition
	private Address homeAddress;
	private Address workAddress;

//	Creating
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

//	Operations
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
		return String.format("Name - %s; \nHome Address - %s; \nWorkAddress - %s", name, homeAddress, workAddress);
	}

}
