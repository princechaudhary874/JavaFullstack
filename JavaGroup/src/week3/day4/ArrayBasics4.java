package week3.day4;

import myLibrary.BasicIO;

public class ArrayBasics4 {
	public static void main(String[] args) {
		// declare and initialize
		final int MAX = 5;
		int sum = 0;
		float average;

		int nums[] = new int[MAX];
		// read input from user
		for (int number : nums) {
			BasicIO.printMessage("enter number " + (nums[number] + 1) + " : ");
			BasicIO.newLine();
			BasicIO.readInt();
		}
		// calculate sum of the elements
		for (int number : nums) {

			sum += nums[number];
			number++;
		}
		// calculate average
		average = sum / nums.length;
		// print sum of the elements
		System.out.println("Sum : " + sum);
		// print average of the elements
		System.out.println("Average : " + average);
	}
}
