package JavaPackage;

import java.util.HashMap;
import java.util.Map;

public class ElementFrequencycounter {

	public static void main(String[] args) {
		int[] numbers = {2, 4, 3, 5 , 2, 5, 3, 4, 2};
		Map<Integer, Integer> frequencyMap = countElementFrequency(numbers);
		
		System.out.println("Element frequencies:");
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
		}

	}
	
	public static Map<Integer, Integer> countElementFrequency(int[] arr) {
		Map<Integer, Integer> frequenMap = new HashMap<>();
		
		for(int num : arr) {
			frequenMap.put(num, frequenMap.getOrDefault(num, 0) + 1);
		}
		return frequenMap;
	}

}

