package com.frank.api.d;

class SampleClass {
	String str = null;
}

public class StringNewApiRunner {

	public static void main(String[] args) {
		System.out.println(" ".isBlank());
		System.out.println("Frank".isBlank());
		System.out.println(" LR ".strip().replace(" ", "@"));
		System.out.println(" LR ".stripLeading().replace(" ", "@"));
		System.out.println(" LR ".stripTrailing().replace(" ", "@"));

		System.out.println("Line1\nLine2\nLine3\nLine4".lines());
		"Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);

		System.out.println("UPPER".transform(s -> s.substring(2)));
		System.out.println("My name is %s, My age is %d.".formatted("Frank", 24));


//		String str = null;
//		System.out.println(str.isBlank());
//		java.lang.NullPointerException: Cannot invoke "String.isBlank()" because "str" is null
//		at com.frank.api.d.StringNewApiRunner.main(StringNewApiRunner.java:19)

		SampleClass sample = new SampleClass();
		System.out.println(sample.str.isBlank());
//		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isBlank()" because "sample.str" is null
//		at com.frank.api.d.StringNewApiRunner.main(StringNewApiRunner.java:28)

		/*
		 * In earlier version of Java, It doesn't show which string is null whether the
		 * "str" in main method or "sample.str". But, In JDK14 update it clearly shows
		 * in the console
		 */

	}

}
