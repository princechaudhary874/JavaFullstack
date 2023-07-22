package linearSearch;

import java.util.Scanner;

public class FindTarget {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 23, 7678, 345, 234, 57, 312, 65, 23, 34 };
		System.out.print("Enter your target element: ");
		int target = 0; // Initialize target to a default value
		try {
			target = sc.nextInt();
		} catch (java.util.InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid integer.");
			System.exit(1); // Exit the program, since the input is invalid.
		}
		if (linearSearch(arr, target)) {
			System.out.println(target + " is found in the array");
		} else {
			System.out.println(target + " is not found in the array");
		}
	}

	static boolean linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return false;
		}
		for (int element : arr) {
			if (element == target) {
				return true;
			}
		}
		// This line will be executed if none of the return statements are executed
		return false;
	}
}
