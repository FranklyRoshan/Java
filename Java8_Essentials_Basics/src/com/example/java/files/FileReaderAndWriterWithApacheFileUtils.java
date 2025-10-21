package com.example.java.files;

import java.io.File;

//import org.apache.commons.io.FileUtils;

public class FileReaderAndWriterWithApacheFileUtils {

	public static void main(String[] args) {
		File sourceFile = new File("D:\\Java\\Java8_Essentials_Basics\\src\\com\\example\\java\\files\\loremipsum.txt");
		File targetFile = new File("D:\\Java\\Java8_Essentials_Basics\\src\\com\\example\\java\\files\\target.txt");

//		try {
//			FileUtils.copyFile(sourceFile, targetFile);
//			System.out.println("File copied!");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}

/*
 * To add a JAR file to a project in Eclipse:
 * 
 * 
 * Right-click your project in Package Explorer.
 * 
 * Select Properties → Java Build Path → Libraries tab.
 * 
 * Click Add JARs (for JARs in your project) or Add External JARs (for JARs
 * elsewhere on your system).
 * 
 * Select the JAR file(s) and click OK, then Apply and Close.
 * 
 * 
 * The JAR will now be part of your build path and available for use.
 */