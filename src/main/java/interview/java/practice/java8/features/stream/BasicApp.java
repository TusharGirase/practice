package interview.java.practice.java8.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BasicApp {
	public static void main(String[] args) {

		List<Integer> integersList = new ArrayList<>();
		for (int i = 0; i < 100; i++)
			integersList.add(i);

		for (Integer integer : integersList) {
			if (integer > 90) {
				System.out.println(integer);
			}
		}
		
		printNumbers(integersList, (t) -> t > 90);

		integersList.stream().filter((integ) -> integ > 90).filter(integ -> integ % 2 == 0)
				.forEach(integ -> System.out.println(integ));
	}

	public static void printNumbers(List<Integer> list, Predicate<Integer> predicate) {
		for (Integer integ : list) {
			if (predicate.test(integ)) {
				System.out.println(integ);
			}
		}
	}
}
