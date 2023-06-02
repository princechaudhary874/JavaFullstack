package week2.day5;

import java.util.Scanner;

public class StudentDetails2 {
	// declare
	final static int PASS_MARKS = 40;
	final static int SUBJECTS = 3;
	//read string from user
	public static void printMessage(String message) {
		System.out.print(message);
	}

	public static void printMessage(String message, double value) {
		System.out.print(message + ":" + value);
	}

	public static void printMessage(String message, String value) {
		System.out.print(message + ":" + value);
	}

	public static void newline() {
		System.out.println();
	}

	public static String readString() {
		return (new Scanner(System.in).nextLine());
	}

	public static int readInt() {
		return Integer.parseInt(readString());
	}

	public static int sum(int firstNumber, int secondNumber) {
		return (firstNumber + secondNumber);
	}

	public static float average(int total, int count) {
		return (total / count);
	}

	public static String result(int maths, int science, int english) {
		String result = "";
		if (science >= PASS_MARKS && maths >= PASS_MARKS && english >= PASS_MARKS) {
			result = "PASS";
		} else {
			result = "FAIL";
		}
		return result;
	}

	public static void main(String[] args) {
		// declare
		int rollNo; // student roll no
		String fullName; // student full name
		int math, sci, eng; // obtain marks of math, science, english
		int totalMarks; // total of obtained marks
		float averageMarks; // average of obtained marks
		String result; // result of student

		// input
		printMessage("------- Enter Student Details -------- ");
		newline();
		printMessage("ROLL NO : ");
		rollNo = readInt();
		printMessage("FULLNAME : ");
		fullName = readString();
		printMessage("MATHS : ");
		math = readInt();
		printMessage("SCIENCE : ");
		sci = readInt();
		printMessage("ENGLISH : ");
		eng = readInt();

		// process
		totalMarks = sum(sum(sci, math), eng);
		averageMarks = average(totalMarks, SUBJECTS);
		result = result(math, sci, eng);

		// output
		printMessage("Total Marks  ", totalMarks);
		newline();
		printMessage("Average   ", averageMarks);
		newline();
		printMessage("Result  ", result);
	}
}