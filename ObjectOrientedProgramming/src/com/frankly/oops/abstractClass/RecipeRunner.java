package com.frankly.oops.abstractClass;


public class RecipeRunner {

	public static void main(String[] args) {

		Recipe recipe = new Recipe();
		recipe.execute();

		RecipeWithOven recipeWithOven = new RecipeWithOven();
		recipeWithOven.execute();
	}

}
