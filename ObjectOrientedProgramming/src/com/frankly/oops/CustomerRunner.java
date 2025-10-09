package com.frankly.oops;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("line 1", "Hyderabad", "123456");
		Customer customer = new Customer("Frank", homeAddress);

		Address workAddress = new Address("line 1 for work", "Hyderabad", "123456");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);

	}

}
