/**
 *
 */
package interview.java.practice.java8.features.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author tgirase
 *
 */
public class DateTimeService {

	/**
	 * Method to user is Adult (Adult to be considered as more than 16 years of age)
	 *
	 * @param date
	 * @return
	 */
	public boolean isAdult(LocalDate date) {
		// TODO: Check if passsed date is valid
		return false;
	}

	/**
	 * Considers current date as the subscription date and returns date after 30
	 * days
	 *
	 * @return
	 */
	public LocalDate getOneMonthSubscriptionExpirationDate() {
		// TODO: implement this
		return null;
	}

	/**
	 * Calculates age of a person
	 *
	 * @param date
	 * @return
	 */
	public int getAge(LocalDate date) {
		// TODO: add logic
		return -1;
	}

	/**
	 * Returns day of the persons birthday
	 *
	 * @param date
	 * @return
	 */
	public ChronoUnit getDayOfBirth(LocalDate date) {
		// TODO: add logic
		return null;
	}

}
