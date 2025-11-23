package com.frank.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class ParallelStreamPerformanceDemo {

    // Custom static method for traditional imperative style summation
    private static long addListImperative(List<Long> numbers) {
        long sum = 0; // 👈 State (sum) is MUTABLE and shared
        for (long number : numbers) { // 👈 Explicit Loop (HOW)
            sum += number; // 👈 Modifying the state, problematic for parallelism
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("--- How Parallel Streams Enhance Performance in Java? ---");

        // Data setup for demonstration
        final long MAX_RANGE = 1_000_000_000L; // 1 Billion operations
        
        // Traditional Imperative Style
        System.out.println("\n1. Traditional Imperative vs. Functional Style:");
        
        // This simulates the data source (creating a small list for clarity)
        List<Long> numbers = Arrays.asList(1L, 2L, 3L, 4L, 5L); 
        
        // Traditional Programming: Uses loops and shared variables. Hard to parallelize.
        System.out.println("   Imperative Sum (Small List): " + addListImperative(numbers));
        
        // Functional Programming: Uses stateless streams (reduce). Easy to run in parallel.
        System.out.println("   Functional Sum (Small List): " + numbers.stream().reduce(0L, Long::sum));

        System.out.println("\n---------------------------------------------------------");

        // ----------------------------------------------------------------------
        // 2. Parallel Stream Creation and Performance Comparison
        // ----------------------------------------------------------------------
        
        // We use LongStream.range for efficient generation of a large dataset
        System.out.println("2. Sequential vs. Parallel Performance on " + MAX_RANGE + " numbers:");

        // --- SEQUENTIAL EXECUTION ---
        long startTime = System.currentTimeMillis();
        
        // Sequential Sum: Runs on a single thread (LongStream.range is sequential by default)
        long sequentialSum = LongStream.range(0, MAX_RANGE)
                                     .sum(); // The sum() method is a terminal reduction
        
        long endTime = System.currentTimeMillis();
        long sequentialTime = endTime - startTime;
        
        System.out.printf("   [Sequential Sum] Result: %d, Time: %d ms%n", sequentialSum, sequentialTime);

        // --- PARALLEL EXECUTION ---
        startTime = System.currentTimeMillis();
        
        // Parallel Sum: .parallel() splits the range and processes chunks across multiple cores
        long parallelSum = LongStream.range(0, MAX_RANGE)
                                     .parallel() // Enables Parallel Processing
                                     .sum();
        
        endTime = System.currentTimeMillis();
        long parallelTime = endTime - startTime;

        System.out.printf("   [Parallel Sum]   Result: %d, Time: %d ms%n", parallelSum, parallelTime);
        System.out.println("   Performance Difference: " + (double)sequentialTime / parallelTime + "x faster (approx)");

        System.out.println("\n---------------------------------------------------------");

        // ----------------------------------------------------------------------
        // 3. parallel() vs parallelStream()
        // ----------------------------------------------------------------------
        
        List<Integer> intNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        System.out.println("3. parallel() vs parallelStream():");
        
        // Example - Using parallelStream()
        // Feature: Directly creates a parallel stream from a Collection
        System.out.print("   parallelStream() output (Order not guaranteed): ");
        intNumbers.parallelStream() // When starting from a collection
                  .forEach(n -> System.out.print(n + " "));

        // Example - Using parallel()
        // Feature: Converts an existing sequential stream to parallel
        System.out.print("\n   stream().parallel() output (Order not guaranteed): ");
        intNumbers.stream()
                  .parallel() // When you already have a stream
                  .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}

/*
 * parallel() vs parallelStream()
 * 
 * Feature - parallel() - parallelStream()
 * 
 * Applied On - Any existing stream - Collections (List, Set, etc.)
 * 
 * Purpose - Converts a sequential stream to parallel - Directly creates a
 * parallel stream
 * 
 * When to Use? - When you already have a stream - When starting from a
 * collection
 * 
 * Example - list.stream().parallel() - list.parallelStream()
 * 
 * 
 */