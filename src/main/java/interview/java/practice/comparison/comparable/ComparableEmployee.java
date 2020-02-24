package interview.java.practice.comparison.comparable;

import interview.java.practice.comparison.Employee;

public class ComparableEmployee extends Employee implements Comparable<Employee> {

	public ComparableEmployee(int id, Double salary) {
		super(id, salary);
	}

	public int compareTo(Employee o) {
		if (o == null) {
			throw new NullPointerException();
		}

		if (!(o instanceof Employee)) {
			throw new ClassCastException();
		}

		Employee emp1 = (Employee) o;
		return this.getId() - emp1.getId();
	}

}
