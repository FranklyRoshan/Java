package JavaPackage;

public class Circle {

	private double radius;
	
	public Circle (double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double calculateAreas() {
		return Math.PI*radius*radius;
	}
	
	public static void main(String[] args) {
		
	Circle circle1 = new Circle(5.0);
	Circle circle2 = new Circle(3.0);
	
	System.out.println("Circle 1 - Radius: " + circle1.getRadius() + " m");
	System.out.println("Circle 1 - Area: " + circle1.calculateAreas() + " sq.m");

	
	System.out.println("Circle 2 - Radius: " + circle2.getRadius() + " m");
	System.out.println("Circle 2 - Area: " + circle2.calculateAreas() + " sq.m");
	}

}
