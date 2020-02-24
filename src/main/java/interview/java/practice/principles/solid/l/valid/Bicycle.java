package interview.java.practice.principles.solid.l.valid;

/**
 * Bicycle is a transportation device, however, it does not have an engine and
 * hence, the method startEngine() cannot be implemented.
 * 
 * @author tgirase
 *
 */
public class Bicycle implements DevicesWithoutEngine {

	public void getSpeed() {
		startMoving();
	}

	public void startMoving() {
		System.out.println("Moving by paddeling");
	}

}
