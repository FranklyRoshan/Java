package com.example.java.model;

import java.util.List;

public class OlivePress implements Press {

	private int currentOil;

	@Override
	public int getOil(List<Olive> olives) {
		int totalOil = currentOil;
		for (Olive o : olives) {
//			System.out.println(o.getName());
			totalOil += o.crush();
		}
		return totalOil;
	}

	@Override
	public void setOil(int oil) {
		currentOil = oil;
	}

}
