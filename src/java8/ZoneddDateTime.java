package java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * <p>
 * <b>Zoned DateTime: </b>Zoned date-time API is to be used when time zone is to
 * be considered. Let us see them in action.
 * </p>
 * <hr>
 * 
 * @author ga.omar
 *
 */
public class ZoneddDateTime {

	public static void main(String[] args) {
		testZonedDateTime();
	}

	public static void testZonedDateTime() {

		// Get the current date and time
		ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
		System.out.println("date1: " + date1);

		ZoneId id = ZoneId.of("Europe/Paris");
		System.out.println("ZoneId: " + id);

		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("CurrentZone: " + currentZone);

	}

}
