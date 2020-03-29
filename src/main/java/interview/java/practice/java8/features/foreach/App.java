package interview.java.practice.java8.features.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * You want to increase salary by 1000 for all emplyees
 * 
 * @author tgirase
 *
 */
public class App {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(1, 5000F));
		employeeList.add(new Employee(1, 6000F));
		employeeList.add(new Employee(1, 7000F));
		employeeList.add(new Employee(1, 8000F));

		Iterator<Employee> itr = employeeList.iterator();
		while (itr.hasNext()) {
			Employee tempEmp = itr.next();
			tempEmp.setSalary(tempEmp.getSalary() + 1000);
		}

		itr = employeeList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getSalary());
		}

		// now solve the problem using functional interface without lambda
		employeeList.forEach(new Consumer<Employee>() {
			@Override
			public void accept(Employee emp) {
				emp.setSalary(emp.getSalary() + 1000);
			}
		});
		employeeList.forEach(new Consumer<Employee>() {
			@Override
			public void accept(Employee emp) {
				System.out.println(emp.getSalary());
			}
		});

		// with lambda
		employeeList.forEach((emp) -> emp.setSalary(emp.getSalary() + 1000));
		employeeList.forEach((emp) -> System.out.println(emp.getSalary()));

		// an alternative to traverse a list to do the above job
		for (Employee emp : employeeList) {
			emp.setSalary(emp.getSalary() + 1000);
		}

		for (Employee emp : employeeList) {
			System.out.println(emp.getSalary());
		}

	}
}
