package com.frank.CoreJava;

// How do Text Blocks Help?#

// Example Without Text Blocks:
public class TextBlockExample {
	public static void main(String[] args) {

		String json1 = "{\n" + "  \"name\": \"John\",\n" + "  \"age\": 30\n" + "}";


// Same Example With Text Blocks:
		String json = """
				{
      "name": "John",
      "age": 30
    }
    """;
//json ==> "{\n  \"name\": \"John\",\n  \"age\": 30\n}\n"

}
}

/*
 * Summary:
 * 
 * Java New Feature: Introduced in JDK 15 Less
 * 
 * Escape Sequences: No more \n or \" for multi-line strings.
 * 
 * More Readable: Code looks like actual text formatting.
 * 
 * Auto Alignment: Handles indentation automatically.
 * 
 * Better for JSON, HTML, SQL: Keeps structure intact.
 * 
 */