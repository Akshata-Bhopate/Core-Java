//Calculate the sum of all even numbers between 1 and n using a for loop.
package forLoopExamples;

import java.util.Scanner;

public class SumofEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 2; i <= num; i += 2) {
			sum += i;
			System.out.println(i);
		}

		System.out.println("Sum of Even Number:" + sum);
	}

}
