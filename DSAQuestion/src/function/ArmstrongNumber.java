package function;

import java.util.Scanner;

//ArmStrong Number= Number which is equal to the sum of its digits power number length.
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		if (isArmstrongNumber(number)) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is not an Armstrong number.");
		}
	}

	// function to check if a number is an Armstrong number
	static boolean isArmstrongNumber(int number) {
		// Store the original value of the number
		int originalNumber = number;
		// Initialize the sum of digits raised to the power of the number of digits
		int sum = 0;
		// Calculate the number of digits
		int numDigits = String.valueOf(number).length();

		// Extract each digit of the number and calculate the sum
		while (number != 0) {
			int digit = number % 10; // Get the last digit of the number
			sum += Math.pow(digit, numDigits); // Add the digit raised to the power of numDigits to the sum
			number /= 10; // Remove the last digit from the number
		}

		// Check if the sum is equal to the originalNumber
		return (sum == originalNumber);
	}

}
