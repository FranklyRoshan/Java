package com.frank.OOPsDetails.ReflectionAPI;

/*Using Reflection API
 * What? Creates an object using reflection.
 * Why? Used in frameworks and dynamic object creation.
 * How? Use Class.forName() and newInstance().
 */
class Fan {
	private String make;
	private double radius;
	private String color;

	public Fan() {
		System.out.println("Fan object created using Reflection!");
	}

	public static void main(String[] args) throws Exception {
		Fan fan = (Fan) Class.forName("Fan").getDeclaredConstructor().newInstance();
	}
}

public class InitializeObjectWithReflectionAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
