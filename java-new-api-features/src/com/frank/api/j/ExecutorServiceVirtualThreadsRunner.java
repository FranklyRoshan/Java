package com.frank.api.j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceVirtualThreadsRunner {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

		for (int i = 0; i < 1_000_000; i++) {
			System.out.println(i);
			Thread.startVirtualThread(new SleepingThread());
			executor.execute(new SleepingThread());
			
		}

		executor.shutdown();
	}

}


/*
 * Platform Threads vs Virtual Threads (Java 21)
 * 
 * Platform Threads (Old)
 * 
 * Implementation | Managed by the Operating System (OS)
 * 
 * Thread Count | Limited by the number of OS threads
 * 
 * Thread Creation | Expensive
 * 
 * Context Switching | Expensive
 * 
 * OS thread usage efficiency | Low
 * 
 * 
 * Virtual Threads (New)
 * 
 * Implementation | Managed by the JVM
 * 
 * Thread Count | Can have a lot more, even millions
 *
 * Thread Creation | Very cheap
 * 
 * Context Switching | Cheap
 * 
 * OS thread usage efficiency | High
 *
 */

/*
 * Using Executor Service To Launch Threads (Java 21)
 * 
 * More resource-friendly: Built-in pooling and scheduling
 * 
 * Preferred Approach: Preferred way for launching many short-lived tasks
 * 
 * Avoid Manual Management: You don't need to manage threads manually
 */

/*
 * Platform Threads vs Virtual Threads - When? (Java 21)
 * 
 * When to Use Traditional Java Threads?
 * 
 * CPU-Bound Tasks Needing Low Number of Threads - Heavy computations (e.g.,
 * image processing, data crunching) needing only a few threads
 * 
 * When to Use Virtual Threads?
 * 
 * IO-Bound Tasks - Database queries, API calls, file reads.
 * 
 * Massive Concurrency - Millions of tasks (e.g., handling web requests).
 * 
 * Efficient Resource Usage - No wasted OS threads waiting for IO.
 */
