package week3.day2;

import myLibrary.BasicIO;

public class MainMenu {
	public static void main(String[] args) {
		//declare
		int num1 ;//first number
		int num2;//second number
		int ch;//user choice
		
		//("Enter first number : ");
		num1=BasicIO.readInt();
		
		System.out.print("Enter second number : ");
		num2=BasicIO.readInt();
		
		System.out.print("Enter 1 for addtion, 2 for subtraction, 3 for product, 4 for division, 5 to exit :");
		ch=BasicIO.readInt();
		//range ? should be used
		switch(ch) {
		case 1:
			BasicIO.printMessage("The sum of "+num1+" and "+num2 +" is "+(num1+num2));
			break;
		case 2:
			BasicIO.printMessage("The difference of "+num1+" and "+num2 +" is "+(num1-num2));
			break;
		case 3:
			BasicIO.printMessage("The product of "+num1+" and "+num2 +" is "+(num1*num2));
			break;
		case 4:
			BasicIO.printMessage("The division of "+num1+" by "+num2 +" is "+(num1/num2));
			break;
		case 5:
			break;
		default:
			BasicIO.printMessage("Invalid input");
			
		}
		
		
	}
}
