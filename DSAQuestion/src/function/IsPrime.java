package function;

import java.util.Scanner;
//Prime number = number having two factor
public class IsPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		// taking number from user
		int n = sc.nextInt();
		//calling isPrime and assigning in result
		boolean Result = isPrime(n);
		System.out.println(Result);

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
