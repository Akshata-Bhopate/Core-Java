// 2] Write a Java program to calculate the average value of array elements.
package Array_2;

public class Example2 {

	public static void main(String[] args) {
int arr[]= {2,3,3,5,7,10};
int sum=0;
for (int i = 0; i < arr.length; i++) {
	sum=sum+arr[i];
	
}
int avg=sum/arr.length;
System.out.println("Average value of array elements is:" +avg);
	}

}
