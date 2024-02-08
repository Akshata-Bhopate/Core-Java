package Examples;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number:");	
	num1=sc.nextInt();
	System.out.println("Enter Second number:");
    num2=sc.nextInt();
    num1=num1+num2;
    num2=num1-num2;
    num1=num1-num2;
    System.out.println("After swapping");
    System.out.println("first number:" +num1);
    System.out.println("Second number:" +num2);
    


	
	
	
	}
	
	
	
}