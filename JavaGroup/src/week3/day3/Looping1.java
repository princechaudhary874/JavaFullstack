package week3.day3;

public class Looping1 {
	public static void main(String[] args) {
		int start1,start2,stop1,stop2;
		start1=1;
		stop1=5;
		
		while(start1<=stop1) {
			System.out.println(start1);
			start2=6;
			stop2=10;
			while(start2<=stop2) {
				System.out.println(start2);
				start2++;
			}
			start1++;
			
		}
	}
}
