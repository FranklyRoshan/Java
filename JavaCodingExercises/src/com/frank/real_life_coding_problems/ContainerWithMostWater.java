package com.frank.real_life_coding_problems;

public class ContainerWithMostWater {

	public static int maxArea(int[] height) {
		int left = 0, right = height.length - 1;
		int maxArea = 0;
		while (left < right) {
			int h = Math.min(height[left], height[right]);
			int width = right - left;
			int area = h * width;
			maxArea = Math.max(maxArea, area);

			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}

		return maxArea;
	}

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 7, 9 };
		System.out.println(maxArea(height));
	}

}

/*
 * Container With Most Water
 * 
 * Difficulty: Medium Topics: Two Pointers, Arrays, Greedy
 * 
 * 🧠 Problem: You are given an integer array height where each element
 * represents the height of a vertical line on the x-axis.
 * 
 * The task is to find two lines that together with the x-axis form a container
 * that holds the maximum amount of water.
 * 
 * You cannot tilt the container.
 * 
 * 💡 Example:
 * 
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * 
 * Output: 49
 * 
 * Explanation: The maximum area is formed between heights 8 (index 1) and 7
 * (index 8):
 * 
 * Area = min(8, 7) × (8 - 1) = 7 × 7 = 49
 * 
 */