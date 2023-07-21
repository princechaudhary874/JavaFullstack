package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		// ArrayList: The ArrayList class is a resizable array, which can be found in
		// the java.util package
		// syntax
		// ArrayList<datatype> var_name=new ArrayList<>();
		// we can't use primitives
		// we use wrapper classes rather than primitives
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();

		list.add(12);
		list.add(13);
		list.add(14);
		list.add(16);
		list.add(15);
		list.add(18);
		list.add(19);
		list.add(11);
		list.add(121);
		System.out.println(list);
		// updation
		list.set(1, 500);
		System.out.println(list);
		// check elements in the arrays
		System.out.println(list.contains(7889));
		// to remove an element
		list.remove(2);
		System.out.println(list);

		// input in ArrayList
		System.out.print("Enter any five elements : ");
		for (int i = 0; i < 5; i++) {
			list1.add(sc.nextInt());
		}
		//output
		System.out.println(list1);
		//get an item in ArrayList
		System.out.println(list1.get(1));
	}

}
