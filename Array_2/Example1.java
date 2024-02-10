//1] Write a Java program to sum values of an array

package Array_2;

public class Example1 {

	public static void main(String[] args) {
int num[]=new int[5];
num [0]=10;
num [1]=20;
num [2]=30;
num [3]=40;
num [4]=50;
 int sum=0;
for (int i = 0; i < num.length; i++) {
sum=sum+num[i];
}
System.out.println(sum);
	}

}
