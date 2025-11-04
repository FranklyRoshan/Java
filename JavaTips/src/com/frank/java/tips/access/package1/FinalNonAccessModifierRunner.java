package com.frank.java.tips.access.package1;

final class FinalClass {

}

// Final Class can't be extended
// Final Class is used the method like Integer, String, etc.
// To prevent it from extends by other class.

//class someClass extends FinalClass {
//}

class someClass {
	final public void doSomething() {
	}

	// Final Argument
	public void doSomethingElse(final int arg) {
//		args = 6

	}
}

// Final method can't be extended 
class ExtendingClass extends someClass {
//	public void doSomething() {}
}

public class FinalNonAccessModifierRunner {

	public static void main(String[] args) {
		// Final Variable
		final int i = 5;
//		i = 5;

	}

}
