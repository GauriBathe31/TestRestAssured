package javaprograms;

abstract class abstractClass {
//cant create object of abstract class,
	abstract double calculatearea();

	void print() {
		System.out.println("This is non abstract display method");
	}

	void addtwonumbers() {
		int a = 9;
		int b = 8;
		int c = a + b;
		System.out.println("two number addition in abstract method " + c);
	}

	// create abstract interface method
}
