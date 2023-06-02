package week3.day3;
//sleep for a while
public class SleepTest {
	public static void main(String[] args) {
		// Thread.sleep(milliseconds);
		int i = 1;
		final int INTERVAL = 1000;//millisecond
		try {
			while (i <= 10) {
				System.out.println(i);
				Thread.sleep(INTERVAL);
				i++;
			}
		} catch (Exception e) {
			System.out.println("error" + e.getMessage());
		}
		finally {
			System.out.println("finally");
		}
	}
}
