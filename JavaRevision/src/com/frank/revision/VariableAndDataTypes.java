package com.frank.revision;

public class VariableAndDataTypes {

	public static void main(String[] args) {
		// primitive declarations
		byte b = 100; // -128 .. 127
		short s = 30000; // -32768 .. 32767
		int i = 2_000_000_000; // 32-bit
		long l = 9_000_000_000L; // 64-bit (note L suffix)
		float f = 3.14f; // f suffix for float
		double d = 3.141592653589793; // double by default
		char c = 'A'; // 16-bit UTF-16 code unit
		boolean flag = true;

		// boxing / unboxing
		Integer boxed = i; // autoboxing
		int unboxed = boxed; // unboxing

		int x = 10; // autobox to Integer
		int y = x; // unbox to int
//		Integer z = null;
//		int w = z; // NullPointerException on unboxing

		// narrowing conversion (explicit cast)
		int big = 130;
		byte small = (byte) big; // results in -126 due to truncation/wrap

		int integer = 130;
		byte bytes = (byte) integer; // results in -126 due to truncation (wrap)

		// byte arithmetic is promoted to int
		byte b1 = 10;
		byte b2 = 20;
		int sum = b1 + b2; // b1+b2 promoted to int

		// String (non-primitive)
		String name = "Frank";

		// final constants
		final int MAX = 100;

		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("Integer: " + i);
		System.out.println("small (after cast): " + small);
		System.out.println("boxed: " + boxed);
		System.out.println("string: " + name);

		// ByteOverflow
		byte num = 127;
		num = (byte) (num + 1); // arithmetic b+1 promoted to int, cast back to byte
		System.out.println(num); // prints -128
		
		  // Primitive int variable
        int primitiveInt = 100;

        // Autoboxing: Assigning a primitive int to an Integer object
        Integer wrappedInt = primitiveInt; 

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer (autoboxed): " + wrappedInt);

        // Autoboxing in method arguments
        printInteger(25); // The primitive '25' is autoboxed to an Integer object

        // Autoboxing with Collections
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(50); // The primitive '50' is autoboxed to an Integer object
	    numbers.add(75); // The primitive '75' is autoboxed to an Integer object
	
	    System.out.println("ArrayList of Integers: " + numbers);

	}
	
	public static void printInteger(Integer num) {
		System.out.println("Received Integer object: " + num);
	}


}


