/**
 *
 */
package interview.java.practice.java8.features.methodreferences;

/**
 * @author tgirase
 *
 */
public class EmployeeService {

	public static boolean hasPassport(Employee emp) {
		return emp.getPassportNo() == null ? false : true;
	}

}
