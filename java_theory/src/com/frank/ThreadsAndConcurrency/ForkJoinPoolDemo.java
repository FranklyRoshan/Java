package com.frank.ThreadsAndConcurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

// RecursiveTask<Integer> defines a task that computes a result of type Integer
class SumTask extends RecursiveTask<Integer> {
    private final int[] arr;
    private final int start, end;
    
    // Threshold to decide when to stop splitting and perform the calculation directly
    private static final int THRESHOLD = 100;

    SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        // Base Case: If the segment is small enough, calculate the sum directly
        if (end - start <= THRESHOLD) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
            return sum;
        }

        // Recursive Case (Divide and Conquer):
        
        // 1. Divide: Split the array segment into two halves
        int mid = (start + end) / 2;
        SumTask left = new SumTask(arr, start, mid);
        SumTask right = new SumTask(arr, mid, end);

        // 2. Fork: Asynchronously execute the left subtask
        left.fork(); 
        
        // 3. Compute and Join: Synchronously compute the right subtask, 
        //    then wait for and retrieve the result from the left subtask.
        int rightResult = right.compute();
        int leftResult = left.join(); // Blocks until the left task completes

        // 4. Combine: Return the combined result
        return rightResult + leftResult;
    }
}

public class ForkJoinPoolDemo {
    public static void main(String[] args) {
        
        System.out.println("--- ForkJoinPool Divide-and-Conquer Demo ---");
        
        // Create a large array for a meaningful demonstration of parallelism
        final int ARRAY_SIZE = 10000;
        int[] numbers = IntStream.rangeClosed(1, ARRAY_SIZE).toArray();
        // Expected sum: (n * (n + 1)) / 2 = (10000 * 10001) / 2 = 50,050,000
        long expectedSum = (long) ARRAY_SIZE * (ARRAY_SIZE + 1) / 2;
        
        // 1. Get the Common Pool (recommended for most uses)
        ForkJoinPool pool = ForkJoinPool.commonPool();
        
        // 2. Invoke the task and wait for the final result
        // ForkJoinPool uses its pool of worker threads to execute the SumTask recursively
        int sum = pool.invoke(
            new SumTask(numbers, 0, numbers.length));
        
        System.out.println("Array Size: " + ARRAY_SIZE);
        System.out.println("Expected Sum: " + expectedSum);
        System.out.println("Computed Sum: " + sum);
        
        // We don't explicitly shutdown the commonPool() as it's shared by the JVM.
        
        // --- Comparison Summary ---
        System.out.println("\n--- When to Choose ---");
        System.out.println("ExecutorService: If you had 100 independent tasks (e.g., API calls) to run concurrently.");
        System.out.println("ForkJoinPool: If you need to split a single large problem (like this array sum) into parallel sub-problems.");
    }
}