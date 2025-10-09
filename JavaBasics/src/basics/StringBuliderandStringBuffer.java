/*
StringBuilder and StringBuffer

Both are mutable string classes.

StringBuilder is not thread-safe (faster, single-threaded).

StringBuffer is thread-safe (slower, for multi-threaded use).
 */
package basics;

public class StringBuliderandStringBuffer {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		sb.insert(5,",");
		sb.replace(0, 5, "Hi");
		sb.reverse();
		
		System.out.println(sb); // Output: dlroW ,iH
		
		StringBuffer str = new StringBuffer("Java");
		str.append(" Programming");
		
		System.out.println(str); // Output: Java Programming
		
	}

}
