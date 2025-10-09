package com.frankly.javaproject;

public class ReturnTypeMethodRunner {

	public static void main(String[] args) {
		ReturnTypeMethod method = new ReturnTypeMethod();
		
		System.out.println(method.myMethod(3));
		System.out.println(method.myMethod(5,10));
		
		int z = method.myMethod(5, 15);
		System.out.println(z);

	}

}
