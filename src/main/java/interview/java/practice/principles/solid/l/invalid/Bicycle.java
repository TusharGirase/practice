package interview.java.practice.principles.solid.l.invalid;

/**
 * Bicycle is a transportation device, however, it does not have an engine and
 * hence, the method startEngine() cannot be implemented.
 * 
 * @author tgirase
 *
 */
public class Bicycle implements TransportationDevice {

	public void startEngine() {
		// Bicycle doesn't have engine
	}

}
