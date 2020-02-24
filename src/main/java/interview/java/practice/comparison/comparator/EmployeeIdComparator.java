package interview.java.practice.comparison.comparator;

import java.util.Comparator;

import interview.java.practice.comparison.Employee;

public class EmployeeIdComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		if (o1 == null || o2 == null) {
			throw new NullPointerException();
		}

		if (!(o1 instanceof Employee) || !(o2 instanceof Employee)) {
			throw new ClassCastException();
		}

		Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;
		return emp1.getId() - emp2.getId();
	}

}
