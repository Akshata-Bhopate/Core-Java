package Array;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to find the number of even and odd integers in a given array of integers.
	     
		int a[]={1,2,3,4,5,6,7,8};  
		//System.out.println("1,2,3,4,5,6");
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2!=0){  
		System.out.println(a[i]);  
		}  
		}  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2==0){  
		System.out.println(a[i]);  
		}  
		}  
	}

}
