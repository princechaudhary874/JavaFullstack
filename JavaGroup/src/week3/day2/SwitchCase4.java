package week3.day2;

import java.util.Scanner;

import myLibrary.BasicIO;

public class SwitchCase4 {

	public static void main(String[] args) {
		// Enter any character :_A
		// A is vowel.

		// Enter any character :_B
		// B is consonant.
		System.out.print("Enter any character : ");// promt for user
		// read char value
		char ch;
		ch = BasicIO.readchar();
		switch (ch) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println(ch + " is a vowel ");
			break;
		case 'B':
		case 'b':
		case 'C':
		case 'c':
		case 'D':
		case 'd':
		case 'F':
		case 'f':
		case 'G':
		case 'g':
		case 'H':
		case 'h':
		case 'J':
		case 'j':
		case 'K':
		case 'k':
		case 'L':
		case 'l':
		case 'M':
		case 'm':
		case 'N':
		case 'n':
		case 'P':
		case 'p':
		case 'Q':
		case 'q':
		case 'R':
		case 'r':
		case 'S':
		case 's':
		case 'T':
		case 't':
		case 'V':
		case 'v':
		case 'W':
		case 'w':
		case 'X':
		case 'x':
		case 'Y':
		case 'y':
		case 'Z':
		case 'z':
			System.out.println(ch + "is a consonant");
			break;
		default:
			System.out.println("Invalid Input");

		}

	}

}
