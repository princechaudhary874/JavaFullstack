package week3.day4;
import myLibrary.BasicIO;
public class ArrayBasics2 {
	public static void main(String[] args) {
		final int MAX=5;
		int nums[]=new int [MAX];
		//input
		for(int i=0;i<MAX;i++) {
			BasicIO.printMessage("Enter numbIer "+(i+1)+" : ");
			nums[i]=BasicIO.readInt();
		}
		
		//processing
		//add,sub,prd,div,sqrt,pow,and others
		for(int i=0;i<nums.length;i++) {
			nums[i]=nums[i]+1;
		}
		//output
		for(int i=0;i<MAX;i++) {
			BasicIO.printMessage("Value "+(i+1)+" :"+nums[i]);
		}
	}
}
