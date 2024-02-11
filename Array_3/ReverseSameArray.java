//3] Write a java program to reverse the same array.
package Array_3;

public class ReverseSameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      
int arr1[]= {10,20,30,40,50};
System.out.println("Orignal Array is:");
for (int i = 0; i < arr1.length; i++) {
	System.out.println(arr1[i]);
}
System.out.println("Revers array is:");
for (int i=arr1.length-1;i>=0; i--) {
	System.out.println(arr1[i]);
}
	}

}
