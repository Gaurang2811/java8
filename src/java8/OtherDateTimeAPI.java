package java8;

import java.awt.Adjustable;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * <p>
 * <b>Chrono Units Enum: </b>java.time.temporal.ChronoUnit enum is added in Java
 * 8 to replace the integer values used in old API to represent day, month, etc
 * </p>
 * <hr>
 * <p>
 * <b>Period and Duration</b>
 * </p>
 * <p>
 * With Java 8, two specialized classes are introduced to deal with the time
 * differences.
 * </p>
 * <p>
 * <b>Period − </b>It deals with date based amount of time.
 * </p>
 * <p>
 * <b>Duration − </b>It deals with time based amount of time.
 * </p>
 * <hr>
 * <p>
 * <b> Temporal Adjusters: </b> TemporalAdjuster is used to perform the date
 * mathematics. For example, get the "Second Saturday of the Month" or "Next
 * Tuesday". Let us see them in action.
 * </p>
 * <hr>
 * 
 * @author ga.omar
 *
 */
public class OtherDateTimeAPI {
	public static void main(String[] args) {
		System.out.println("Chrono units\n");
		testChromoUnits();
		System.out.println("\nPeriods\n");
		testPeriod();
		System.out.println("\nDurations\n");
		testDuration();
		System.out.println("\nAdjusters\n");
		testAdjusters();
	}

	public static void testChromoUnits() {
		// Get the current date
		LocalDate today = LocalDate.now();
		System.out.println("Current date: " + today);

		// add 1 week to the current date
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println("Next week: " + nextWeek);

		// add 1 month to the current date
		LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next month: " + nextMonth);

		// add 1 year to the current date
		LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
		System.out.println("Next year: " + nextYear);

		// add 10 years to the current date
		LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
		System.out.println("Date after ten year: " + nextDecade);
	}

	public static void testPeriod() {
		// Get the current date
		LocalDate date1 = LocalDate.now();
		System.out.println("Current date: " + date1);

		// add 1 month to the current date
		LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next month: " + date2);

		Period period = Period.between(date2, date1);
		System.out.println("Period: " + period);
	}

	public static void testDuration() {
		LocalTime time1 = LocalTime.now();
		Duration twoHours = Duration.ofHours(2);

		LocalTime time2 = time1.plus(twoHours);
		Duration duration = Duration.between(time1, time2);

		System.out.println("Duration: " + duration);
	}

	private static void testAdjusters() {
		LocalDate date = LocalDate.now();
		System.out.println("Current Date: " + date);

		// get next WEDHESDAy
		LocalDate date1 = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println("Next WEDNESDAY on : " + date1);

		// second Saturday
		LocalDate f = LocalDate.of(date.getYear(), date.getMonth(), 1);
		LocalDate ss = f.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
				.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Second Saturday on :" + ss);

	}
}
