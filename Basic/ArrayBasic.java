package Basic;

import java.util.ArrayList;

public class ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>(); // Creating arraylist
		list.add("Rose");
		list.add("Sunflower");
		list.add("Lotus");
		list.add("Lily");
		list.add("Jasmine");
		System.out.println("--- For loop ---");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		int count = 0;
		System.out.println("--- While loop ---");
		while (number.size() > count) {
			System.out.println(number.get(count));
			count++;
		}
		ArrayList<String> langues = new ArrayList<String>();
		langues.add("C++");
		langues.add("C");
		langues.add("Java");
		langues.add("Python");
		langues.add("Javasript");
		System.out.println("---ForEach loop---");
		for (String l1 : langues) {
			System.out.println(l1);
		}
	}

}
