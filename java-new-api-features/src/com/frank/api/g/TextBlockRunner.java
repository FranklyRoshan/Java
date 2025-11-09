package com.frank.api.g;

public class TextBlockRunner {

	public static void main(String[] args) {

		String textBlock = """
				asdfghjkl
				""";

		String str = """
				Line 1
					Line 2
						Line 3
					Line 4
				Line 5""";


//		String invalidTextBlock = """qwertyuiop""";
		String validTextBlock = """
				qwertyuiop""";

		System.out.println(str);

//		Text Box
//		1. Simplify complex text strings.
//		2. Released in JDK 15 (Preview - JDK 13 and 14)
//		Remeber:
//			3. First line: """Followed by line terminator
//			"""abc or """abc""" in First Line are NOT valid.
//			4. Automatic Alignment is done.
//			5. Trailing white space is stripped.
//			6. You can use text blocks where ever you can use a String

		String textBlocks = """
				Line1: %s
				Line2: %s
				Line3
				Line4
				Line5
				""".formatted("Some Values", "Some other Values");

	}

}
