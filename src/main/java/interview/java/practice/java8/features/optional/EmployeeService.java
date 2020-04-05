/**
 *
 */
package interview.java.practice.java8.features.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author tgirase
 *
 */
public class EmployeeService {

	private static Map<Integer, Employee> employees = new HashMap<Integer, Employee>();

	static {
		employees.put(1, new Employee(1, "24556565"));
		employees.put(2, new Employee(2, "24556565"));
		employees.put(3, new Employee(3, "24556565"));
		employees.put(4, new Employee(4, "24556565"));
		employees.put(5, new Employee(5, null));
	}

	public String getPassPortNumber(Integer id) {
		return employees.get(id).getPassportNo();
	}

	public Optional<String> getPassPortNumberWitnOptional(Integer id) {
		return Optional.ofNullable(employees.get(id).getPassportNo());
	}

}
