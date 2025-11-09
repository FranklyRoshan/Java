package com.frank.api.i;

public class SealedInterfacesRunner {

	sealed interface Flyable permits Bird, Aeroplane, Helicopter {
	}


//	final, sealed or non-sealed
//	1. final
	final class Bird implements Flyable {
	}


//	2. sealed
	sealed class Aeroplane implements Flyable permits Boeing {
	}

	final class Boeing extends Aeroplane {
	}


//	3. non-sealed
	non-sealed class Helicopter implements Flyable {
	}

	public static void main(String[] args) {

//		Sealed Interfaces
//		Only allowed subclasses (Bird, Aeroplane, Helicopter) can implement Vehicle.
//		Bird is final, so it can't be implemented further.
//		Aeroplane is sealed again, allowing only Boeing to extend it.
//		Helicopter is non-sealed, so any class can implement it.


	}

}


// Things You Should Know - Sealed Classes & Interfaces
// 1. Prevents accidental subclassing & implementations permitted classes can extend or implement Only explicitly
// 2. Improves readability and maintainability - Clearly defines allowed subtypes
// 3. Helps enforce strict type hierarchies in large applications
// 4. Subclasses/Implementations must be final, non-sealed, or sealed
