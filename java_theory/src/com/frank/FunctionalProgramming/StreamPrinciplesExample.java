package com.frank.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPrinciplesExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Original List: " + numbers);

        // ------------------------------------------------------------------
        // 1. Streams Are IMMUTABLE & Do NOT Store Data
        // ------------------------------------------------------------------
        System.out.println("\n--- 1. Immutability Demo ---");

        // The stream operation triples the numbers
        List<Integer> tripledList = numbers.stream()
            .map(n -> n * 3) // Intermediate operation
            .collect(Collectors.toList()); // Terminal operation

        System.out.println("Tripled List (New Data): " + tripledList);
        System.out.println("Original List (Unchanged): " + numbers); 
        // The original 'numbers' list is guaranteed to remain [1, 2, 3, 4, 5].


        // ------------------------------------------------------------------
        // 2. Streams Are LAZY (Execution only happens on the terminal call)
        // ------------------------------------------------------------------
        System.out.println("\n--- 2. Laziness Demo ---");

        System.out.println("Defining stream pipeline (No output yet):");
        
        // This pipeline is defined but the map operation (the println) is NOT executed yet.
        Stream<Integer> lazyStream = numbers.stream()
            .map(n -> {
                System.out.println("  [Lazy Map executed for] " + n);
                return n * 10;
            });

        System.out.println("Pipeline defined. Now calling terminal operation (forEach):");
        
        // The terminal operation triggers the entire pipeline (including the println inside map)
        lazyStream.forEach(n -> System.out.println("  [Terminal ForEach] Result: " + n));


        // ------------------------------------------------------------------
        // 3. Streams Cannot Be REUSED (The single-use principle)
        // ------------------------------------------------------------------
        System.out.println("\n--- 3. Non-Reusability Demo ---");

        Stream<Integer> reusableStream = numbers.stream();
        
        System.out.println("Attempt 1: First terminal operation (consumes stream)");
        reusableStream.forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nAttempt 2: Second terminal operation on the same stream (causes Error)");
        try {
            // ❌ This line will throw an IllegalStateException
            reusableStream.count(); 
        } catch (IllegalStateException e) {
            System.err.println("Caught Expected Error: " + e.getMessage());
            System.err.println("You must create a NEW stream (e.g., numbers.stream()) for a second operation.");
        }
    }
}