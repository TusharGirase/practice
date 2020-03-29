package interview.java.practice.java8.fetures.defaultstatic;

public class App {

	public static void main(String[] args) {
		// call static metehod from interface
		Vehical.produce();
		Vehical car = new PrivateVehical();
		car.run();

		Vehical scaniaTruck = new ScaniaTruck();
		scaniaTruck.run();

		// you cannot directly call default methods
		// Vehical.run();
	}

}
