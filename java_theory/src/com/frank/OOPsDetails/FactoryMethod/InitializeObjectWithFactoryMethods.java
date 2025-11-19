package com.frank.OOPsDetails.FactoryMethod;

/*Using a Factory Method
 * What?: A static method creates and returns objects based on specific conditions.
 * Why?
 * Controls object creation by centralizing logic.
 * Allows customization before returning instances.
 * Helps manage different object types or caching.
 * How?
 * Use static methods to create and return instances.
 * Implement validation, default values, or object reuse inside the method.
 */
enum FanType {
	CEILING, TABLE, EXHAUST
}

class Fan {
	private String make;
	private double radius;
	private String color;
	private FanType type;
	private int speedLevels;

	// Private constructor to restrict direct instantiation
	private Fan(String make, double radius, String color, FanType type, int speedLevels) {
		this.make = make;
		this.radius = radius;
		this.color = color;
		this.type = type;
		this.speedLevels = speedLevels;
	}

	// Factory method
	public static Fan createFan(FanType type, String make, double radius, String color) {
		int defaultSpeedLevels;

		switch (type) {
		case CEILING:
			// Ceiling fans typically have more speeds
			defaultSpeedLevels = 5;
			break;
		case TABLE:
			// Table fans usually have 3 speeds
			defaultSpeedLevels = 3;
			break;
		case EXHAUST:
			// Exhaust fans generally have a single speed
			defaultSpeedLevels = 1;
			break;
		default:
			throw new IllegalArgumentException("Unknown fan type");
		}

		return new Fan(make, radius, color, type, defaultSpeedLevels);
	}

	public void display() {
		StringBuilder sb = new StringBuilder();
		sb.append(type != null ? type + " Fan - " : "Fan - ");
		sb.append(make != null ? make : "Unknown Make");
		sb.append(", ").append(radius > 0 ? radius + " inches" : "Unknown Size");
		sb.append(", ").append(color != null ? color : "Unknown Color");
		sb.append(", Speed Levels: ").append(speedLevels > 0 ? speedLevels : "N/A");

		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		Fan ceilingFan = Fan.createFan(FanType.CEILING, "Havells", 48.0, "White");
		Fan tableFan = Fan.createFan(FanType.TABLE, "Crompton", 16.0, "Blue");
		Fan exhaustFan = Fan.createFan(FanType.EXHAUST, "Bajaj", 12.0, "Black");

		ceilingFan.display();
		tableFan.display();
		exhaustFan.display();
	}
}

public class InitializeObjectWithFactoryMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
