package function;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter starting range of number : ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter Ending range of number : ");
		int lastNumber = sc.nextInt();
		for (int i = firstNumber; i <= lastNumber; i++) {
		if(isPrime(i)) {
			System.out.print(i + " ");
		}
		}
	}

	static boolean isPrime(int n) {
		if (n == 2) {
			return true;
		} else if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

}
