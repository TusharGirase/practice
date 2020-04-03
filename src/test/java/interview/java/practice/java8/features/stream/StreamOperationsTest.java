package interview.java.practice.java8.features.stream;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StreamOperationsTest {

	@Test
	public void testMappingExampleGetValidListOfIntegers() {
		Assertions.assertEquals(6, StreamOperations.mappingExample(Arrays.asList("1", "2", "3", "4", "5", "6")).size());
	}

}
