package com.example.java;

public class TwoDimensionArray {

	public static void main(String[] args) {

		String[][] states = new String[3][2];
		states[0][0] = "California";
		states[0][1] = "Sacramento";
		states[1][0] = "Oregon";
		states[1][1] = "Salem";
		states[2][0] = "Washington";
		states[2][1] = "Olympia";

		for (String[] state : states) {
			StringBuilder sb = new StringBuilder();
			sb.append("The capital of ")
			.append(state[0])
			.append(" is ")
			.append(state[1])
			.append(".");
			
			System.out.println(sb);
					
		}
	}

}
