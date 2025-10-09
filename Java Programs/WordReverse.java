package JavaPackage;

public class WordReverse {

	public static void main(String[] args) {
		String sentence = "Hello, World! Welcome to Java.";
		String reveresed = reverseWords(sentence);
		
		System.out.println("Reversed sentence: " + reveresed);
	}
	
	public static String reverseWords (String sentence) {
		String[] words = sentence.split("\\s+");
		StringBuilder reversed = new StringBuilder();
		
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]).append(" ");
		}
		
		return reversed.toString().trim();
	}
}
