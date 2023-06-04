package week3.day4;

public class DoWhileLoop {
	public static void main(String[] args) {
		try {
			int start = 110;
			int stop = 10;
			do {
				System.out.println("Hello");
				start++;
			} while (start < stop);
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		finally {
			System.out.println("finally!");
		}
		
	}
}
