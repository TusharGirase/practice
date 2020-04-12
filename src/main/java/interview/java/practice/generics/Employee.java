package interview.java.practice.generics;

public class Employee {

	private int Id;

	private Double salary;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee(int id, Double salary) {
		super();
		Id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", salary=" + salary + "]";
	}

}
