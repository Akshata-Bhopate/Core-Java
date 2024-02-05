//Write a Java program to get a number from the user and print whether it is positive or negative.
package ControlStatement;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		no = sc.nextInt();
		if (no > 0) {
			System.out.println("Positive Number");
		} else if (no < 0) {
			System.out.println("Negative Number");
		} else {
			System.out.println("The number is zero");

		}
	}

}
