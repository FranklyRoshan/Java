package JavaPackage;

public class LargestElementFinder {

	public static void main(String[] args) {
		
		int[] n = {92, 34, 56, 78, 90};
		int largest = findLargestElement(n);
		System.out.println("The largest element in th array is: " + largest);

	}
	
	public static int findLargestElement(int[] arr) {
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
	
		return largest;
		
	}
	
}
