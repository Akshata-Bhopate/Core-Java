package Array;

public class AverageofArray {

	public static void main(String[] args) {
//		Write a Java program to calculate the average value of array elements.

		 int array[]={10,20,30,40,50,60,70};// you can define double array too
		 int sum=0;
		for(int i=0;i<array.length;i++)
		{
		/* 
		This logic is used  for calculating sum of array elements*/
		  sum=sum + array[i];
		}
		  System.out.println("Sum of Array Elements are: "+sum);
		  double average=(sum/array.length);//simple average formula
		  System.out.format("Average of Array Elements is: " +average);
	}
		
}
