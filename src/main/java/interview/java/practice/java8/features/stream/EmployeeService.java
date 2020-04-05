package interview.java.practice.java8.features.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeService {

	private static final List<Employee> empList = new ArrayList<Employee>();

	static {
		empList.add(new Employee(1, "ABC", 9000f, Arrays.asList("Excel", "Word", "C++", "Java", "Git")));
		empList.add(new Employee(2, "DEF", 12000f, Arrays.asList("Word", "C++", "Java", "Git")));
		empList.add(new Employee(3, "HIJ", 57000f, Arrays.asList("Python", "Word", "Git")));
		empList.add(new Employee(4, "KLM", 55000f, Arrays.asList("Groovy", "Java", "Git")));
		empList.add(new Employee(5, "NOP", 16000f, Arrays.asList("Git")));
		empList.add(new Employee(6, "ABC", 34000f, Arrays.asList("C Sharp", "Git")));
	}

	public static List<Integer> mappingExample(List<String> numbersInString) {
		List<Integer> numbersInIntergerType = numbersInString.stream().map(str -> Integer.valueOf(str))
				.collect(Collectors.toList());
		return numbersInIntergerType;
	}

	/**
	 * Use of Map method
	 *
	 * @return
	 */
	public List<String> getAllEmployeeNames() {
		List<String> names = new ArrayList<String>();
		empList.stream().forEach(emp -> names.add(emp.getName()));

		empList.stream().map(new Function<Employee, String>() {
			@Override
			public String apply(Employee emp) {
				return emp.getName();
			}
		}).collect(Collectors.toList());

		empList.stream().map(emp -> emp.getName()).collect(Collectors.toList());

		return empList.stream().map(Employee::getName).collect(Collectors.toList());
	}

	/**
	 * When you have list of list object
	 *
	 * @return
	 */
	public List<String> getEmployeeCapabilites() {
		return empList.stream().flatMap(emp -> emp.getCapabilities().stream()).collect(Collectors.toList());
	}

	/**
	 * This method return true if we have {@link Employee} having capability
	 * specified
	 *
	 * @return
	 */
	public boolean isAnyEmplyeeWithCapability(String capability) {
		return getEmployeeCapabilites().stream().anyMatch(empCapability -> empCapability.equalsIgnoreCase(capability));
	}

	/**
	 * All match returns true if all the instances satisfy the {@link Predicate}
	 *
	 * @param capability
	 * @return
	 */
	public boolean isAllEmplyeeWithCapability(String capability) {
		List<String> employeeCapabilities = new ArrayList<>();
		empList.forEach(emp -> employeeCapabilities.add(emp.getCapabilities().toString()));
		return employeeCapabilities.stream().allMatch(cap -> cap.contains(capability));
	}

	/**
	 * Check capability not found on any {@link Employee}
	 *
	 * @param capability
	 * @return
	 */
	public boolean isCapablityNotOnAllEmployees(String capability) {
		List<String> employeeCapabilities = new ArrayList<>();
		empList.forEach(emp -> employeeCapabilities.add(emp.getCapabilities().toString()));
		return employeeCapabilities.stream().noneMatch(cap -> cap.contains(capability));
	}

	/**
	 * Gets sum of all emplyees salary
	 *
	 * @return
	 */
	public Float getEmployeeSalarySum() {
		List<Float> employeeSalaries = new ArrayList<>();
		empList.forEach(emp -> employeeSalaries.add(emp.getSalary()));
		employeeSalaries.stream().reduce(0f, Float::sum);
		return employeeSalaries.stream().reduce(0f, (totalSal, curSal) -> totalSal + curSal);
	}

	public Float getMaxEmployeeSalary() {
		List<Float> employeeSalaries = new ArrayList<>();
		empList.forEach(emp -> employeeSalaries.add(emp.getSalary()));
		employeeSalaries.stream().reduce(0f, (max, curVal) -> max > curVal ? max : curVal);
		return employeeSalaries.stream().reduce(0f, Float::max);
	}

}
