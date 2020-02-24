package interview.java.practice.comparison.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class App {
	public static void main(String[] args) {
		ComparableEmployee e1 = new ComparableEmployee(1, 30000.0);
		ComparableEmployee e2 = new ComparableEmployee(8, 30000.0);
		ComparableEmployee e3 = new ComparableEmployee(4, 30000.0);
		ComparableEmployee e4 = new ComparableEmployee(9, 30000.0);
		ComparableEmployee e5 = new ComparableEmployee(2, 30000.0);
		ArrayList<ComparableEmployee> empList = new ArrayList<ComparableEmployee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		System.out.println("Employee records before sorting " + empList.toString());
		Collections.sort(empList);
		System.out.println("Employee records after sorting by id " + empList.toString());
	}
}
