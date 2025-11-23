package com.frank.CoreJava;

/*How does Java optimize memory usage with Integer.valueOf()? #

📌 What?
Integer.valueOf(int) caches commonly used integer values.
Instead of creating a new object, it reuses an existing one from the cache when possible.

📌 Why?
Reduces memory usage by avoiding unnecessary object creation.
Improves performance since cached objects are returned instead of allocating new memory.

📌 How?
Java maintains a cache of Integer objects for values from -128 to 127.
When Integer.valueOf(n) is called within this range, it returns a cached object instead of creating a new one.
If the number is outside the range, a new object is created.
*/

// 📌 Example: Cached vs. Non-Cached Integers
public class IntegerCacheExample {
	public static void main(String[] args) {
		Integer a = Integer.valueOf(100); // Cached
		Integer b = Integer.valueOf(100); // Cached

		System.out.println(a == b); // true (Same cached object)

		Integer x = Integer.valueOf(200); // Not Cached
		Integer y = Integer.valueOf(200); // Not Cached

		System.out.println(x == y); // false (Different objects)
	}
}

/*
 * 📌 Where is this cache defined? Java uses an internal cache inside the
 * Integer class. The cache is implemented in IntegerCache (an inner class of
 * Integer). Source Code (from Integer class)
 */

//private static class IntegerCache {
//
//    static final Integer cache[];
//
//    static {
//
//        // Cache range: -128 to 127
//        cache = new Integer[-(-128) + 127 + 1]; 
//
//        for (int i = 0; i < cache.length; i++)
//            cache[i] = new Integer(i - 128);
//
//    }
//
//}

// This ensures efficient memory usage for frequently used integers.
