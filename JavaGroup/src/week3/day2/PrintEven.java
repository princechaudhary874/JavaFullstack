package week3.day2;

public class PrintEven {
	public static void main(String[] args) {
		int start=1;
		int end=10;
		while(start<=end) {
			if(start%2==0) {
				System.out.print(start+" ");
				start++;
			}
		}
	}
}
