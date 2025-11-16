package com.frank.OOPsConcepts.abstraction;

public class CohesionExample {
	public static void main(String[] args) {

	}
}

//Low Cohesion
/*
 * Multiple Responsibilities: This class downloads data, parses it, and stores it.
 * 
 * Tightly Coupled: Changes in downloading logic may affect parsing and storage.
 * 
 * Difficult to Reuse: If another part of the program needs only specific feature, it might be difficult to reuse.
 */

//// 📌 ❌ Example of Low Cohesion
//public class DownloadAndStore {
//    public void downloadFromInternet() {
//        // Code to download data from the internet
//    }
//
//    public void parseData() {
//        // Code to parse the downloaded data
//    }
//
//    public void storeInDatabase() {
//        // Code to store the parsed data in the database
//    }
//
//    public void doEverything() {
//        downloadFromInternet();
//        parseData();
//        storeInDatabase();
//    }
//}


// 📌 ✅ Example of High Cohesion
//public class InternetDownloader {
//	public Data downloadFromInternet() {
//		// Code to download data from the internet
//		return new Data();
//	}
//}
//
//public class DataParser {
//	public ParsedData parseData(Data data) {
//		// Code to parse the downloaded data
//		return new ParsedData();
//	}
//}
//
//public class DatabaseStorer {
//	public void storeInDatabase(ParsedData parsedData) {
//		// Code to store the parsed data in the database
//	}
//}
//
//public class CohesionExample {
//	private InternetDownloader downloader = new InternetDownloader();
//	private DataParser parser = new DataParser();
//	private DatabaseStorer storer = new DatabaseStorer();
//
//	public void doEverything() {
//		Data data = downloader.downloadFromInternet();
//		ParsedData parsedData = parser.parseData(data);
//		storer.storeInDatabase(parsedData);
//	}
//}

/*
 * ingle Responsibility: Each class performs a specific task. Easier to Test:
 * Each class can be tested separately. Improved Reusability: The
 * InternetDownloader class can be used to download other data as well.
 */
/*
 * What is Cohesion? #
 * 
 * What?: Cohesion measures how closely related the responsibilities of a class
 * are.
 * 
 * High Cohesion: A class has a single, well-defined responsibility.
 * 
 * Low Cohesion: A class has multiple unrelated responsibilities.
 * 
 */
