package interview.java.practice.java8.features.lambda;

public class Person {

	public enum Sex {
		MALE, FEMALE
	}

	public Person(String name, Sex gender, String emailAddress, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.emailAddress = emailAddress;
		this.age = age;
	}

	private String name;
	private Sex gender;
	private String emailAddress;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", emailAddress=" + emailAddress + ", age=" + age + "]";
	}

}
