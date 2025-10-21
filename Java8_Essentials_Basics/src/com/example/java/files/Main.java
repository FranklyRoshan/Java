package com.example.java.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		String sourceFile = "D:\\Java\\Java8_Essentials_Basics\\src\\com\\example\\java\\files\\loremipsum.txt";
		String targetFile = "D:\\Java\\Java8_Essentials_Basics\\src\\com\\example\\java\\files\\target.txt";
		
		try (
			FileReader fReader = new FileReader(sourceFile);
			BufferedReader bReader = new BufferedReader(fReader);
				FileWriter writer = new FileWriter(targetFile);
			
		) {
			while (true) {
				String line = bReader.readLine();
				if(line == null) {
					break;
				} else {
					writer.write(line + "\n");
				}
			}
			System.out.println("File Copied");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		
		
	}

}
