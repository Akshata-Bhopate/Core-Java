//Calculate area of Circle, Triangle, Rectangle using method overloading.

package PolymorphismOverloading;

public class Calculatearea {
	void calArea(float a, float b) {
		float area = a * b;
		System.out.println("Arae of Rectangle :" + area);
	}

	void calArea(double r) {
		double area = 3.14 * r * r;
		System.out.println("Arae of Circle :" + area);
	}

	void calArea(double a, double b) {
		double area = (a * b) / 2;
		System.out.println("Arae of Triangle :" + area);
	}

	public static void main(String[] args) {
		Calculatearea obj = new Calculatearea();
		obj.calArea(14.0f, 22.0f); // Rectangle
		obj.calArea(5.0); // Circle
		obj.calArea(18.0, 25.4); // Triangle
	}
}
