package com.frank.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingBenefitsDemo {

    public static void main(String[] args) {
        
        System.out.println("--- Functional Programming Benefits Demo ---");

        // The core idea of FP: focus on 'what to do' rather than 'how to do it.'
        // We define the transformations as a clear pipeline of steps.
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("\nOriginal Numbers: " + numbers);

        // This demonstrates the benefits of Declarative Style and Immutability:
        // The process is described clearly step-by-step, and the original 'numbers' list is untouched.
        
        List<String> transformedNumbers = numbers.stream()
                // Step 1: map() transforms the data. Immutability ensures the original stream elements aren't changed.
                .map(x -> x * x)        // 1. Square each number (1, 4, 9, 16, 25)
                
                // Step 2: Another map() operation continues the clear pipeline.
                .map(x -> x + 10)       // 2. Add 10 (11, 14, 19, 26, 35)
                
                // Step 3: Final transformation using a method reference.
                // Concise Code: String.valueOf(x) is cleaner than (x -> String.valueOf(x))
                .map(x -> "Value: " + x) // 3. Convert to String
                
                // Terminal Operation: Collects the result, triggering the lazy execution.
                // toList() is a concise way to collect elements (Java 16+)
                .toList();
                
        // Demonstrates output from the Declarative Style pipeline
        System.out.println("Transformed List (Declarative Pipeline): " + transformedNumbers);

        // Demonstrates Immutability: The original list remains unchanged.
        System.out.println("Original List after transformation: " + numbers);
        
        
        // --- Demonstration of Thread Safety / Conciseness ---
        
        System.out.println("\nDemonstration of Conciseness and Thread Safety (No Shared State):");

        // Concise Code: Using Lambda to define a Runnable for thread creation.
        // Thread Safety: This function has no side effects and no shared state with the main thread.
        Thread thread = new Thread(
            () -> System.out.println("   Thread running safely with concise Lambda syntax."));

        thread.start();
    }
}

/*
 * Functional Programming offers several significant benefits in modern software
 * development, primarily centered around readability, correctness, and
 * concurrency. The core advantage is shifting the focus from how data
 * processing is done (imperative) to what the desired transformation is
 * (declarative).
 * 
 * ✨ Benefits of Using Functional Programming Here is a summary of the benefits
 * you listed, which stem directly from the core principles of Immutability and
 * No Side Effects:
 * 
 * 1. Improved Readability and Conciseness (Declarative Style) FP uses a
 * declarative style, allowing developers to define a series of transformations
 * (a pipeline) on data. This makes the code read like a specification of the
 * problem.
 * 
 * Concise Code: Lambda expressions and method references significantly reduce
 * the boilerplate code required for implementing single-method interfaces (like
 * Runnable or Comparator).
 * 
 * 2. Enhanced Correctness (Immutability & No Side Effects) Immutability: Since
 * variables and data structures are not modified after creation, it eliminates
 * unexpected changes to the state of the application. This drastically reduces
 * the surface area for bugs.
 * 
 * No Side Effects: Functions only rely on their inputs and only affect their
 * output. They don't modify global variables or perform I/O that changes
 * external state, making them easier to test and reason about. This simplifies
 * debugging, as errors are localized to the function's inputs.
 * 
 * 3. Better Performance and Thread Safety Thread Safety: The absence of shared,
 * mutable state means that multiple threads can process data simultaneously
 * without needing complex synchronization mechanisms (locks). This avoids
 * common concurrency issues like race conditions.
 * 
 * Parallel Processing: The immutable and stateless nature of functional
 * operations makes them perfectly suited for distribution across multiple CPU
 * cores using Parallel Streams, leading to significant performance gains on
 * large datasets.
 */