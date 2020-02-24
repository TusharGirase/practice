package interview.java.practice.principles.solid.d.valid;

public class Windows98Machine {
	private final Keyboard keyboard;
	private final Monitor monitor;

	public Windows98Machine(Keyboard keyboard, Monitor monitor) {
		this.keyboard = keyboard;
		this.monitor = monitor;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public Monitor getMonitor() {
		return monitor;
	}

}
