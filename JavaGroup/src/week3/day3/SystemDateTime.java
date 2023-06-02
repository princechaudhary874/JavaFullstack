package week3.day3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemDateTime {
	public static void main(String[] args) {
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println(localDateTime.getMonth()+"/"+localDateTime.getDayOfMonth()+"/"+localDateTime.getYear()+"  "+localDateTime.getHour()+":"+localDateTime.getMinute()+":"+localDateTime.getSecond());
	
	}
}
