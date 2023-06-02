package week3.day3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock {
	public static void main(String[] args) {
		try {
			while (true) {
				final int INTERVAL = 1000;
				LocalDateTime localDateTime = LocalDateTime.now();
				System.out.println(localDateTime.getMonth() + "/" + localDateTime.getDayOfMonth() + "/"
						+ localDateTime.getYear() + "  " + localDateTime.getHour() + ":" + localDateTime.getMinute()
						+ ":" + localDateTime.getSecond());

				Thread.sleep(INTERVAL);
			}
		} catch (Exception e) {
			System.out.println("error : " + e.getMessage());
		}
		finally {
			System.out.println("Finally!!!");
		}
	}
}
