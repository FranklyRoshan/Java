package com.frank.api.m;

import java.util.stream.Gatherers;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGathererRunner {

	// Gatherer.fold method
	private static void fold() {
		// 1 to 20
		Stream<Integer> numbers = IntStream.rangeClosed(1, 20).boxed();
		numbers.gather(Gatherers.fold(() -> 0, (sum, i) -> sum + i)).forEach(System.out::println);
	}

	// Gatherer.mapConcurrent method
	private static void mapConcurrent() {
		// 1 to 20
		Stream<Integer> numbers = IntStream.rangeClosed(1, 20).boxed();
		numbers.gather(Gatherers.mapConcurrent(4, i -> i * 1)).forEach(System.out::println);
	}

	// Gatherer.mapConcurrent method
	private static void windowFixed() {
		// 1 to 20
		Stream<Integer> numbers = IntStream.rangeClosed(1, 20).boxed();
		numbers.gather(Gatherers.windowFixed(5)).forEach(System.out::println);
	}

	// Gatherer.windowsliding
	private static void windowSliding() {
		// 1 to 20
		Stream<Integer> numbers = IntStream.rangeClosed(1, 20).boxed();
		numbers.gather(Gatherers.windowSliding(5)).forEach(System.out::println);
	}

	public static void main(String[] args) {
		fold();
		mapConcurrent();
		windowFixed();
		windowSliding();

	}

}

/*
 * Getting Started with Stream Gatherers (Java 24)
 * 
 * numbers.gather(Gatherers.windowSliding(5)) .forEach(System.out::println); //
 * Output: [1,2,3,4,5],.., [16,17,18,19,20]
 * 
 * Enhanced stream processing: Enhances stream processing with more control and
 * flexibility
 * 
 * Intermediate Transformations and Grouping: Lets you transform and group
 * stream elements while streaming, not just at the end like col lect ()
 * 
 * Lots of Flexibility: Support for windows, sliding views, parallel mapping,
 * and custom accumulation Example functions:
 * 
 * 1. fold () - Combines all stream values into one using custom logic (like a
 * running total).
 * 
 * 2. mapConcurrent () - Processes elements in parallel using a function, ideal
 * for heavy/slow tasks.
 * 
 * 3. windowFixed () - Splits the stream into equal-sized, non-overlapping
 * groups
 * 
 * 4. windowSliding() - Creates overlapping groups for sliding window
 * computations.
 * 
 * 
 * 1. Gatherers.fold method
 * 
 * var numbers = IntStream. rangeClosed(1, 20).boxed();
 * 
 * numbers.gather(Gatherers.fold()).forEach(System.out::println); // Output: 210
 * 
 * What?: Combines all elements in the stream into a single result (like adding
 * numbers together).
 * 
 * How?: You provide a starting value (e.g., 0) and a rule to combine values
 * (e.g., sum + i).
 * 
 * ⚫ Usecase: Great for tasks like summing, multiplying, or custom reductions.
 * 
 *
 * 2. Gatherers.mapConcurrent method
 * 
 * var numbers = IntStream. rangeClosed(1, 20).boxed();
 * 
 * numbers.gather(Gatherers.mapConcurrent()). forEach (System.out::println); //
 * Output: squares of 1-20 (unordered)
 * 
 * What?: Applies a function (like squaring) to each element in parallel.
 * 
 * ⚫ Control Maximum Concurrency: You control how many operations can run at the
 * same time (with maxConcur rency).
 * 
 * Usecase: Useful for speeding up slow operations using concurrency (e.g., API
 * calls or heavy calculations
 * 
 * 
 * 3. Gatherers.windowFixed method
 * 
 * var numbers = IntStream. rangeClosed (1, 20).boxed();
 * 
 * numbers.gather(Gatherers.windowFixed(5)).forEach(System.out::println);
 * 
 * // Output: [1,2,3,4,5], [6,7,8,9,10], ..., [16,17,18,19,20]
 * 
 * What?: Groups the stream elements into non-overlapping fixed-size
 * 
 * Example:For example, if the size is 5, you'll get [1,2,3,4,5], [6,7,8,9,10],
 * etc.
 * 
 * • Usecase: Helpful when processing data in equal-sized chunks or batches.
 * 
 * 
 * 4. Gatherers.windowSliding method
 * 
 * var numbers = IntStream.rangeClosed(1, 20).boxed();
 * 
 * numbers.gather(Gatherers.windowSliding(5)).forEach(System.out::println);
 * 
 * [16, 17,18,19,20]
 * 
 * // Output: [1,2,3,4,5], [2,3,4,5,6],...,
 * 
 * ⚫ Create Sliding Windows: Creates overlapping lists (sliding windows) of a
 * given size.
 * 
 * Example: With a window size of 5, you'll get [1,2,3,4,5], [2,3,4,5,6],
 * [3,4,5,6,7], etc.
 * 
 * Ideal Usecase: Ideal for running calculations over moving windows, like
 * averages or trends.
 * 
 */
