/*
 String Comparison: == vs .equals()

== checks reference (memory address)

.equals() checks value/content
 */

package basics;

public class StringComparison {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		
		System.out.println(s1 == s2); // true (Same reference from string pool)
		System.out.println(s1 == s3); // false (different object in heap)
		System.out.println(s1.equals(s3)); // true (same value)
	}

}
