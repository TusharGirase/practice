package interview.java.practice.java8.features.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class App {
	public static void main(String[] args) {
		Person p1 = new Person("john", Person.Sex.MALE, "abc@abc.com", 65);
		Person p2 = new Person("smith", Person.Sex.MALE, "dgh@abc.com", 45);
		Person p3 = new Person("jim", Person.Sex.MALE, "jim@abc.com", 70);
		Person p4 = new Person("alex", Person.Sex.MALE, "ret@abc.com", 30);
		Person p5 = new Person("tom", Person.Sex.MALE, "fdsg@abc.com", 55);

		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);

		printPersonOlderThan(persons, 50);
		printPersonInRange(persons, 50, 60);
		printPersonInRange(persons, new PersonInRangeOf60s());

		printPersonDetail(persons, new PersonTester() {
			@Override
			public boolean test(Person tt) {
				return tt.getName().equalsIgnoreCase("smith") ? true : false;
			}
		});

		printPersonDetail(persons, (Person p) -> {
			return p.getName().equalsIgnoreCase("smith") ? true : false;
		});

		printPersonDetailUsingPredicate(persons, (q) -> {
			return q.getName().equalsIgnoreCase("smith") ? true : false;
		});

		// lets say we want to delete email from person object if his name is smith
		performOperation(persons, (q) -> {
			return q.getName().equalsIgnoreCase("smith") ? true : false;
		}, (p) -> {
			p.setEmailAddress("");
		});

		persons.forEach((p) -> {
			if (p.getName().equalsIgnoreCase("smith")) {
				p.setEmailAddress("");
			}
		});

		// TestInterface static method can be accessed directly no error
		dummy((v) -> {
			System.out.println(v);
		});
	}

	public static void dummy(TestInterface inf) {
		inf.test(1);
		inf.test2("ddd");
		TestInterface.test3("sdf");
	}

	private static void printPersonDetail(List<Person> persons, PersonTester personTester) {
		for (Person person : persons) {
			if (personTester.test(person)) {
				System.out.println(person);
			}
		}
	}

	private static void printPersonDetailUsingPredicate(List<Person> persons, Predicate<Person> personTester) {
		for (Person person : persons) {
			if (personTester.test(person)) {
				System.out.println(person);
			}
		}
	}

	private static void performOperation(List<Person> persons, Predicate<Person> personTester,
			Consumer<Person> consumer) {
		for (Person person : persons) {
			if (personTester.test(person)) {
				consumer.accept(person);
				System.out.println(person);
			}
		}
	}

	public static void printPersonOlderThan(List<Person> persons, int age) {
		for (Person person : persons) {
			if (person.getAge() > age) {
				System.out.println(person.getName());
			}
		}
	}

	public static void printPersonInRange(List<Person> persons, int minAge, int maxAge) {
		System.out.println("People between age " + minAge + " and " + maxAge);
		for (Person person : persons) {
			if (person.getAge() >= minAge && person.getAge() <= maxAge) {
				System.out.println(person.getName());
			}
		}
	}

	public static void printPersonInRange(List<Person> persons, PersonTester tester) {
		System.out.println("People in 60's");
		for (Person person : persons) {
			if (tester.test(person)) {
				System.out.println(person.getName());
			}
		}
	}

}
