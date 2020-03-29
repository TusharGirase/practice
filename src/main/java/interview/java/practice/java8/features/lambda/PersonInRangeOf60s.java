package interview.java.practice.java8.features.lambda;

public class PersonInRangeOf60s implements PersonTester {
	public boolean test(Person p) {
		if (p.getAge() >= 50 && p.getAge() <= 60) {
			return true;
		}
		return false;
	}
}
