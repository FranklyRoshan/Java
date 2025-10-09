/*
 Java Operators

Operators are symbols used to perform operations on variables and values. Java has several types of operators:
---

1. Arithmetic Operators:

Used for basic math.

Operator Description Example

+ Addition a + b
- Subtraction a - b
* Multiplication a * b
/ Division a / b
% Modulus (Remainder) a % b

---

2. Relational (Comparison) Operators:

Operator Description Example

== Equal to a == b
!= Not equal to a != b
> Greater than a > b
< Less than a < b
>= Greater or equal a >= b
<= Less or equal a <= b

---

3. Logical Operators:

Operator Description Example

&& Logical AND a > 10 && b < 20
  
! Logical NOT !isJavaFun

---

4. Assignment Operators:

Operator Description Example

= Assign value a = 5
+= Add and assign a += 5 → a = a + 5
-= Subtract and assign a -= 3
*= Multiply and assign a *= 2
/= Divide and assign a /= 2
*/

package basics;

public class ControlFlowStatement {

	public static void main(String[] args) {
		// Control Flow statements in Java
		
		// If Statement
		int age = 18;
		if (age >= 18) {
			System.out.println("You're an adult.");
		}
		
		// If... else  Statement
		int number = -5;
		if (number >= 0) {
			System.out.println("Positive number.");
		} else {
			System.out.println("Negative number.");
		}
		
		// If... else if... else Statement
		int marks = 75;
		if(marks >= 90) {
			System.out.println("Grade A");
		} else if (marks >= 70) {
			System.out.println("Grade B");
		}	else {
			System.out.println("Grade C or Lower");
		}
		
		// Switch Statement
		int day = 3;
		switch (day) {
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		default: System.out.println("Other day"); 
		}
		
		// for Loop
		for (int i = 1; i <= 5; i++) {
			System.out.println("i = " + i);
		} 
		
		// While Loop
		int i = 1;
		while (i <= 3) {
			System.out.println("i = " + i);
			i++;
		}
		
		// do... while Loop
		int j = 1;
		do {
			System.out.println("j = " + 1);
			j++;
		} while (j <= 3);
		
		// break Statement
		for (int k = 1; k <= 5; k++) {
			if (k == 3) {
				break; // exit loop when i is 3
			}
			System.out.println("k = " + k);
		}
		
		// continue Statement
		for (int l = 1; l <= 5; l++) {
			if (l == 3) {
			continue; //  skips this iteration when i is 3
			}
			System.out.println("l = " + l);
		}
		
	}

}
