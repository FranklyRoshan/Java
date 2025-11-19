package com.frank.OOPsDetails.Super;

//Using super() (Calling Parent Constructor)
class Appliance {
	Appliance() {
		System.out.println("Appliance Constructor");
	}
}

class Fan extends Appliance {
	Fan() {
		super(); // Calls Appliance constructor
		System.out.println("Fan Constructor");
	}

	public static void main(String[] args) {
		Fan fan = new Fan();
	}
}

public class SuperToCallParenConstructorExample {

	public static void main(String[] args) {

	}
}
