package com.frank.OOPsDetails.Cloning;

/*Using Cloning
 * What? Copies an existing object.
 * Why? Useful for creating duplicate objects.
 * Cloning preserves the exact structure and properties of an object.
 * Useful when an object has multiple attributes, and manually copying each field is cumbersome.
 * How? Implement Cloneable and override clone().
 */

class Fan implements Cloneable {
	private String make;
	private double radius;
	private String color;

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void display() {
		System.out.println(make + " " + radius + " " + color);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Fan original = new Fan("Kenstar", 12.0, "Green");
		Fan cloned = (Fan) original.clone();

		original.display();
		cloned.display();
	}
}

public class InitializeObjectWithCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
