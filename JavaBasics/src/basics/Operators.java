package basics;

public class Operators {

	public static void main(String[] args) {
		
		// Arithmetic Operators
		int a = 10, b = 3;
		System.out.println("Arithmethic Operators:");
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		
		// Relational Operators
		System.out.println("\nRelational Operators");
		System.out.println("a == b: " + (a == b));
		System.out.println("a != b: " + (a != b));
		System.out.println("a < b: " + (a < b));
		System.out.println("a > b: " + (a > b));
		System.out.println("a <= b: " + (a <=b));
		System.out.println("a >= b: " + (a >= b));
		
		// Logical Operators
		boolean x = true, y = false;
		System.out.println("\nLogical Operators:");
		System.out.println("x && y: " + (x && y));
		System.out.println("x || y: " + (x || y));
		System.out.println("!x: " + (!x));
		
		// Assignment Operators
		int num = 5;
		System.out.println("\nAssignment Operators:");
		num += 3; // 8
		System.out.println("num += 3: " + num);
		num -= 2; // 6
		System.out.println("num -= 2: " + num);
		num *= 4; // 24
		System.out.println("num *= 4: " + num);
		num /= 4;
		System.out.println("num /= 4: " + num);
		num %= 3;
		System.out.println("num %= 3: " + num);
		
		// Unary Operators
		int val = 7;
		System.out.println("\nUnary Operators:");
		System.out.println("val++: " + (val++)); // Prints 7, then val becomes 8
		System.out.println("++val: " + (++val)); // now val is 9		
		System.out.println("val--: " + (val--)); // Prints 9, then val becomes 8
		System.out.println("--val: " + (--val)); // now val is 7
		
		// Bitwise Operators (Just for extra knowledge)
		System.out.println("\nBitwise Operators:");
		int bitA = 5, bitB = 3;
		System.out.println("bitA & bitB: " + (bitA & bitB)); // AND
		System.out.println("bitA | bitB: " + (bitA | bitB)); // OR
		System.out.println("bitA ^ bitB: " + (bitA ^ bitB)); // XOR
		System.out.println("-bitA: " + (-bitA));			 // NOT
		
	}

}
