package com.frankly.oops;

public class MotorBike {

	// state
	// Encapsulation
	private int speed; // Member Variable

//	Default Constructor (No-args Constructor) - Created by Java before the constructor created by programmer.
//	MotorBike() {
//		
//	}

//	Modifying the default constructor to change the default value
	MotorBike() {
		this(5);
	}

//	Constructor
//	No return type, methodName is ClassName
//	You can create a initial state to the using constructor
	MotorBike(int speed) {
		this.speed = speed;
	}

	// behaviour

	// method
	// inputs - int speed
	// ouput - void
	// name - setSpeed

//	Getters and Setters (Source (Alt+Shift+S) > Generate getters and Setters...)
	public void setSpeed(int speed) {


//		System.out.println(speed); // 100
//		System.out.println(this.speed); // 0

		if (speed > 0) {
			this.speed = speed;
		}

//		System.out.println(speed); // 100
//		System.out.println(this.speed); // 100
	}

	public int getSpeed() {
		return this.speed;
	}

	public void increaseSpeed(int howMuch) {
//		this.speed = this.speed + howMuch;

		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
//		if (this.speed - howMuch > 0) {
//			this.speed = this.speed - howMuch;
//		}

		setSpeed(this.speed - howMuch);
	}

	public void start() {
		System.out.println("Bike Started");
	}
}
