package interview.java.practice.principles.solid.l.valid;

public class App {
	public static void main(String[] args) {
		TransportationDevice device1 = new Car();
		TransportationDevice device2 = new Bicycle();
		device1.getSpeed();
		device2.getSpeed();
	}
}
