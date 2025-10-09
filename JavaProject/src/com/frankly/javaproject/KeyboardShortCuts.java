package com.frankly.javaproject;

import java.math.BigDecimal;
import java.time.Duration;

class TestBean {
	private int i;
	private String str;

	// Source > Constructor (Alt + shift + S)
	public TestBean(int i, String str) {
		super();
		this.i = i;
		this.str = str;
	}

	// Source > Getters and Setters (Alt + Shift + S)
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}

class Test implements Comparable<String> {

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class KeyboardShortCuts {
//	main + (Ctrl + Space)
	public static void main(String[] args) throws InterruptedException {
//		Sysout + (Ctrl + Space)
		System.out.println();
//		Eclipse Suggestion - Ctrl + 1
//		Open - Ctrl + Shift + T
//		To View Documentation - Ctrl + Click
//		Open Type Hierarchy
//		Search - Ctrl + O
//		Search - Ctrl + Shift + R
//		Source - Alt + Shift + S
//		Show Views - Alt + shift + Q
//		Run - Alt + Shift + X
//		Debug - Alt + Shit + D
//		Save Action - Windows > Preference > Save Action (Search it)

//		*Code line Move up or down (Alt + (Up/Down))

//		Refactor (Alt + Shift + T)

//		Refactor > Inline
//		Before Inline
//		int i = 5;
//		int j = i + 5;
//		int k = i + 10;

//		After Inline
		int j = 5 + 5;
		int k = 5 + 10;

//		Templates (Window > Preference > Ant > Editor > Templates)
//		main
//		Sysout
//		fore
//		Syserr
//		ifelse
//		Custom templates creation 
		
		DummyForTest dt = new DummyForTest();
		dt.doSomthing();
		
		BigDecimal bd = new BigDecimal(25);
		Thread.sleep(returnSomthing());
//		Thread.sleep(1000 * 45 * 456);
		
	}

	private static Duration returnSomthing() {
		// TODO Auto-generated method stub
		return null;
	}
}

// (Ctrl + 1) or (Cmd + 1) to implement the Unimplemented methods
class Tests implements Comparable<String> {

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
