package com.frank.java.tips.access.package1;

public class ExampleClass {

	public void publicMethod() {
	}

	private void privateMethod() {
	}

	protected void protectedMethod() {
	}

	void defaultMethod() {
	}

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.publicMethod();
		exampleClass.privateMethod();
		exampleClass.protectedMethod();
		exampleClass.defaultMethod();
		
	}

}
