/*
Question: Reverse Only Letters
Write a Java program that reverses only the letters in a given string. All non-letter characters should remain in their original positions.

Example:
Input: "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
 */

package programs;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		String input = "a-bC-dEf-ghIj";
		System.out.println("Original: " + input);
		System.out.println("Reversed: " + reverseOnlyLetters(input));

	}

	public static String reverseOnlyLetters(String s) {
		char[] chars = s.toCharArray();
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			// Move left pointer until it points to a letter
			while (left < right && !Character.isLetter(chars[left])) {
				left++;
			}

			// Move right pointer until it points to a letter
			while (left < right && !Character.isLetter(chars[right])) {
				right--;
			}

			// Swap the letters
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;

			// Move both pointers inwards
			left++;
			right--;
		}

		return new String(chars);
	}

}


/*
import java.util.*;

public class ReverseOnlyLetters {
	public static void main(String... args) {
		String input = "a-bC-dEf-ghIj";
		char [] arr = input.toCharArray();

		// Step 1: Extract letters only
		List<Character> letters = new ArrayList<>();
		for (char ch : arr) {
			if (Character.isLetter(ch)) {
				letters.add(ch);
			}
		}

		// step 2: Sort letters
		Collections.sort(letters);

		// step 3: Reverse sorted letters
		Collections.reverse(letters);

		// step 4: Replace letters in original positions
		int letterIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Character.isLetter(arr[i])) {
				arr[i] = letters.get(letterIndex++);
			}
		}

		// Final output
		System.out.println("Result: " + new String(arr));
	}
}
*/