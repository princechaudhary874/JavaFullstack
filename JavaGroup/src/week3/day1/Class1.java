package week3.day1;

public class Class1 {
//Application of static Block?
	static {
		System.out.println("Hello");

	}

	static {
		System.out.println("Hello2");

	}

	public static void main(String[] args) {// Block Start
		// Expression->valid java term (code)
		int firstNumber, secondNumber, thirdNumber;// statements
		firstNumber = 45;
		secondNumber = 32;
		thirdNumber = firstNumber + secondNumber;
		System.out.println(thirdNumber);
		// Block Close

	}

	static {
		System.out.println("Hello3");

	}

}
