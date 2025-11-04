package com.frank.java.tips.access.package1;

class DefaultClass {

}

// Enclosing Class
public class NestedClassRunner {

	int i;

	class InnerClass {
		public void method() {
			i = 5;
		}

	}

	static class StaticNestedClass {
		public void method() {
//			i = 5;
		}
	}

	public static void main(String[] args) {

		// InnerClass innerClass = new InnerClass();
		StaticNestedClass staticNestedClass = new StaticNestedClass();

		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		InnerClass innerClass = nestedClassRunner.new InnerClass();
	}

}
