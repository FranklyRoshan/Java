package com.example.java.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This is an <b>Olive Press</b> application, and its job is to <l>press
 * oilve</l>
 */
public class Main {

	/**
	 * The main method
	 * 
	 * @param args - an array of String values
	 */
	public static void main(String[] args) {
		List<Olive> olives = new ArrayList<>();
		olives.add(new Kalamata());
		olives.add(new Lingurian());
		olives.add(new Gaeta());
		olives.add(new Lugano());
		

//		olives.add(new Olive(OliveName.KALAMATA, OliveColor.PURPLE, 3));
//		olives.add(new Olive(OliveName.LINGURIAN, OliveColor.BLACK, 2));
//		olives.add(new Olive(OliveName.GAETA, OliveColor.GREEN, 1));
//		olives.add(new Olive(OliveName.LUGANO, OliveColor.GREEN, 2));

//		olives.add(new Olive(Olive.KALAMATA, 0x2E0854, 3));
//		olives.add(new Olive(Olive.KALAMATA, 0x2E0854, 3));
//		olives.add(new Olive(Olive.LINGURIAN, 0x000000, 2));
//		olives.add(new Olive(Olive.LINGURIAN, 0x000000, 2));

//		Olive olive1 = new Olive("Kalamata", 0x2E0854, 3);
//		olives.add(olive1);
//		Olive olive2 = new Olive("Kalamata", 0x2E0854, 3);
//		olives.add(olive2);
//		Olive olive3 = new Olive("Ligurian", 0x000000, 2);
//		olives.add(olive3);

//		OlivePress press = new OlivePress();
//		int totalOil = press.getOil(olives);
//
//		System.out.println("You got " + totalOil + " units of oil");

		Press press = new OlivePress();
		press.setOil(5);
		int totalOil = press.getOil(olives);

		System.out.println("You got " + totalOil + " units of oil");

		// Anonymous Inner Type
//		Press p2 = new Press() {
//			
//			@Override
//			public void setOil(int oil) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public int getOil(List<Olive> olives) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};

	}

}
