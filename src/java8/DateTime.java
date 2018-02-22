package java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * <p>
 * With Java 8, a new Date-Time API is introduced to cover the following
 * drawbacks of old date-time API.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Not thread safe</b> − java.util.Date is not thread safe, thus developers
 * have to deal with concurrency issue while using date. The new date-time API
 * is immutable and does not have setter methods.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Poor design</b> − Default Date starts from 1900, month starts from 1, and
 * day starts from 0, so no uniformity. The old API had less direct methods for
 * date operations. The new API provides numerous utility methods for such
 * operations.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Difficult time zone handling</b> − Developers had to write a lot of code
 * to deal with timezone issues. The new API has been developed keeping
 * domain-specific design in mind.
 * </p>
 * </li>
 * </ul>
 * 
 * <p>
 * Java 8 introduces a new date-time API under the package java.time. Following
 * are some of the important classes introduced in java.time package.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Local</b> − Simplified date-time API with no complexity of timezone
 * handling.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Zoned</b> − Specialized date-time API to deal with various timezones.
 * </p>
 * </li>
 * </ul>
 * 
 * @author ga.omar
 *
 */
public class DateTime {
	public static void main(String[] args) {
		testlocaleDateTime();
	}

	private static void testlocaleDateTime() {
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current DateTime: " + currentTime);

		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("date1: " + date1);

		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		DayOfWeek dayOfWeek = currentTime.getDayOfWeek();
		int seconds = currentTime.getSecond();
		System.out.println("Month: " + month + "\nday: " + day + "\nseconds: " + seconds + "\nDayOfWeek: " + dayOfWeek);

		// update the month and year
		LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
		System.out.println("date2: " + date2);

		// 19 March 2013
		LocalDate date3 = LocalDate.of(2013, Month.MARCH, 19);
		System.out.println("date3: " + date3);

		// 22 hour 15 minutes
		LocalTime date4 = LocalTime.of(22, 15);
		System.out.println("date4: " + date4);

		// parse a string
		LocalTime date5 = LocalTime.parse("20:15:30");
		System.out.println("date5: " + date5);
		
		/**
		 * Chrono Units Enum
		 */
	}
}
