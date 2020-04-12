package interview.java.practice.comparison.comparable;

import interview.java.practice.comparison.Employee;

public class ComparableEmployee extends Employee implements Comparable<Employee> {

	public ComparableEmployee(int id, Double salary) {
		super(id, salary);
	}

	@Override
	public int compareTo(Employee emp) {
		if (emp == null) {
			throw new NullPointerException();
		}

		Employee emp1 = emp;
		return this.getId() - emp1.getId();
	}

}
