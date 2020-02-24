package interview.java.practice.principles.solid.d.invalid;

public class Windows98Machine {
	private final StandardKeyboard keyboard;
	private final Monitor monitor;

	public Windows98Machine() {
		monitor = new Monitor();
		keyboard = new StandardKeyboard();
	}

	public StandardKeyboard getKeyboard() {
		return keyboard;
	}

	public Monitor getMonitor() {
		return monitor;
	}

}
