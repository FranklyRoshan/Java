package com.frank.OOPsDetails.PrivateConstructor;

/*
 * What?A private constructor restricts object creation from outside the class.
 * Why?Singleton Pattern(Only one instance of a class).
 * Factory Methods(Control object creation).
 * Utility Classes(Prevent object creation).
 * 
 * Example(Singleton Pattern):
 */
class Fan {
    private static Fan instance;

    // Private Constructor
    private Fan() {
        System.out.println("Fan instance created!");
    }

    public static Fan getInstance() {
        if (instance == null) {
            instance = new Fan();
        }
        return instance;
    }

    public static void main(String[] args) {
        Fan fan1 = Fan.getInstance();
        Fan fan2 = Fan.getInstance();
    }
}

// Example (Factory Method)
//enum FanType {
//	CEILING, TABLE, EXHAUST
//}
//
//class Fan {
//	private String make;
//	private double radius;
//	private String color;
//	private FanType type;
//	private int speedLevels;
//
//	// Private constructor to restrict direct instantiation
//	private Fan(String make, double radius, String color, FanType type, int speedLevels) {
//		this.make = make;
//		this.radius = radius;
//		this.color = color;
//		this.type = type;
//		this.speedLevels = speedLevels;
//	}
//
//	// Factory method
//	public static Fan createFan(FanType type, String make, double radius, String color) {
//		int defaultSpeedLevels;
//
//		switch (type) {
//		case CEILING:
//			// Ceiling fans typically have more speeds
//			defaultSpeedLevels = 5;
//			break;
//		case TABLE:
//			// Table fans usually have 3 speeds
//			defaultSpeedLevels = 3;
//			break;
//		case EXHAUST:
//			// Exhaust fans generally have a single speed
//			defaultSpeedLevels = 1;
//			break;
//		default:
//			throw new IllegalArgumentException("Unknown fan type");
//		}
//
//		return new Fan(make, radius, color, type, defaultSpeedLevels);
//	}
//
//}

public class PrivateConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 * 
 * JDK Example: java.lang.Math The Math class consists solely of static methods
 * and constants. To prevent instantiation, it employs a private constructor:
 * 
 * public final class Math { // Private constructor prevents instantiation
 * private Math() {} // Static methods and constants follow }
 * 
 * JDK Example: java.lang.Runtime The Runtime class follows the Singleton
 * pattern, ensuring a single instance throughout the application's lifecycle.
 * It achieves this by using a private constructor and a static method to
 * provide access to the instance:
 * 
 * public class Runtime { private static final Runtime currentRuntime = new
 * Runtime();
 * 
 * // Private constructor prevents instantiation private Runtime() {}
 * 
 * public static Runtime getRuntime() { return currentRuntime; } }
 * 
 */