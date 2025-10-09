package com.frankly.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//ExecutorService
class Task extends Thread {
	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() { // SIGNATURE
		System.out.println("\nTask" + number + "Started");

		for (int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.print(i + " ");
		}
			System.out.println("\nTask" + number + "Done");
	}
}


public class ExecutorServiceRunner {

	public static void main(String[] args) {
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));

//		executorService.execute(new Task1());
//		executorService.execute(new Thread(new Task2()));
//
////		Task3
//		System.out.println("\nTask3 Kicked-off ");
//		for (int i = 301; i <= 400; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println("\nTask3 Ended ");
//		System.out.println("\nMain method Ended");

		executorService.shutdown();
	}
}
