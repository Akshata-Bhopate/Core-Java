package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {

//		Write a Java program to sum values of an array

		Scanner input = new Scanner(System.in);

		int number[] = new int[5];
		int sum = 0;
		System.out.print("Enter the 5 elements: ");

		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextInt();
			sum += number[i];
		}
		System.out.println("Sum of array elements is: " + sum);

	}

}
