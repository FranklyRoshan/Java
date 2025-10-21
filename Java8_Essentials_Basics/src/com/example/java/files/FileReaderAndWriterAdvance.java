package com.example.java.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileReaderAndWriterAdvance {

	public static void main(String[] args) {
		Path sourceFile = Paths
				.get("D:\\Java\\Java8_Essentials_Basics\\src\\com\\example\\java\\files\\loremipsum.txt");
		Path targetFile = Paths.get("D:\\Java\\Java8_Essentials_Basics\\src\\com\\example\\java\\files\\target.txt");

		try {
			Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File Copied");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
