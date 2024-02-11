//2] copy all elements of one array into another array
package Array_3;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 11, 22, 33, 44, 55 };
		int arr2[] = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("Orignal array is:");
//Display arr1
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + " ");
		}
//display arr2
		System.out.println("New array is:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i] + " ");
		}
	}

}
