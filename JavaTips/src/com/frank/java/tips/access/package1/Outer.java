package com.frank.java.tips.access.package1;

public class Outer {
	private class InnerPrivate {
		void msg() {
			System.out.println("Private Inner Class");
		}
	}

	class InnerDefault {
		void msg() {
			System.out.println("Default Inner Class");
		}
	}

	protected class InnerProtected {
		void msg() {
			System.out.println("Protected Inner Class");
		}
	}

	public class InnerPublic {
		void msg() {
			System.out.println("Public Inner Class");
		}
	}
}

/*
 * InnerPrivate → only Outer can access.
 * 
 * InnerDefault → accessible within the same package.
 * 
 * InnerProtected → accessible in same package or subclasses.
 * 
 * InnerPublic → accessible everywhere (if Outer is accessible).
 */

/*
 * 🧩 2. Access Modifiers for Inner Classes
 * 
 * If a class is declared inside another class, it can use all four access
 * modifiers:
 * 
 * | Modifier | Description |
 * 
 * | **`public`** | Can be accessed from **anywhere** (if the outer class is
 * accessible). |
 * 
 * | **`protected`** | Can be accessed within the **same package** and by
 * **subclasses**. |
 * 
 * | **(default)** | Accessible **only within the same package**. |
 * 
 * | **`private`** | Accessible **only within the outer class**. |
 * 
 */