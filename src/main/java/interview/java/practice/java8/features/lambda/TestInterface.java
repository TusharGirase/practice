package interview.java.practice.java8.features.lambda;

@FunctionalInterface
public interface TestInterface {

	public void test(Integer i);

	public default void test2(String s) {
		System.out.println(s);
	}

	public static void test3(String s) {
		System.out.println(s);
	}

}
