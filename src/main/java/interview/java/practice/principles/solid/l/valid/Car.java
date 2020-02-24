package interview.java.practice.principles.solid.l.valid;

/**
 * Here we are violating the Liskov Principle. We have {@link DieselCar}
 * implementation to start the engine. What if there will be an
 * {@link ElectricalCar} it doesn't have engine it has motor to start. Another
 * example could be a possibility that car may not have key it may start with
 * button and if you write a method as startWithKey then what about key-less
 * cars
 * 
 * @author tgirase
 *
 */
public class Car implements DevicesWithEngine {

	public void startEngine() {
		System.out.println("Engine started.");
	}

	public void getSpeed() {
		startEngine();
		System.out.println("Moving by acceleration.");
	}

}
