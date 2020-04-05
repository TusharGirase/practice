/**
 *
 */
package interview.java.practice.java8.features.methodreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
	public void test_hasPassport_ifHavePassport() {
		Employee emp1 = new Employee(1, "464656565");
		Employee emp2 = new Employee(3, "464656565");
		Employee emp3 = new Employee(2, "464656565");
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		// below call can be done using static method reference
		Assertions.assertTrue(employees.stream().anyMatch(emp -> service.hasPassport(emp)));
		Assertions.assertTrue(employees.stream().anyMatch(new Predicate<Employee>() {
			@Override
			public boolean test(Employee emp) {
				return service.hasPassport(emp);
			};

		}));
		Assertions.assertTrue(employees.stream().anyMatch(EmployeeService::hasPassport));
	}

	/**
	 * Tests that we can use static method reference
	 */
	@Test
	public void test_hasPassport_ifDoesntHavePassport() {
		Employee emp1 = new Employee(1, null);
		Employee emp2 = new Employee(3, null);
		Employee emp3 = new Employee(2, null);
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		Assertions.assertFalse(employees.stream().anyMatch(emp -> service.hasPassport(emp)));
		Assertions.assertFalse(employees.stream().anyMatch(EmployeeService::hasPassport));
	}

	/**
	 * Tests that we can use Instance Method of an Object of a Particular Type
	 */
	@Test
	public void test_() {
		Employee emp1 = new Employee(1, "464656565");
		Employee emp2 = new Employee(3, "345354345");
		Employee emp3 = new Employee(2, "634534534");
		Employee emp4 = new Employee(4, null);
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		Assertions.assertEquals(3,
				employees.stream().filter(Employee::hasValidPassport).map(Employee::getPassportNo).count());
	}

}
