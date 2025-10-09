package JavaPackage;
import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius of the circle(m): ");
		double radius = scanner.nextDouble();
		scanner.close();
		
		double circleArea = Math.PI*radius*radius;
		System.out.println("The area of the circle is: " + circleArea + " sq.m");

	}

}
