package function;

public class PrintAll3DigitArmstrongNumbers {

	public static void main(String[] args) {
		// Iterate over all 3-digit numbers
		for (int i = 100; i < 1000; i++) {
			// Check if the number is an Armstrong number
			if (isArmstrong(i)) {
				System.out.print(i + " "); // Print the Armstrong number
			}
		}
	}

	// Function to check if a number is an Armstrong number
	static boolean isArmstrong(int n) {
		int originalNumber = n; // Store the original value of the number
		int sum = 0; // Initialize the sum of digits raised to the power of the number of digits
		int totalDigits = String.valueOf(n).length(); // Calculate the number of digits

		// Extract each digit of the number and calculate the sum
		while (n != 0) {
			int digit = n % 10; // Get the last digit of the number
			sum += Math.pow(digit, totalDigits); // Add the digit raised to the power of totalDigits to the sum
			n /= 10; // Remove the last digit from the number
		}

		// Check if the sum is equal to the originalNumber
		return originalNumber == sum;
	}
}
