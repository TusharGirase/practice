package interview.java.practice.java8.fetures.defaultstatic;

public interface Vehical {
	public static void produce() {
		System.out.println("This will produce things.");
	}

	public default void run() {
		System.out.println("Default Vehical is running");
	}
}
