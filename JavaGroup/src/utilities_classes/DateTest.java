package utilities_classes;

import java.util.Date;
import java.sql.Timestamp;

public class DateTest {

	public static void main(String[] args) {
		// long getTime()
		Date date = new Date();
		long d = date.getTime();
		System.out.println(d); // TimeStamp

		// How to convert Time-stamp to date/time?
		Timestamp timestamp = new Timestamp(d);
		Date convertedDate = new Date(timestamp.getTime());
		System.out.println(convertedDate);// timestamp to date
	}
}