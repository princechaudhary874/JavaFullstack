package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Basic2dArrays {
	public static void main(String[] args) {
		// 2DArrays=array of arrays
		// syntax:datatypes[][]var_name=new datatypes[row][column];
		// initialization
		int[][] arr = new int[3][4];// rows is mandatory
		Scanner sc = new Scanner(System.in);
		// input
		System.out.print("Enter the elements :");
		for (int row = 0; row < arr.length; row++) {// by default row store the length of 2D arrays
			for (int col = 0; col < arr[row].length; col++) {// e.g:In
																// {{1,2,3,4},{1,2},{1,25,6}};,arr[0].length->{1,2,3,4}.length
				arr[row][col] = sc.nextInt();
			}
			System.out.println();
		}
		// output using Arrays.toString()
		System.out.println("using Arrays.toString(arr[row] :");
		for (int row = 0; row < arr.length; row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
		System.out.println("using for each loop :");
		//output using for each loop
		for(int[]a :arr) {
			//for every elements in the array,print the elements
			System.out.println(Arrays.toString(a));
		}
		System.out.println("using for loop :");
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
