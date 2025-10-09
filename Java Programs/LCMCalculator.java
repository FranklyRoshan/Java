package JavaPackage;

public class LCMCalculator {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 18;
		int lcm = calculatorLCM(num1, num2);
	
		System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
	}
	
	public static int calculatorLCM(int a, int b) {
	int gcd = calculateGCD(a, b);
	return (a*b) / gcd;
	}
	
	public static int calculateGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		
		return calculateGCD(b, a % b);
	}
}
