package interview.java.practice.java8.features.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

	public static List<Integer> mappingExample(List<String> numbersInString) {

		// we want to convert these objects into integers
		List<Integer> numbersInIntergerType = numbersInString.stream().map(str -> Integer.valueOf(str))
				.collect(Collectors.toList());

		return numbersInIntergerType;
	}

}
