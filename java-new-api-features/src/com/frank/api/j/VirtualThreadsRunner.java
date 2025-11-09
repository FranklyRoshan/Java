package com.frank.api.j;

public class VirtualThreadsRunner {

	public static void main(String[] args) {
		for (int i = 0; i < 1_000_000; i++) {
			System.out.println(i);

//			Platform Thread
//			new Thread(new SleepingThread()).start();

//			Virtual Thread
			Thread.startVirtualThread(new SleepingThread());
//			or
//			Thread.ofVirtual().start(new SleepingThread());
			
		}
	}

}
