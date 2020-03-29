package interview.java.practice.arrays.interviewquestions;

/**
 * 
 * @author tgirase
 *
 */
public class MultiplyArrayElements {

	public static void main(String[] args) {
		usingNative();
		usingWrapper();
	}

	public static void usingNative() {
		int[] input = new int[] { 2, 3, 4, 5 };
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			int multiplication = 1;
			for (int j = 0; j < input.length; j++) {
				if (j != i) {
					multiplication = multiplication * input[j];
				}
			}
			output[i] = multiplication;
		}
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

	public static void usingWrapper() {
		Integer[] input = new Integer[] { 2, 3, 4, 5 };
		Integer[] output = new Integer[input.length];
		for (int i = 0; i < input.length; i++) {
			int multiplication = 1;
			for (int j = 0; j < input.length; j++) {
				if (j != i) {
					multiplication = multiplication * input[j];
				}
			}
			output[i] = multiplication;
		}
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

}
