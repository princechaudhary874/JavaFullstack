package week3.day1;
import java.util.Scanner;
public class IfStatement3 {
public static void main(String[] args) {
	//firstNumber=2
	//if firstNumber is equals to zero then
	//print(zero)
	//if firstNumber is equals to one then
	//print(one)
	//if firstNumber is equals to two then
		//print(two)
	int firstNumber;
	System.out.println("Enter number between 0 and 9");
	 firstNumber=Integer.parseInt(new Scanner(System.in).nextLine());
	if(firstNumber==0) {
		System.out.println("Zero");
	}
	if(firstNumber==1) {
		System.out.println("One");
	}
	if(firstNumber==2) {
		System.out.println("Two");
	}
	if(firstNumber==3) {
		System.out.println("Three");
	}
	if(firstNumber==4) {
		System.out.println("Four");
	}
	if(firstNumber==5) {
		System.out.println("Five");
	}
	if(firstNumber==6) {
		System.out.println("Six");
	}
	if(firstNumber==7) {
		System.out.println("Seven");
	}
	if(firstNumber==8) {
		System.out.println("Eight");
	}
	if(firstNumber==9) {
		System.out.println("Nine");
	}
	
}
}
