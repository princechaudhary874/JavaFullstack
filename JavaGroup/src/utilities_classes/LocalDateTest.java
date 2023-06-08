package utilities_classes;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public class LocalDateTest {

	

	public static void main(String[] args) {
		// DayOfWeek getDayOfWeek()
		// LocalDate ld = new Date();

		// System.out.println(localdate);

		// Month getMonth()
		/*
		 * LocalDate localdate = LocalDate.now(); Month localdate1
		 * =localdate.getMonth(); System.out.println(localdate1);
		 */

		// DayOfWeek getDayOfWeek()
		/*LocalDate localdate = LocalDate.now();
		DayOfWeek localdate2=localdate.getDayOfWeek();
		System.out.println(localdate2);
		*/
		
		//LocalDateTime atStartOfDay()
		/*LocalDate localdate = LocalDate.now();
		LocalDateTime localdate3=localdate.atStartOfDay();
		System.out.println(localdate3);
		*/
		
		//LocalDateTime atTime(int hour, int minute)
		/*int hour=8;
		int minute=38;
		LocalDate localdate = LocalDate.now();
		LocalDateTime localdate4=localdate.atTime( hour,  minute);
		System.out.println(localdate4);	
		*/
	}
}


