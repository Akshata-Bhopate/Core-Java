package Variables;

import java.util.Scanner;

public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.print("a:");
		int a = obj.nextInt();
		System.out.print("b:");
		int b = obj.nextInt();
		int sum = a + b;
		System.out.println("a + b :" + sum);
	}

}
