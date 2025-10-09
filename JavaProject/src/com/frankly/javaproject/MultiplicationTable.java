package com.frankly.javaproject;

public class MultiplicationTable {

//	Refactoring 

	void print() {
		print(5);
//		for (int i=1; i<=10; i++) {
//			System.out.printf("%d x %d = %d", i,5,i*5).println();
//		}
	}
		
	void print(int table) {
		print(table, 1, 10);
//		for (int i=1; i<=10; i++) {
//			System.out.printf("%d x %d = %d", i,table,i*table).println();
//		}
	}
	
	void print(int table, int from, int to) {
		for (int i = from; i<=to; i++) {
			System.out.printf("%d x %d = %d", i,table,i*table).println();
		}
	}
}
