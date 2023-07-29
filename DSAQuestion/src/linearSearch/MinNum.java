package linearSearch;

public class MinNum {
	public static void main(String[] args) {
		int[] arr= {23,43,23,55,5,7,-9,78,23,4,15,6,8,-19};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.print("Minimum number : "+min);
	}
}
