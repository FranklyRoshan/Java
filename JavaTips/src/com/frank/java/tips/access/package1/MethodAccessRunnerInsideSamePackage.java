package com.frank.java.tips.access.package1;

public class MethodAccessRunnerInsideSamePackage {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.publicMethod();
//		exampleClass.privateMethod();
		exampleClass.protectedMethod();
		exampleClass.defaultMethod();
	}

}
