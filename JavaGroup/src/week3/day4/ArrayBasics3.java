package week3.day4;

import myLibrary.BasicIO;

public class ArrayBasics3 {
	public static void main(String[] args) {
		// declare and initialize
		int nums[] = { 7, 3, 6, 42, 4 };

		// increase elements by 1
		for (int number:nums) {
//			nums[i]=nums[i]+1;
			nums[number]++;
			
		}
		// print values
		//processing and accessing
		for(int number:nums) {
			System.out.println(number);
		}
	}
}
