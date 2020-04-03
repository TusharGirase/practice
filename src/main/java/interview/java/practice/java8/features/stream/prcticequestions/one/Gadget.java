package interview.java.practice.java8.features.stream.prcticequestions.one;

/**
 * Class represents any gadget could be laptop or smartphone or tablet
 * 
 * @author tgirase
 *
 */
public class Gadget {

	private String features;

	String getFeatures() {
		return features;
	}

	void setFeatures(String features) {
		this.features = features;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((features == null) ? 0 : features.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gadget other = (Gadget) obj;
		if (features == null) {
			if (other.features != null)
				return false;
		} else if (!features.equals(other.features))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Gadget [features=" + features + "]";
	}

}
