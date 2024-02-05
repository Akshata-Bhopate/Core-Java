//Take two int values from user and print greatest among them.

package ControlStatement;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val1, val2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value :");
		val1 = sc.nextInt();
		System.out.println("Enter Second Value :");
		val2 = sc.nextInt();
		if (val1 > val2) {
			System.out.println("First Value is greater");
		} else if (val1 == val2) {
			System.out.println("both are equal");
		} else {
			System.out.println("Second value is greater");
		}
	}

}
