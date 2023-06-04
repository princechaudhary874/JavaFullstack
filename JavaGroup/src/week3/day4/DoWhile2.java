package week3.day4;

import myLibrary.BasicIO;
import myLibrary.Calculator;

public class DoWhile2 {
	public static void main(String[] args) {
		int choice;
		char ch;
		try {
			do {
				//input
				BasicIO.printMessage("----------Main menu----------");
				BasicIO.newLine();
				BasicIO.printMessage("1.ADD");
				BasicIO.newLine();
				BasicIO.printMessage("2.SUB");
				BasicIO.newLine();
				BasicIO.printMessage("3.PRD");
				BasicIO.newLine();
				BasicIO.printMessage("4.DIV");
				BasicIO.newLine();
				BasicIO.printMessage("0.Exit");
				BasicIO.newLine();
				BasicIO.printMessage("------------------------------");
				BasicIO.newLine();
				BasicIO.printMessage("Enter your choice : ");
				choice = BasicIO.readInt();
				if ((choice >= 0) || (choice <= 4)) {
					// perform calculation
					if (choice == 0) {
						// exit
						System.exit(0);// Exit Application
					} else if (choice == 1) {
						// sum
						int num1, num2, num3;
						// read two values from user
						BasicIO.printMessage("Enter first number : ");
						num1 = BasicIO.readInt();

						BasicIO.printMessage("Enter second number : ");
						num2 = BasicIO.readInt();
						// calculate sum as result
						num3 = Calculator.sum(num1, num2);
						// print result
						BasicIO.printMessage(num3 + "");
						BasicIO.newLine();

					}
				}

				else {
					BasicIO.printMessage("Choice out of range");
				}
				BasicIO.printMessage("Do you want to continue(Y/N) : ");
				ch = BasicIO.readchar();
			} while ((ch == 'y') || (ch == 'Y'));
		} catch (Exception e) {
			BasicIO.printMessage("Error : " + e.getMessage());
		} finally {
			BasicIO.printMessage("Finally!!");
		}
	}
}
