package com.frankly.oops;

public class FanRunner {

	public static void main(String[] args) {

		Fan fan = new Fan("Manufacturer 1", 0.34567, "GREEN");

		fan.switchOn();
		fan.setSpeed((byte) 5);
		System.out.println(fan);
//		Before implementing "toString": This line statement will print hashcode 
//		like this: com.frankly.oops.Fan@87aac27

		fan.switchOff();
		System.out.println(fan);
	}

}
