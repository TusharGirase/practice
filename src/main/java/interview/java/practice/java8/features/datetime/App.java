/**
 *
 */
package interview.java.practice.java8.features.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author tgirase
 *
 */
public class App {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date); // 2020-04-05
		// you can initialize date for certain date
		LocalDate date2 = LocalDate.of(1992, 9, 16);
		System.out.println(date2);
		LocalDate date3 = LocalDate.parse("1992-09-16");
		System.out.println(date3);
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		LocalDate afterMonth = LocalDate.now().plusMonths(1);
		System.out.println(afterMonth);
		LocalDate previousMonthSameDay = getPreviousDate(1, ChronoUnit.MONTHS);
		System.out.println(previousMonthSameDay);
		DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
		System.out.println(sunday);
		int day = LocalDate.now().getDayOfMonth();
		System.out.println(day);

		boolean notBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));
		System.out.println(notBefore);
	}

	public static LocalDate getPreviousDate(int amountToSubstract, ChronoUnit unit) {
		return LocalDate.now().minus(amountToSubstract, unit);
	}

}
