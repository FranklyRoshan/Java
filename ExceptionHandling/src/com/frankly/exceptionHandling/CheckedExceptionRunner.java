package com.frankly.exceptionHandling;

// Checked and UnChecked Exceptions
public class CheckedExceptionRunner {

	public static void main(String[] args) {
//		Calling Checked Exception Method
		try {
			someOtherMethod();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

//		Calling Unchecked Exception Method
//		someOtherMethod2();
	}

//	Checked Exception Method (CompileTime - Checked Exception)
//	All Sub-classes of Exception exculding Runtime Exception and Subclasses of RunTime Exception
	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(2000);
	}

//	Unchecked Exception Method (RuntimException - Unchecked Exception)
//	RuntimeException and its sub-classes
//	private static void someOtherMethod2() throws RunTimeException {
//
//	}

}

/*
 * Difference b/w the Checked Exception and Unchecked Exception
 * 
 * Features
 */
