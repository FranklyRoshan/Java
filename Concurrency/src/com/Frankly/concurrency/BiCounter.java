package com.Frankly.concurrency;

public class BiCounter {

	private int i = 0;
	private int j = 0;

//	If a class has more than one "synchronized method", It'll cause a significant impact in performance.
	synchronized public void incrementI() {
		i++;
	}

	public int getI() {
		return i;
	}

	synchronized public void incrementJ() {
		j++;
	}

	public int getJ() {
		return j;
	}

}
