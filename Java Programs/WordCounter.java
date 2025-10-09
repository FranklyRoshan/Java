package JavaPackage;

public class WordCounter {

	public static void main(String[] args) {
		String sentence = "Java is a programming language and Java is widely used.";
		String word ="Java";
		
		int count = countWordOccurrences(sentence, word);
		
		System.out.println("Number of occurrences of \"" + word + "\": " + count);
	}
	
	public static int countWordOccurrences(String sentence, String word) {
		String[] words = sentence.split("\\s+");
		int count = 0;
		
		for (String w : words) {
			if (w.equalsIgnoreCase(word)) {
				count++;
			}
		}
		return count;
	}

}
