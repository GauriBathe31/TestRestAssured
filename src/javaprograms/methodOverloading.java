package javaprograms;

public class methodOverloading {

	public methodOverloading(int a, int b) {
		System.out.println("constructor with 2 parameter");
	}

	public methodOverloading(int d, int h, int j) {
		System.out.println("constructor with 3 parameters");
	}

	public void addtwonumbers(int a, int b) {
		int sum = a + b;
		System.out.println("add 2 numbers :" + sum);
	}

	public void addthreenumbers(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("add 3 numbers :" + sum);
	}
}
