//2] copy all elements of one array into another array 
package Array_3;

import java.util.Scanner;

public class CopyArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size:");
		int size = sc.nextInt();
		int arr1[] = new int[size];
		int arr2[] = new int[arr1.length];
//arr1=arr2;
//arr2[0]++;
		System.out.println("Enter Elements:");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Elements of First array:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("Elements of Copied array:");
		for (int i = 0; i < arr2.length; i++) {
			arr2 = arr1;
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

}
