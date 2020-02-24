package interview.java.practice.principles.solid.d.valid;

/**
 * Here our {@link Windows98Machine} class is not dependent on the
 * instantiation. We are dealing with the abstraction ie {@link Keyboard} and
 * {@link Monitor}.
 * 
 * @author tgirase
 *
 */
public class App {
	public static void main(String[] args) {
		new Windows98Machine(new StandardKeyboard(), new LedMonitor());
		new Windows98Machine(new StandardKeyboard(), new LcdMonitor());
	}
}
