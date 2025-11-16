package com.frank.OOPsConcepts;

/*
 * Achieving Multiple Inheritance
 * 
 * What? Java does not support multiple inheritance with classes, but it allows multiple interfaces.
 * 
 * Example: A SmartDevice that acts as both Camera and Phone.
 */

interface Camera {
	void takePhoto();
}

interface Phone {
	void makeCall(String number);
}

class SmartPhone implements Camera, Phone {
	@Override
	public void takePhoto() {
		System.out.println("Photo taken.");
	}

	@Override
	public void makeCall(String number) {
		System.out.println("Calling " + number);
	}
}

public class InterfaceForMultipleInheritance {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.takePhoto();
		phone.makeCall("123-456-7890");
	}
}
