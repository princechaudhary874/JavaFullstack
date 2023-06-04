package week3.day4;

public class ArrayBasics {
	public static void main(String[] args) {
		//similar type of multiple values
		int nums[];//declare
		nums=new int[5];//initialize
		//value assign
		nums[0]=9;
		nums[1]=4;
		nums[2]=3;
		nums[3]=5;
		nums[4]=7;
		
		//value access
		System.out.println(nums[0]+", "+nums[1]+", "
		+nums[2]+", "+nums[3]+", "+nums[4]);
		System.out.println(nums.length);//length of an array
		
	}

}
