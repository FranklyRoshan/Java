/*
 * What are inner classes?
 * In Java, an inner class is a class defined inside another class. 
 * Inner classes can access members (including private ones) 0f the outer class.
 * 
 * Types of Inner classes
 * 		Non-static Inner Class
 * 		Static Nested Class
 * 		Local Nested Class
 * 		Anonymous Inner Class
 * 
 * Non-Static Inner Class
 * 		Defined inside another class and can access all members (even private) of the outer class.
 * 
 * Static Nested Class
 * 		Declared with static. can access only the static members of the outer class.
 * 
 * Local Inner Class 
 * 		Declared inside a method. Accessible only within the method
 * 
 * Anonymous Inner Class
 * 		Created for one-time use, usually for interface or abstract classes. 
 * It doesn't have a name
 * 	
 */

package basics;

public class InnerClasses {
	private String outerField = "Outer Class";
	
	// 1. Non-static Inner Class
	class Inner{
		void display() {
			System.out.println("Non-Static Inner Class: " + outerField);
		}
	}
	
	// 2. Static Inner Class
	static class StaticNested {
		static void display() {
			System.out.println("Static Nested Class"); 
		}
	}
	
	void localInnerExample() {
		// 3. Local Inner Class
		class LocalInner {
			void print() {
				System.out.println("Local Inner Class");
			}
		}
		LocalInner li = new LocalInner();
		li.print();
	}
	
	void anonymousInnerExample() {
		// 4. Anonymous Inner Class
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Anonymous Inner Class: Runnable running...");
			}
		};
		r.run();
	}

	public static void main(String[] args) {
		InnerClasses outer = new InnerClasses();
		
		// Non-Static Inner Class
		InnerClasses.Inner inner = outer.new Inner();
		inner.display();
		
		// Static Nested Class 
		InnerClasses.StaticNested.display();
		
		// Local Inner Class
		outer.localInnerExample();
		
		// Anonymous Inner Class
		outer.anonymousInnerExample();
	}

}
