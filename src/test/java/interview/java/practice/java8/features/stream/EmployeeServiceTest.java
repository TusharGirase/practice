package interview.java.practice.java8.features.stream;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeServiceTest {

	EmployeeService service;

	@BeforeEach
	public void setup() {
		service = new EmployeeService();
	}

	@Test
	public void testMappingExampleGetValidListOfIntegers() {
		Assertions.assertEquals(6, EmployeeService.mappingExample(Arrays.asList("1", "2", "3", "4", "5", "6")).size());
	}

	@Test
	public void testGetAllEmployeeNamesGetAllName() {
		Assertions.assertEquals(6, service.getAllEmployeeNames().size());
	}

	@Test
	public void testGetEmployeeCapabilites() {
		Assertions.assertEquals(18, service.getEmployeeCapabilites().size());
	}

	@Test
	public void testIsAnyEmplyeeWithCapability_ifPresent() {
		Assertions.assertTrue(service.isAnyEmplyeeWithCapability("Java"));
	}

	/**
	 * Tests that we get false if none of the emplyee have capability specified
	 */
	@Test
	public void testIsAnyEmplyeeWithCapability_ifNotPresent() {
		Assertions.assertFalse(service.isAnyEmplyeeWithCapability("VB"));
	}

	/**
	 * Tests that we get false if capability is not found on all employees
	 */
	@Test
	public void testIsAllEmplyeeWithCapability_ifFalse() {
		Assertions.assertFalse(service.isAllEmplyeeWithCapability("Groovy"));
	}

	/**
	 * Tests that we get true if capability is found on all employees
	 */
	@Test
	public void testIsAllEmplyeeWithCapability_ifTrue() {
		Assertions.assertTrue(service.isAllEmplyeeWithCapability("Git"));
	}

	/**
	 * Tests that we get true if capability is found on any employee
	 */
	@Test
	public void testisCapablityNotOnAllEmployees_ifTrue() {
		Assertions.assertTrue(service.isCapablityNotOnAllEmployees("VB"));
	}

	/**
	 * Tests that we get false if capability is found on any employee
	 */
	@Test
	public void testisCapablityNotOnAllEmployees_ifFalse() {
		Assertions.assertFalse(service.isCapablityNotOnAllEmployees("C Sharp"));
	}

	@Test
	public void test_getEmployeeSalarySum_getValidSum() {
		Assertions.assertEquals(183000f, service.getEmployeeSalarySum());
	}

	@Test
	public void test_getMaxEmployeeSalary() {
		Assertions.assertEquals(57000f, service.getMaxEmployeeSalary());
	}

}
