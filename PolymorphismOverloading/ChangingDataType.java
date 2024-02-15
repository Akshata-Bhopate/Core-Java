// Overload method by changing data type of argument and keeping same number of argument
package PolymorphismOverloading;

public class ChangingDataType {

	public int sum(int a, int b) {
		return (a + b);
	}

	public int sum(int a, int b, int c) {
		return (a + b + c);
	}

	public double sum(double a, double b) {
		return (a + b);
	}

	public static void main(String[] args) {
		ChangingDataType sc = new ChangingDataType();
		System.out.println(sc.sum(40, 20));
		System.out.println(sc.sum(40, 20, 20));
		System.out.println(sc.sum(40.5, 20.5));

	}
}
