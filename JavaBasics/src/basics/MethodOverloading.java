
/* Method Overloading in Java

Definition:
Method Overloading is when multiple methods in the same class have the same name but different parameters (type, number, or order).
It improves code readability and reusability.


Rules for Method Overloading:

Same method name

Different parameter list:

Different number of parameters

Different type of parameters

Different order of parameters 
*/

package basics;

public class MethodOverloading {

	// method with 1 int parameter
	void display(int a ) {
		System.out.println("Integer: " + a);
	}
	
	// method with 2 int parameters
	void display(int a, int b) {
		System.out.println("Sum: " + (a + b));  
	}
	
	void display(String s) {
		System.out.println("String: " + s);
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.display(10);
		obj.display(5, 15);
		obj.display("Hello Frank!");
	}

}
