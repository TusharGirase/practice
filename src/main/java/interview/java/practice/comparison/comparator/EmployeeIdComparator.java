package interview.java.practice.comparison.comparator;

import java.util.Comparator;

import interview.java.practice.comparison.Employee;

public class EmployeeIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if (emp1 == null || emp2 == null) {
			throw new NullPointerException();
		}
		return emp1.getId() - emp2.getId();
	}

}
