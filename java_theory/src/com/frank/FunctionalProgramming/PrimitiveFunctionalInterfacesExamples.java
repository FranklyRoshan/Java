package com.frank.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.stream.Collectors;

public class PrimitiveFunctionalInterfacesExamples {

	public static void main(String[] args) {

		System.out.println("--- Primitive Functional Interfaces Demo ---\n");

		// -----------------------------------------------------------
		// 1. INT PRIMITIVES (int)
		// -----------------------------------------------------------

		System.out.println("1. INT Primitives (Focus on 'int'):");

		// IntPredicate: int -> boolean
		IntPredicate isEven = x -> x % 2 == 0;
		System.out.println("   IntPredicate (isEven): 10 is even? " + isEven.test(10));

		// IntFunction<String>: int -> String (Maps int to a generic type)
		IntFunction<String> mapToString = x -> "Number: " + x;
		System.out.println("   IntFunction<String> (Map): " + mapToString.apply(25));

		// IntConsumer: int -> void (Performs an action, no return)
		IntConsumer printSquared = x -> System.out.println("   IntConsumer (Square): " + (x * x));
		printSquared.accept(5);

		// IntBinaryOperator: (int, int) -> int (Takes two ints, returns one int)
		IntBinaryOperator multiply = (x, y) -> x * y;
		System.out.println("   IntBinaryOperator (Multiply): 5 * 6 = " + multiply.applyAsInt(5, 6));

		// DEMO in Stream (avoids boxing IntStream to Stream<Integer>)
//		List<Integer> boxedEvens = Arrays.asList(1, 2, 3, 4, 5).stream().mapToInt(Integer::intValue) // Stream<Integer>
//																										// -> IntStream
//				.filter(isEven) // Uses IntPredicate
//				.mapToObj(mapToString) // Uses IntFunction
//				.collect(Collectors.toList());
//		System.out.println("   IntStream filter result: " + boxedEvens);

		// The stream pipeline demonstrating the use of primitive streams (IntStream)
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println("Original List: " + numbers);

		// Stream Pipeline Explanation:
		List<String> boxedEvens = numbers.stream()
				// .mapToInt(Integer::intValue): Unboxes Stream<Integer> to the primitive
				// IntStream
				.mapToInt(Integer::intValue)

				// .filter(isEven): Uses the primitive IntPredicate (no boxing here)
				.filter(isEven)

				// .mapToObj(mapToString): Converts primitive int back to a generic type
				// (String)
				.mapToObj(mapToString)

				// .collect(Collectors.toList()): Collects the resulting String objects
				.collect(Collectors.toList());

		System.out.println("IntStream filter result: " + boxedEvens);
		// Expected Output: [Number: 2, Number: 4]

		// -----------------------------------------------------------
		// 2. LONG PRIMITIVES (long)
		// -----------------------------------------------------------

		System.out.println("\n2. LONG Primitives (Focus on 'long'):");

		// LongPredicate: long -> boolean
		LongPredicate isLarge = x -> x > 1_000_000L;
		System.out.println("   LongPredicate (isLarge): " + isLarge.test(1_000_001L));

		// DEMO in Stream
		long[] numbersArray = { 10L, 20L, 30L };
		long sum = Arrays.stream(numbersArray).reduce(0L, (a, b) -> a + b); // Uses LongBinaryOperator implicitly
		System.out.println("   LongBinaryOperator (Reduce Sum): " + sum);

		// -----------------------------------------------------------
		// 3. DOUBLE PRIMITIVES (double)
		// -----------------------------------------------------------

		System.out.println("\n3. DOUBLE Primitives (Focus on 'double'):");

		// DoubleFunction<T>: double -> T (Maps double to a generic type)
		DoubleFunction<String> formatCurrency = d -> String.format("$%.2f", d);
		System.out.println("   DoubleFunction (Format): " + formatCurrency.apply(123.456));

		// DoubleConsumer: double -> void
		DoubleConsumer printPercent = d -> System.out.println("   DoubleConsumer (Percent): " + (d * 100) + "%");
		printPercent.accept(0.75);
	}
}