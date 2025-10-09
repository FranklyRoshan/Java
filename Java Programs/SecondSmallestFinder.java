package JavaPackage;

public class SecondSmallestFinder {

	public static void main(String[] args) {
				
				int [] n = {12, 34, 56, 31, 90};
				int sec = find(n);
				
				if (sec != Integer.MIN_VALUE) {
					System.out.println("The second smallest element in the array is: " + sec);
				} else {
					System.out.println("There is no second smallest element in array.");
				}

			}
			
			public static int find(int[] arr) {
				int small = arr[0];
				int sec = Integer.MIN_VALUE;
				
				for (int i = 1; i < arr.length; i++) {
				
				if (arr[i] < small){
					sec = small;
					small = arr[i];
				} else if (arr[i]  > sec && arr[i] < small) {
					sec = arr[i];
		 		}
				} 

			return sec;

	}

}
