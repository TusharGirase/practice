package interview.java.practice.principles.solid.i.invalid;

/**
 * Here {@link PlasticDuck} can't fly or eat. But using this interface we are
 * forcing {@link PlasticDuck} to eat and fly.
 * 
 * @author tgirase
 *
 */
public interface Duck {
	public void quack();

	public void fly();

	public void eat();
}
