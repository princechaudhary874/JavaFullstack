package arrays;

import java.util.Scanner;

public class MaxNumberInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// creating object of array
		int[] arr = new int[5];
		System.out.print("Enter the elements of array : ");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter your starting index : ");
		int a=sc.nextInt();
		System.out.print("Enter your ending index : ");
		int b=sc.nextInt();
		System.out.print("Your maximum number is "+maxNum(arr,a,b));
	}
	static int maxNum(int[] arr,int start,int end) {
		int max=Integer.MIN_VALUE;
		for(int i=start;i<end;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
}
