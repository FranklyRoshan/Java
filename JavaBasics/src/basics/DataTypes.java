/*
Variables and Data Types in Java

 1. Primitive Data Types (8 total):

These are built into the language and not objects.

Type Size Example Description

	#01 byte 1 byte byte a = 100; 
	#02 Small integers (-128 to 127)
	#03 short 2 bytes short b = 20000; 
	#04 Larger than byte (-32,768 to 32,767)
	#05 int 4 bytes int c = 123456; Standard integer type
	#06 long 8 bytes long d = 1234567890L; Very large integers (note the L)
	#07 float 4 bytes float e = 3.14f; Single-precision decimal (note the f)
	#08 double 8 bytes double f = 3.14159; Double-precision decimal
	#09 char 2 bytes char g = 'Z'; A single Unicode character
	#10 boolean 1 bit boolean h = true; True or false only

2. Non-Primitive Data Types (Reference types):

These are based on classes.

	#1 String – Text values (e.g., "Hello")
	#2 Arrays – Collection of similar types (int[], String[])
	#3 Classes – Custom data structures
	#4 Interfaces, Enums, etc.
 */

package basics;

public class DataTypes {

	public static void main(String[] args) {
		byte smallNum = 120;
		short  mediumNum = 32000;
		long bigNum = 123456789L;
		float pi = 3.14f;
		double precisePi = 3.1415926535;
		char letter = 'F';
		boolean isLearning = true;
		String greeting = "Welcome to Java";
		
		System.out.println("Byte: " + smallNum);
		System.out.println("Short: " + mediumNum);
		System.out.println("Long: " + bigNum);
		System.out.println("Float: " + pi);
		System.out.println("Double: " + precisePi);
		System.out.println("Char: " + letter);
		System.out.println("Boolean: " + isLearning);
		System.out.println("String: " + greeting);
	}

}
