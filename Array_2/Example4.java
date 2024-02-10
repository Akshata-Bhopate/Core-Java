package Array_2;

import java.util.Iterator;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter Size :");
int size=sc.nextInt();
int arr[]=new int[size];
System.out.println("Enter Elements:");
//input
for (int i = 0; i < arr.length; i++) {
	arr[i]=sc.nextInt();
}
//sum of array
int sum=0;
for (int i = 0; i < arr.length; i++) {
	sum=sum+arr[i];
}
System.out.println("Sum is:"+sum);

//average value of array elements
int avg=sum/arr.length;
System.out.println("average value of array elements:"+avg);

//Even and Odd
System.out.println("Even Number is:");
for (int i = 0; i < arr.length; i++) {
	if (arr[i]%2==0) {
		System.out.println(arr[i]);
	}
}
	System.out.println("Odd Number is:");
	for (int j = 0; j < arr.length; j++) {
		 if (arr[j]%2!=0) {
		System.out.println(arr[j]);
	}
}	
}
	}



