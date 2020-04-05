/**
 *
 */
package interview.java.practice.java8.features.streaminterview.java.practice.java8.features.optional;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import interview.java.practice.java8.features.optional.EmployeeService;

/**
 * @author tgirase
 *
 */
public class EmployeeServiceTest {

	EmployeeService service;

	@BeforeEach
	public void setup() {
		service = new EmployeeService();
	}

	@Test
	public void test_handleNullObjects() {
		Assertions.assertThrows(NullPointerException.class, () -> service.getPassPortNumber(5).length());

		// for above code we always have to handle null objects
		// if (service.getPassPortNumber(5) != null) {
		// service.getPassPortNumber(5).length();
		// } else {
		// some block of code
		// }
	}

	@Test
	public void test_withOptional_ifNull() {
		String passNo = service.getPassPortNumberWitnOptional(5).orElse("");
		Assertions.assertTrue(passNo.isEmpty());
	}

	@Test
	public void test_withOptional_ifNotNull() {
		String passNo = service.getPassPortNumberWitnOptional(1).orElse("");
		Assertions.assertFalse(passNo.isEmpty());
		Optional<String> optional = service.getPassPortNumberWitnOptional(1);
		Assertions.assertTrue(optional.isPresent());
	}

	@Test
	public void test_testOptionalWithNull() {
		Optional<String> optional = Optional.ofNullable(null);
		Assertions.assertFalse(optional.isPresent());
	}
}
