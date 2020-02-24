package interview.java.practice.comparison.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interview.java.practice.comparison.Employee;

public class App {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, 30000.0);
		Employee e2 = new Employee(8, 30000.0);
		Employee e3 = new Employee(4, 30000.0);
		Employee e4 = new Employee(9, 30000.0);
		Employee e5 = new Employee(2, 30000.0);
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		System.out.println("Employee records before sorting " + empList.toString());
		Collections.sort(empList, new EmployeeIdComparator());
		System.out.println("Employee records after sorting by id " + empList.toString());
	}
}
