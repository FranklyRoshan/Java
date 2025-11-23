package com.frank.ThreadsAndConcurrency;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamParallelizationDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("--- Stream Parallelization Demo ---");

        // Create a large list (1 million numbers) to make the parallelization meaningful
        final int MAX_NUMBER = 1_000_000;
        
        List<Integer> numbers = 
            IntStream.rangeClosed(1, MAX_NUMBER)
                     .boxed()
                     .collect(Collectors.toList());
        
        // Expected count of even numbers is MAX_NUMBER / 2
        final long EXPECTED_COUNT = MAX_NUMBER / 2;
        System.out.println("Expected Count (Even Numbers): " + EXPECTED_COUNT);
        System.out.println("-------------------------------------------------");
        
        // --- 1. Sequential Stream (Baseline) ---
        long startSequential = System.nanoTime();
        long countSequential = numbers.stream()
                                      // Default sequential processing mode
                                      .filter(n -> n % 2 == 0)
                                      .count();
        long endSequential = System.nanoTime();
        long durationSequential = TimeUnit.NANOSECONDS.toMillis(endSequential - startSequential);
        
        System.out.printf("1. Sequential Stream: Count=%d, Time=%dms%n", 
                          countSequential, durationSequential);

        // --- 2. Using .parallel() on a Sequential Stream ---
        long startParallel1 = System.nanoTime();
        long countParallel1 = numbers.stream()
                                     // Enables parallel execution using the ForkJoinPool
                                     .parallel()
                                     .filter(n -> n % 2 == 0)
                                     .count();
        long endParallel1 = System.nanoTime();
        long durationParallel1 = TimeUnit.NANOSECONDS.toMillis(endParallel1 - startParallel1);
        
        System.out.printf("2. Using .stream().parallel(): Count=%d, Time=%dms%n", 
                          countParallel1, durationParallel1);

        // --- 3. Using .parallelStream() (Recommended) ---
        long startParallel2 = System.nanoTime();
        long countParallel2 = numbers.parallelStream()
                                     // Directly starts the stream in parallel mode
                                     .filter(n -> n % 2 == 0)
                                     .count();
        long endParallel2 = System.nanoTime();
        long durationParallel2 = TimeUnit.NANOSECONDS.toMillis(endParallel2 - startParallel2);
        
        System.out.printf("3. Using .parallelStream(): Count=%d, Time=%dms%n", 
                          countParallel2, durationParallel2);
                          
        System.out.println("-------------------------------------------------");
        
        // Performance Note: Parallel streams provide a speedup only when the amount of 
        // work (CPU-bound computation) is significant and the data structure (like List) 
        // is easily splittable. For small datasets or simple I/O tasks, the overhead 
        // of parallelization can make it slower than the sequential stream.
    }
}