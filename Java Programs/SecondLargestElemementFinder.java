package JavaPackage;

public class SecondLargestElemementFinder {

	public static void main(String[] args) {
		
		int [] n = {12, 34, 56, 31, 90};
		int sec = find(n);
		
		if (sec != Integer.MIN_VALUE) {
			System.out.println("The second largest element in the array is: " + sec);
		} else {
			System.out.println("There is no second largest element in array.");
		}

	}
	
	public static int find(int[] arr) {
		int large = arr[0];
		int sec = Integer.MIN_VALUE;
		
		for (int i = 1; i < arr.length; i++) {
		
		if (arr[i] > large){
			sec = large;
			large = arr[i];
		} else if (arr[i]  > sec && arr[i] < large) {
			sec = arr[i];
 		}
		} 

	return sec;
}

}
