package com.frankly.oops.abstractClass;

public class RecipeWithOven extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the Ingredients");
		System.out.println("Get the appliances");
		System.out.println("Turn-on the Microwave oven");
	}

	@Override
	void doTheDish() {
		System.out.println("Prepare the recipe");
		System.out.println("Put your recipe inside the Microwave oven");

	}

	@Override
	void cleanup() {
		System.out.println("Turn-off the Microwave oven");
		System.out.println("Do the dishes");
	}

}
