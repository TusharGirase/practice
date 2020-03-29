package interview.java.practice.java8.fetures.defaultstatic;

public class PrivateVehical implements Vehical {

	// you cannot override the static method here
	// @Override
	// public static void produce() NOT ALLOWED

	@Override
	public void run() {
		Vehical.super.run();
	}
}
