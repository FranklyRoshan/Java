package JavaPackage;

public class SecondLargestElementFinder {

	public static void main(String[] args) {
		int[] numbers = {10, 25, 5, 30, 15};
		int secondLargest = findSecondLargestElementFinder(numbers);
		
		System.out.println("The second largest element in the array is: " + secondLargest);
	}
	
	public static int  findSecondLargestElementFinder(int[] arr) {
		if(arr.length < 2) {
			throw new IllegalArgumentException("Array should have atleast two elements.");
		}
		
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		
		for (int num : arr) {
			if (num > largest) {
				secondlargest = largest;
				largest = num;
			} else if (num > secondlargest && num != largest) {
				secondlargest = num;
			} 
		}
		
		return secondlargest;
	}

}
