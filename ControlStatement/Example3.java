//Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
package ControlStatement;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character chr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character :");
		chr = sc.next().charAt(0);
		if (chr >= 'a' && chr <= 'z') {
			System.out.println("This is  Lowercase Alphabet");
		} else if (chr >= 'A' && chr <= 'Z') {
			System.out.println("This is a Uppercase Alphabet");

		}else {
			System.out.println("This is not Alphabet character");

		}
	}

}
