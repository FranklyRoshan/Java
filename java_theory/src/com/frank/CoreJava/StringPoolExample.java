package com.frank.CoreJava;

/*What is a String Pool? #
 * 
 * What? A special memory area inside the heap where string literals are stored only once.
 * 
 * Why? Saves memory by reusing the same String object instead of creating duplicates.
 * 
 * How? When a new string is created using double quotes (""), 
 * it is automatically added to the pool.
 * 
 * If the same string already exists, Java reuses the existing reference 
 * instead of creating a new object.
 */

// Example of String Pool Optimization:
// Both s1 and s2 refer to the same "Java" object in the pool, improving memory efficiency.
public class StringPoolExample {
	public static void main(String[] args) {
		String s1 = "Java"; // Stored in String Pool
		String s2 = "Java"; // Reuses the same object

		// true (same reference)
		System.out.println(s1 == s2);
		// Output: true (same reference)

		// false (different objects)
		System.out.println(s1.equals(s2));
	}
}

/*
 * Heap Memory When using new String("HelXlo"), a new object is always created
 * in the heap memory, even if the same value exists in the pool. This results
 * in two objects: one in the heap and one in the pool (if not already present).
 */

// Example:
class StringMemoryExample {
	public static void main(String[] args) {
        
        // Stored in String Constant Pool
        String s1 = "Hello";  

        // Reuses the same object
        String s2 = "Hello";  

        // Creates a new object in Heap
        String s3 = new String("Hello"); 

        // true (same reference)
        System.out.println(s1 == s2); 

        // false (different objects)
        System.out.println(s1 == s3); 
	}

}

/*
 * 🎯 Best Practice: Always prefer string literals (String str = "Hello";) to
 * save memory and improve performance.
 */