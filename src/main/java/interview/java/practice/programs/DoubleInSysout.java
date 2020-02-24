package interview.java.practice.programs;

public class DoubleInSysout {
	public static void main(String[] args) {
		// deviding float or double by zero doesn't throw an ArithmaticException
		System.out.println(0.0 / 0.0);
		// below code returns false
		System.out.println(0.0 / 0.0 == 0.0 / 0.0);

		int a = 0;
		double b = 6.199;
		// below line returns infinity
		System.out.println((b / a));

		Object result = 1 / 5.5;
		// below will be double
		System.out.println(result.getClass().getName());
		result = 5.5 / 1;
		// as one of the argument is double output will be double
		System.out.println(result.getClass().getName());


		result = 5 / 2;
		// Integer
		System.out.println(result.getClass().getName());

		// below line causes ArithmaticException
		System.out.println(1 / 0);

	}
}
