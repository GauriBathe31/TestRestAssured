package javaprograms;

public class Circle extends abstractClass {

	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	double calculatearea() {
		return Math.PI * radius;
	}

}
