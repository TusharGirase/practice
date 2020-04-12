package interview.java.practice.comparison.comparator;

import java.util.Comparator;

import interview.java.practice.comparison.Employee;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if (emp1 == null || emp2 == null) {
			throw new NullPointerException();
		}
		return (int) (emp1.getSalary() - emp2.getSalary());
	}

}
