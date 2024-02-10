// 3]Write a Java program to find the number of even and odd integers in a given array of integers. 
package Array_2;

public class Example3 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		
		System.out.println("Even Numbers:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("Odd Numbers:");
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 != 0) {
				System.out.println(arr[j]);

			}
		}
	}
}
