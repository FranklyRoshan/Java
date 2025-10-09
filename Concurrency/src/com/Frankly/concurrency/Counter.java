package com.Frankly.concurrency;

public class Counter {

	private int i = 0;

//	i++ isn't thread safe, i++ is not Atomic
	synchronized public void increment() {
		i++;
//		get i >> increment >> set i
//		0 >> 1 >> 1
	}

	public int getI() {
		return i;
	}

}
