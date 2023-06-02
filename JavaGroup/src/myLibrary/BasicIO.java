package myLibrary;
import java.util.Scanner;
public class BasicIO {
	public static void printMessage(String message) {
		System.out.print(message);
	}
	
	public static void printMessage(String label,String message) {
		System.out.print(label+":"+message);
	}
	
	public static void printMessage(String label,double message) {
		System.out.print(label+":"+message);
	}
	
	public static void newLine() {
		System.out.println();
	}
	
	public static String readString() {
		return (new Scanner(System.in).nextLine());
	}
	public static char readchar() {
		return ( readString().charAt(0));
	}
	
	
	public static int readInt() {
		return (Integer.parseInt(readString()));
		
	}
}
