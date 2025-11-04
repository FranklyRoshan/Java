package com.frank.java.tips.access.package2;

import com.frank.java.tips.access.package1.ExampleClass;

public class MethodAccessRunnerInDifferentPackage {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.publicMethod();
//		exampleClass.privateMethod();
//		exampleClass.protectedMethod();
//		exampleClass.defaultMethod();
	}

}
