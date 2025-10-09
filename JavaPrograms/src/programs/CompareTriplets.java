/*
 HackerRank-style Question #7:

Problem: Compare Triplets

Alice and Bob each created a list of three scores.
You have to compare their scores one by one and give points based on who’s better in each category.

If Alice’s score in a category is greater than Bob’s, she gets 1 point.

If Bob’s score is greater, he gets 1 point.

If the scores are equal, no points are awarded.


Return the total points of Alice and Bob as a list.


Example:

Input:
Alice: 5 6 7
Bob:   3 6 10

Output: 1 1

(Explanation: Alice wins in the 1st, Bob wins in the 3rd, tie in 2nd)
 */
package programs;

import java.util.Scanner;


public class CompareTriplets {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Alice's 3 Scores (Space-separated): ");
		int[] alice = new int[3];
		for (int i = 0; i < 3; i++) {
			alice[i] = scanner.nextInt();
		}

		System.out.print("Enter Bob's 3 scores (Space-separated): ");
		int[] bob = new int[3];
		for (int i = 0; i < 3; i++) {
			bob[i] = scanner.nextInt();
		}

		int alicePoints = 0;
		int bobPoints = 0;

		for (int i = 0; i < 3; i++) {
			if (alice[i] > bob[i]) {
				alicePoints++;
			} else if (bob[i] > alice[i]) {
				bobPoints++;
			}
		}

		System.out.println(alicePoints + " " + bobPoints);

		scanner.close();
	}

}
