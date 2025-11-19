package com.frank.OOPsDetails.StaticBlock;

/*
 * Using Static Block (For Static Initialization)
 * What? Initializes static variables before object creation.
 * Why? Useful for loading configuration data, database records, or external resources before objects are created.
 * Executes once when the class is loaded.
 * Ensures static data is ready before any instance is accessed.
 * How? Use static { } inside the class.
 */

import java.util.ArrayList;
import java.util.List;

class Fan {
	private static List<String> availableModels;

	// Static block for initialization
	static {
		availableModels = new ArrayList<>();
		loadModelsFromDatabase();
	}

	// Simulated database loading method
	private static void loadModelsFromDatabase() {
		availableModels.add("Orient Aeroquiet");
		availableModels.add("Havells Stealth");
		availableModels.add("Crompton Energion");
		availableModels.add("Usha Bloom");
	}

	public static void main(String[] args) {
		System.out.println("Available Fan Models: " + availableModels);
	}
}

public class InitializeObjectWithStaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
