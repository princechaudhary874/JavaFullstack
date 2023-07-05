package stringQuestion;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string : ");
		String str = sc.nextLine();
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		System.out.println("Your reverse string is "+revStr);
	}
}
