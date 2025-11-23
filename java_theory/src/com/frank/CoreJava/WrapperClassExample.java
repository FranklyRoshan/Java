package com.frank.CoreJava;

/*📌 What?
 * Represents wrappers around primitive data types (int, double, etc.)
 * Implemented in java.lang package (e.g., Integer, Double)
 * 
 * 📌 Why?
 * Allows primitives to be used as objects (e.g., in collections like ArrayList).
 * Works with collections and other generic classes (List<Integer>, Optional<Double>).
 * Provides utility methods (e.g., Integer.parseInt(), Double.valueOf()).
 * Supports autoboxing and unboxing, making conversions easier.
 */
import java.util.ArrayList;
import java.util.List;

public class WrapperClassExample {
	public static void main(String[] args) {
		// Cannot use List<int>
		List<Integer> numbers = new ArrayList<>();

		numbers.add(10); // Autoboxing (int → Integer)
		numbers.add(20);

		// Unboxing (Integer → int)
		int sum = numbers.get(0) + numbers.get(1);
		System.out.println("Sum: " + sum);
	}
}

/*
 * Things to Remember
 * 
 * Autoboxing: Converts a primitive into a wrapper object automatically. Integer
 * num = 10; // int → Integer
 * 
 * Unboxing: Converts a wrapper object back into a primitive automatically. int
 * value = num; // Integer → int
 * 
 * Immutable: Wrapper class objects cannot be modified after creation.
 * 
 */

/*
 * Best Practices in Using Wrapper Classes #
 * 
 * 📌 1. Creating Wrapper Objects
 * 
 * Use valueOf() instead of new (Efficient Memory Usage)
 * 
 * ✅ Preferred: // Uses cached objects Integer num = Integer.valueOf(10);
 * 
 * ❌ Avoid: // Unnecessary object creation Integer num = new Integer(10);
 * 
 * 
 * 📌 2. Avoid Autoboxing in Loops (Performance Issue) Autoboxing creates
 * unnecessary objects, leading to performance issues.
 * 
 * ✅ Preferred: int sum = 0;
 * 
 * for (int i = 0; i < 1000; i++) { sum += i; // Uses int (fast) }
 * 
 * //Even Faster int sumFunctional = IntStream.range(0, 1000).sum();
 * 
 * ❌ Avoid: Integer sum = 0; for (int i = 0; i < 1000; i++) { sum += i; //
 * Autoboxing occurs (slow) }
 * 
 * 
 * 📌 3. Use parseXxx() for String to Primitive Conversion Avoids unnecessary
 * object creation
 * 
 * ✅ Preferred: int num = Integer.parseInt("123");
 * 
 * ❌ Avoid: // Deprecated and inefficient Integer num = new Integer("123");
 * 
 */
