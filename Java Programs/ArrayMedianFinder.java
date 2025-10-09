package JavaPackage;

import java.util.Arrays;

public class ArrayMedianFinder {

	public static void main(String[] args) {
		int[] numbers = {3, 1, 2, 4, 5, 3, 6, 7, 8};
		double median = findMedian(numbers);
		
		System.out.println("The median of the array is: " + median);
	}
	
	public static double findMedian(int[] arr) {
		Arrays.sort(arr);
		
		int length = arr.length;
		if (length % 2 == 0) {
			int midIndex1 = length / 2 - 1;
			int midIndex2 = length / 2;
			return (arr[midIndex1] + arr[midIndex2]) / 2.0;
		} else {
			int midIndex = length / 2;
			return arr[midIndex];
		}
	}
}
