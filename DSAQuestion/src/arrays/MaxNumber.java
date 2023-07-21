package arrays;

public class MaxNumber {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,244,74,7456};
		System.out.println(max(arr));
	}
	
	static int max(int[] arr) {
		int maxValue=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++) {
			if(maxValue<arr[i]) {
				maxValue=arr[i];
			}
		}
		return maxValue;
	}
}
