package exceptions_test;

import myLibrary.BasicIO;

class LowRange extends Exception { // sub class of Exception class
	public LowRange(String message) {
		super(message);
	}
}

class HighRange extends Exception {// sub class of Exception class
	public HighRange(String message) {
		super(message);
	}
}

public class ExceptionTest3 {
	public static void main(String[] args) {
		//declare
		int age;
		try {
		BasicIO.printMessage("Enter your age : ");// age between 18 to 30.
		age = BasicIO.readInt(); //45
		if(age<18) {
			throw new LowRange("Age in low range");
		}
		else if(age>30) {
			throw new HighRange("Age in high range");
		}
		else {
			BasicIO.printMessage("Age Status", "Within range");
		}
		}
		catch(NumberFormatException nfe) {
			System.out.println("Error1 : "+nfe);
		}
		catch(LowRange lr) {
			System.out.println("Error2 : "+lr);
		}
		catch(HighRange hr) {
			System.out.println("Error3 : "+hr);
		}
		catch(Exception ex) {
			System.out.println("Error4 : "+ex);
		}
		
	}
}