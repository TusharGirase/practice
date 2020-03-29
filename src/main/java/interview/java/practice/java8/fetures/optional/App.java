package interview.java.practice.java8.fetures.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class App {

	private Optional<Vehical> getVehical_Empty() {
		return Optional.empty();
	}

	private Optional<Vehical> getVehical_nonEmpty() {
		Vehical v = new Vehical();
		return Optional.ofNullable(v);
	}

	public static void main(String[] args) {
		App app = new App();
		System.out.println(app.getVehical_Empty().isPresent() ? "Got the car" : "No Car found");
		System.out.println(app.getVehical_nonEmpty().isPresent() ? "Got the car" : "No Car found");
		Vehical v = app.getVehical_Empty().orElseGet(() -> new Vehical());

		Vehical v2 = app.getVehical_Empty().orElseGet(new Supplier<Vehical>() {
			@Override
			public Vehical get() {
				return new Vehical();
			}
		});

		System.out.println(v == null ? "No vehical" : "found it");
	}
}
