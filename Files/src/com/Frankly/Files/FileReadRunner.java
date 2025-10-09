package com.Frankly.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		
		Path pathFileToRead = Paths.get("./resources/data.txt");
//		It'll read all at once. It consume lot of memory. So, We're gonna use Streams (Files.lines)
//		List<String> lines = Files.readAllLines(pathfileToRead);
//		System.out.println(lines);
		
//		Streams
		Files.lines(pathFileToRead).map(String::toLowerCase)
				.filter(str -> str.contains("a"))
				.forEach(System.out::println);
	}

}
