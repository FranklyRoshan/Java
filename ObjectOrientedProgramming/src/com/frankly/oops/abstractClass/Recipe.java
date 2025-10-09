package com.frankly.oops.abstractClass;

public class Recipe extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the Ingredients");
		System.out.println("Get the appliances");
	}

	@Override
	void doTheDish() {
		System.out.println("Prepare the recipe");
	}

	@Override
	void cleanup() {
		System.out.println("Do the dishes");
	}

}
