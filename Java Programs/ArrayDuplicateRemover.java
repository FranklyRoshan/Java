package JavaPackage;

import java.util.Arrays;

public class ArrayDuplicateRemover {

	public static void main(String[] args) {
	int[] numbers = {4, 6, 3, 3, 6, 5, 6, 3, 7, 2, 9, 10};
	int[] uniqueNumbers = removeDuplicates(numbers);
	
	System.out.println("Array with duplicate elements removed: " + Arrays.toString(uniqueNumbers));
	
	}
	
	public static int[] removeDuplicates(int[] arr) {
		int[] uniqueArray = new int[arr.length];
		int uniqueCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			
			for (int j = 0; j < uniqueCount; j++) {
				if(arr[i] == uniqueArray[j]) {
					isDuplicate = true;
					break;
			}
		}
			
			if (!isDuplicate) {
			uniqueArray[uniqueCount] = arr[i];
			uniqueCount++;
			}
		}
		
		return Arrays.copyOf(uniqueArray, uniqueCount);
	}

}
