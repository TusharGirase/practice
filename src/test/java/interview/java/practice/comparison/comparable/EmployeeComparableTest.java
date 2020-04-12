package interview.java.practice.comparison.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeComparableTest {

	/**
	 * Tests ID comparator
	 */
	@Test
	public void testCollectionGetsSorted() {
		ComparableEmployee e1 = new ComparableEmployee(9, 30000.0);
		ComparableEmployee e2 = new ComparableEmployee(8, 30000.0);
		ComparableEmployee e3 = new ComparableEmployee(4, 30000.0);
		ComparableEmployee e4 = new ComparableEmployee(1, 30000.0);

		List<ComparableEmployee> empList = new ArrayList<ComparableEmployee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

		Assertions.assertEquals(9, empList.get(0).getId());
		Assertions.assertEquals(8, empList.get(1).getId());
		Assertions.assertEquals(4, empList.get(2).getId());
		Assertions.assertEquals(1, empList.get(3).getId());

		Collections.sort(empList);

		Assertions.assertEquals(1, empList.get(0).getId());
		Assertions.assertEquals(4, empList.get(1).getId());
		Assertions.assertEquals(8, empList.get(2).getId());
		Assertions.assertEquals(9, empList.get(3).getId());

	}

}
