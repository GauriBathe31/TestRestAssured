package javaprograms;

public class methodOverridingChild extends methodOverriding {

	public static void draw() {
		System.out.println("Draw shape for child class");

	}

	public static int numberoperationsint(int a, int b) {
		System.out.println("number multiplication in child class");
		// you will need to capture the value
		return a * b;

	}

}
