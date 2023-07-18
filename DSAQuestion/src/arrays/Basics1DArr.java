package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Basics1DArr {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			// Arrays=list of similar data stored in a contiguous memory allocation
			// syntax
			// datatype[] variableName=new datatype[size]
			int[] varia;// declaration of arrays,varia is getting defined in the stack
			varia = new int[4];// Initializaton:object is created in the memory(heap)
			// the actual creation of object in heap in runtime(dynamic memory allocation)
			// arrays of primitives
			varia[0] = 1;
			varia[1] = 2;
			varia[2] = 43;
			varia[3] = 32;

			// length of an array
			System.out.println("length of an array is : " + varia.length);
			// using for enhanced/each loop
			// syntax:for(datatype referenced_variable: arrayname)
			for (int num : varia) {
				// for every elements in the array,print the elements
				System.out.println(num);
				// here num represents elements of the array
			}

//		System.out.println(varia[7]);//gives index out of bounds error
			int[] arr = { 2, 34, 64, 676, 31 };
			// new trick to print element of an array
			System.out.println(Arrays.toString(arr));// converts elements of array into string

			// arrays of objects
			System.out.println("enter any five string");
			String[] str = new String[5];
			for (int i = 0; i < str.length; i++) {
				str[i] = in.next();
			}
			System.out.println(Arrays.toString(str));

			// modification in array
			System.out.println("Arrays with modification : ");
			str[2] = "you can do anything";// this is a reference variable
			System.out.println(Arrays.toString(str));
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}
