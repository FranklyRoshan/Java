package com.frankly.oops.abstractClass;

public abstract class AbstractRecipe {

	public void execute() {
//		Prepare
		getReady();
//		Recipe
		doTheDish();
//		Cleanup
		cleanup();
	}

	abstract void getReady();

	abstract void doTheDish();

	abstract void cleanup();
}
