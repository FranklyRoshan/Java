package com.frank.java.tips.anonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class LengthComparator implements Comparator<String> {
//	@Override
//	public int compare(String str1, String str2) {
//		return Integer.compare(str1.length(), str2.length());
//	}
//}

public class AnonymousClass {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>(List.of("Alpaca", "BobCat", "Cougar", "Dire Wolf", "Elk"));
//		Collections.sort(animals);
//		System.out.println(animals);

		// Anonymous Class
		Comparator<String> lengthCamparator = new Comparator<>() {
			@Override
			public int compare(String str1, String str2) {
				return Integer.compare(str1.length(), str2.length());
			}
		};

		Collections.sort(animals, lengthCamparator);
						
		System.out.println(animals);

	}

}
