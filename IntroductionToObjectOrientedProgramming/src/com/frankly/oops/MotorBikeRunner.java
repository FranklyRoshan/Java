package com.frankly.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(50);
//		for Default constructor example
		MotorBike harley = new MotorBike();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(harley.getSpeed());

		ducati.start();
		honda.start();


//		ducati.speed = 20;
//		honda.speed = 0;

//		ducati.speed = 100;
//		honda.speed = 80;

//		ducati.setSpeed(20);
//		honda.setSpeed(0);

//		ducati.setSpeed(100);

		ducati.increaseSpeed(100);
		ducati.decreaseSpeed(50);

//		int ducatiSpeed = ducati.getSpeed(); // get ducati speed
//		ducatiSpeed = ducatiSpeed + 100; // increase it by 100
//		ducati.setSpeed(ducatiSpeed); // set it to ducati

		System.out.println(ducati.getSpeed());

//		honda.setSpeed(80);

//		honda.increaseSpeed(100);
//		honda.decreaseSpeed(50);

//		int hondaSpeed = honda.getSpeed(); // get honda speed
//		hondaSpeed = hondaSpeed + 100; // increase it by 100
//		honda.setSpeed(ducatiSpeed); // set it to honda

//		System.out.println(honda.getSpeed());
	}

}
