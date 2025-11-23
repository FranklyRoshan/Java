package com.frank.FunctionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class IntermediateAndTerminalOperations {

    public static void main(String[] args) {

        // --- Data Sets for Demonstration ---
        List<Integer> numbers = Arrays.asList(5, 12, 8, 25, 15, 8, 10, 30, 4);
        List<String> courses = Arrays.asList("Java", "Spring", "AWS", "Java", "Docker", "Python", "Microservices");
        
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Original Courses: " + courses);
        System.out.println("\n-------------------------------------------------");

        // **********************************************
        // 1. INTERMEDIATE OPERATIONS (Lazy Execution)
        // **********************************************
        
        System.out.println("1. INTERMEDIATE OPERATIONS DEMO (Pipeline Setup):");

        // The stream pipeline is built here but ONLY runs when the final collect() is called.
        List<String> processedCourses = courses.stream()
            // 1. distinct(): Removes the duplicate "Java"
            .distinct()
            .peek(c -> System.out.println("   [Peek 1] After Distinct: " + c))
            
            // 2. filter(): Keeps only courses longer than 4 characters
            .filter(c -> c.length() > 4)
            .peek(c -> System.out.println("   [Peek 2] After Filter: " + c))
            
            // 3. sorted(): Sorts the filtered list alphabetically
            .sorted()
            
            // 4. limit(n): Takes only the first 3 results after sorting
            .limit(3)
            
            // 5. map(): Transforms the course name to its length
            .map(String::length)
            
            // 6. skip(n): Skips the first element (the shortest course length)
            .skip(1)
            
            // 7. takeWhile(predicate): Takes elements while the condition is true
            //    (Only applies if sorted, as sorting happens earlier)
            .takeWhile(len -> len < 15) // Stops once it hits a length >= 15 (if any)
            
            // 8. dropWhile(predicate): Drops elements while condition is true
            .dropWhile(len -> len < 6) // Drops lengths < 6
            
            // 9. map() again: Converts the length back to a String for final collection
            .map(len -> "Length: " + len)
            
            // TERMINAL OPERATION to trigger the entire pipeline
            .collect(Collectors.toList());
            
        System.out.println("\n   Result of Complex Intermediate Pipeline (Final List): " + processedCourses);
        System.out.println("\n-------------------------------------------------");


        // **********************************************
        // 2. TERMINAL OPERATIONS (Eager Execution)
        // **********************************************
        
        System.out.println("2. TERMINAL OPERATIONS DEMO:\n");
        
        // --- Single Result Operations ---

        // reduce(): Combines elements to produce a single result (sum)
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("   -> reduce() Sum: " + sum); // Output: 102
        
        // count(): Returns the number of elements in the stream
        long count = numbers.stream().count();
        System.out.println("   -> count() Total Elements: " + count); // Output: 9

        // min(): Retrieves the minimum element
        Optional<Integer> minVal = numbers.stream().min(Comparator.naturalOrder());
        System.out.println("   -> min() Value: " + minVal.orElse(-1)); // Output: 4
        
        // max(): Retrieves the maximum element
        Optional<Integer> maxVal = numbers.stream().max(Comparator.naturalOrder());
        System.out.println("   -> max() Value: " + maxVal.orElse(-1)); // Output: 30
        
        // findFirst(): Retrieves the first element (short-circuiting)
        Optional<Integer> first = numbers.stream().findFirst();
        System.out.println("   -> findFirst() Value: " + first.orElse(-1)); // Output: 5
        
        // findAny(): Retrieves any element (non-deterministic/useful for parallel streams)
        Optional<Integer> any = numbers.stream().findAny();
        System.out.println("   -> findAny() Value (Usually same as first in serial): " + any.orElse(-1));

        // --- Match/Boolean Operations ---

        // anyMatch(): Returns true if any element is greater than 25
        boolean hasLargeNumber = numbers.stream().anyMatch(n -> n > 25);
        System.out.println("   -> anyMatch(n > 25): " + hasLargeNumber); // Output: true (due to 30)

        // allMatch(): Returns true if all elements are less than 100
        boolean allLessThan100 = numbers.stream().allMatch(n -> n < 100);
        System.out.println("   -> allMatch(n < 100): " + allLessThan100); // Output: true

        // noneMatch(): Returns true if no element is equal to 100
        boolean noneIs100 = numbers.stream().noneMatch(n -> n == 100);
        System.out.println("   -> noneMatch(n == 100): " + noneIs100); // Output: true
        
        // --- Collection/Action Operations ---

        // collect(): Gathers elements into a Collection (example: Set to show distinct)
        List<Integer> filteredList = numbers.stream()
            .filter(n -> n % 5 == 0)
            .collect(Collectors.toList());
        System.out.println("   -> collect() Multiples of 5: " + filteredList); // Output: [5, 25, 15, 10, 30]

        // forEach(): Iterates over each element and performs an action (prints)
        System.out.print("   -> forEach() Print Evens: ");
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(n -> System.out.print(n + " ")); // Output: 12 8 10 30 4
        System.out.println();
    }
}