/* 
 * 1. Two Sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1] 
 */

package com.frank.real_life_coding_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input array size
		System.out.print("Enter no. of elements: ");
		int n = scanner.nextInt();
		
		int[] nums = new int[n];

		// Input array elements
		System.out.println("Enter " + n + " numbers: ");
		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}

		// Input target value
		System.out.print("Enter target sum: ");
		int target = scanner.nextInt();

		// Call the method to find indices
		int[] result = twoSum(nums, target);

		if (result.length == 2) {
			System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
		} else {
			System.out.println("No two numbers found that add up to the target.");
		}

		scanner.close();

	}

	// Logic for finding two indices that sum of target
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);

		}
		
		return new int[] {}; // return empty if not found
	}


}
