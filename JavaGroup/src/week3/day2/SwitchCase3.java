package week3.day2;

public class SwitchCase3 {
	public static void main(String[] args) {
		//boolean result=false;
		//Cannot switch on a value of type boolean. 
		//Only convertible int values, strings or enum variables are permitted
		char ch='b';
		switch(ch) {
		case 'A'://auto converted to int ->ASCII Value of A
		System.out.println("First");
		break;
		case 'B':
			System.out.println("Second");
			break;
		case 'C':
			System.out.println("Third");
			break;
		case 'D':
			System.out.println("Fourth");
			break;
		case 'E':
			System.out.println("Fifth");
			break;
			default:
				System.out.println("Invalid input");
		
		}
	}
}
