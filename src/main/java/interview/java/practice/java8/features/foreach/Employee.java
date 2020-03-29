package interview.java.practice.java8.features.foreach;

public class Employee {

	private Integer employeeId;

	private Float salary;

	public Employee(Integer employeeId, Float salary) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

}
