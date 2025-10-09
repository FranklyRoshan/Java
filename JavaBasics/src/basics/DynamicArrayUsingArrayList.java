/*
 * Dynamic Array Using ArrayList
 * ArrayList is a part a java.util package and resize ifself automatically.
 */

package basics;

import java.util.ArrayList;

public class DynamicArrayUsingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		numbers.remove(1); // removes element at index 1 (20)
		
		for (int num : numbers) {
			System.out.println(num);
		}	
 	}
}
