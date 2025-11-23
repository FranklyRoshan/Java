package com.frank.CoreJava;

/*
 * 📌 Avoiding Performance Issues with String Concatenation in Loops
 * ❌ Inefficient Approach Using String: Creates 1000+ unnecessary String objects, impacting performance.
 */

//public class StringLoopExample {
//	public static void main(String[] args) {
//		String result = "";
//
//		for (int i = 0; i < 1000; i++) {
//			// Creates a new String object in every iteration
//			result += i;
//		}
//
//		System.out.println(result.length());
//	}
//}


/*
 * ✅ Optimized Approach Using StringBuilder: 
 * Uses a single StringBuilder object, significantly improving performance.
 */

public class StringBuilderLoopExample {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder(); 

        for (int i = 0; i < 1000; i++) {
            result.append(i);
        }

        System.out.println(result.length());
    }
}
