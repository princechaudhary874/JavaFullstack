package arrays;

import java.util.Arrays;

public class PassingInFunction {
	public static void main(String[] args) {
		int[] arr= {4,24,555,21};
		System.out.println(Arrays.toString(arr));
		change(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void change(int[] num) {
		num[1]=54;
	}
}
