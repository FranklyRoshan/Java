package com.frankly.multithreading;

// Threading by

// extends Thread
// implements Runnable

// Threads terminology
/*
● NEW;
● RUNNABLE;
● BLOCKED/WAITING;
● TERMINATED/DEAD.
*/

// extends Thread
class Task1 extends Thread {
	@Override
	public void run() { // SIGNATURE
		System.out.println("Task1 Kicked-off ");
		for (int i = 101; i <= 200; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 Ended ");
	}
}

// implements Runnable
class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Task2 Kicked-off ");
		for (int i = 201; i <= 300; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 Ended ");
	}
}

public class ThreadBasicsRunner {
	public static void main(String[] args) throws InterruptedException {

//		Task1
		Task1 task1 = new Task1();
//		task1.setPriority(1);
//		Priority (MIN - 1, NORM - 5, MAX - 10) (Note: Influence, not Guarantee)
//		task1.run();
		task1.start();

//		Task2
//		System.out.println("\nTask2 Kicked-off ");
//		for (int i = 201; i <= 300; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println("\nTask2 Ended ");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
//		task2Thread.setPriority(10);
		task2Thread.start();

//		wait for task1 to complete
		task1.join();
		task2Thread.join();

//		Task3
		System.out.println("\nTask3 Kicked-off ");
		for (int i = 301; i <= 400; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 Ended ");
		System.out.println("\nMain method Ended");

	}
}

