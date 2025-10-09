package com.Frankly.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {

	private int i = 0;
	private int j = 0;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

//	If a class has more than one "synchronized method", It'll cause a significant impact in performance.
	synchronized public void incrementI() {
		lockForI.lock(); // Get Lock for I
		i++;
		lockForI.unlock();
//		Release Lock For I
	}

	public int getI() {
		return i;
	}

	synchronized public void incrementJ() {
		lockForJ.lock(); // Get Lock For J
		j++;
		lockForJ.unlock();
//		Release Lock for J
	}

	public int getJ() {
		return j;
	}

}
