package interview.java.practice.java8.features.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeProg1 {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 2, 2, 3, 6, 12, 2, 1, 1));
		// we want to count distinct elements
		long disctinctEleCount = integers.stream().distinct().count();
		System.out.println("Total disctinct elements are : " + disctinctEleCount);

		// we want to find number 6
		Integer number = null;
		for (Integer integer : integers) {
			if (integer == 6) {
				number = 6;
			}
		}

		integers.stream().anyMatch(intger -> integers.equals(6));

		List<Employee> employeeList = new ArrayList<Employee>();
		Employee r1 = new Employee(1, "Rishi", 1000F);
		Employee r2 = new Employee(1, "Rishi", 1000F);
		employeeList.add(r1);
		employeeList.add(r2);
		System.out.println("Total disctinct elements are : " + employeeList.stream().distinct().count());

		Employee r3 = new Employee(2, "Rishi1", 1000F);
		employeeList.add(r3);

		Employee r4 = new Employee(2, "Rishi1", 1000F);

		boolean found = employeeList.stream().anyMatch(emp -> emp.equals(r4));
	}
}
