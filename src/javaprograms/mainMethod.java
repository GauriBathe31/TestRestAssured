package javaprograms;

public class mainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Circle circle = new Circle(5.0);
//		double area = circle.calculatearea();
//		System.out.println("area of circle is " + area);
//		circle.print();
//		circle.addtwonumbers();
//		methodOverloading object1 = new methodOverloading(2, 3);
//		object1.addtwonumbers(2, 4);
//		object1.addthreenumbers(2, 3, 5);

		methodOverridingChild object2 = new methodOverridingChild();
		methodOverriding object3 = new methodOverriding();
		object2.draw();
		object3.draw();
		object3.numberoperationsint(2, 3);
		int c = object2.numberoperationsint(2, 3);
		// System.out.println(object3);

	}

}
