//Java program to find if the given number is a leap year?

package ControlStatements;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Year :");
		year = obj.nextInt();

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) { 
			System.out.println("Specified year is a leap year");
		} else {
			System.out.println("Specified year is not a leap year");
		}

	}

}
