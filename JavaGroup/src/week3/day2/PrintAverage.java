package week3.day2;

public class PrintAverage {
	public static void main(String[] args) {
		int start=1;
		int end=10;
		float sum=0;
		float average;
		while(start<=end) {
			sum+=start;
			start++;
		}
		System.out.println(sum);
		average=sum/end;
		System.out.print(average);
	}
}
