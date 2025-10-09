package JavaPackage;

interface MathOperation {
	int operate(int a, int b);
}

public class LambdaFunctionInterface {

	public static void main(String[] args) {
		MathOperation addition = (a, b) -> a + b;
		System.out.println("Addition: " + addition.operate(5, 3));

		MathOperation subtraction = (a, b) -> a - b;
		System.out.println("Subtraction: " + subtraction.operate(8, 3));
	
		MathOperation multiplication = (a, b) -> a * b;
		System.out.println("Multiplication: " + multiplication.operate(4, 5));
	}

}
