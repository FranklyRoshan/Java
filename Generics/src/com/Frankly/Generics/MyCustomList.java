package com.Frankly.Generics;

import java.util.ArrayList;

// Generic Class
public class MyCustomList<T> {
	ArrayList<T> list = new ArrayList<>();

	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}

	public T get(int index) {
		return list.get(index);
	}

	@Override
	public String toString() {
		return list.toString();
	}

}
