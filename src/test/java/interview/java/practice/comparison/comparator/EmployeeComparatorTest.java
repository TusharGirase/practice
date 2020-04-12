package interview.java.practice.comparison.comparator;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import interview.java.practice.comparison.Employee;

public class EmployeeComparatorTest {

	/**
	 * Tests ID comparator
	 */
	@Test
	public void testCollectionGetsSorted() {
		Employee e1 = new Employee(9, 30000.0);
		Employee e2 = new Employee(8, 30000.0);
		Employee e3 = new Employee(4, 30000.0);
		Employee e4 = new Employee(1, 30000.0);
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

		Assertions.assertEquals(9, empList.get(0).getId());
		Assertions.assertEquals(8, empList.get(1).getId());
		Assertions.assertEquals(4, empList.get(2).getId());
		Assertions.assertEquals(1, empList.get(3).getId());

		empList.sort(new EmployeeIdComparator());
		// sCollections.sort(empList, new EmployeeIdComparator());
		Assertions.assertEquals(1, empList.get(0).getId());
		Assertions.assertEquals(4, empList.get(1).getId());
		Assertions.assertEquals(8, empList.get(2).getId());
		Assertions.assertEquals(9, empList.get(3).getId());

	}

	/**
	 * Tests Salary comparator
	 */
	@Test
	public void testCollectionGetsSortedBySalary() {
		Employee e1 = new Employee(9, 9000.0);
		Employee e2 = new Employee(8, 8000.0);
		Employee e3 = new Employee(4, 7000.0);
		Employee e4 = new Employee(1, 6000.0);
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

		Assertions.assertEquals(9000.0, empList.get(0).getSalary());
		Assertions.assertEquals(8000.0, empList.get(1).getSalary());
		Assertions.assertEquals(7000.0, empList.get(2).getSalary());
		Assertions.assertEquals(6000.0, empList.get(3).getSalary());

		empList.sort(new EmployeeSalaryComparator());
		Assertions.assertEquals(6000.0, empList.get(0).getSalary());
		Assertions.assertEquals(7000.0, empList.get(1).getSalary());
		Assertions.assertEquals(8000.0, empList.get(2).getSalary());
		Assertions.assertEquals(9000.0, empList.get(3).getSalary());

	}

}
