package interview.java.practice.overriding;

public class C extends B {

	/**
	 * You can increase the scope but cannot reduce it.
	 */
	@Override
	public void protectedFoo() {
		// TODO Auto-generated method stub
		super.protectedFoo();
	}

	// invalid reducing scope is not allowed
	// private void protectedFoo() {}

}
