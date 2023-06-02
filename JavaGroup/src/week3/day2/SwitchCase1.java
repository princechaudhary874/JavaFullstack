package week3.day2;

import myLibrary.BasicIO;

public class SwitchCase1 {
	public static void main(String[] args) {
		// difference between if and switch case statement

		BasicIO.printMessage("Enter number between 1-7 : ");

		int day = BasicIO.readInt();// Sun->1 to Sat->7
		if ((day < 1) || (day > 7)) {
			BasicIO.printMessage("out of range");
		} else if (day == 1) {
			BasicIO.printMessage("Sun");
		} else if (day == 2) {
			BasicIO.printMessage("Mon");
		} else if (day == 3) {
			BasicIO.printMessage("Tue");
		} else if (day == 4) {
			BasicIO.printMessage("Wed");
		} else if (day == 5) {
			BasicIO.printMessage("Thu");
		} else if (day == 6) {
			BasicIO.printMessage("Fri");
		} else if (day == 7) {
			BasicIO.printMessage("Sat");
		}

	}
}
