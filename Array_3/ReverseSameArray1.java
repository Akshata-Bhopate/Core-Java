//3] Write a java program to reverse the same array.

package Array_3;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseSameArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size:");
		int size = sc.nextInt();
		int arr1[] = new int[size];
		System.out.println("Enter Elements:");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Reverse array:");
		for (int i = arr1.length - 1; i >= 0; i--) {
			System.out.println(arr1[i]);
		}
	}

}
