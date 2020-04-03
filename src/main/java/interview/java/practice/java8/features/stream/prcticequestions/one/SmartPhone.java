package interview.java.practice.java8.features.stream.prcticequestions.one;

public class SmartPhone extends Product {

	private Float screenSize;

	private String processor;

	private String screenType;

	private String modelNo;

	Float getScreenSize() {
		return screenSize;
	}

	void setScreenSize(Float screenSize) {
		this.screenSize = screenSize;
	}

	String getProcessor() {
		return processor;
	}

	void setProcessor(String processor) {
		this.processor = processor;
	}

	String getScreenType() {
		return screenType;
	}

	void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	String getModelNo() {
		return modelNo;
	}

	void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public SmartPhone(Integer id, Seller seller, Float price, Float screenSize, String processor, String screenType,
			String modelNo) {
		super(id, seller, price);
		this.screenSize = screenSize;
		this.processor = processor;
		this.screenType = screenType;
		this.modelNo = modelNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((modelNo == null) ? 0 : modelNo.hashCode());
		result = prime * result + ((processor == null) ? 0 : processor.hashCode());
		result = prime * result + ((screenSize == null) ? 0 : screenSize.hashCode());
		result = prime * result + ((screenType == null) ? 0 : screenType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SmartPhone other = (SmartPhone) obj;
		if (modelNo == null) {
			if (other.modelNo != null)
				return false;
		} else if (!modelNo.equals(other.modelNo))
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		if (screenSize == null) {
			if (other.screenSize != null)
				return false;
		} else if (!screenSize.equals(other.screenSize))
			return false;
		if (screenType == null) {
			if (other.screenType != null)
				return false;
		} else if (!screenType.equals(other.screenType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SmartPhone [getScreenSize()=" + getScreenSize() + ", getProcessor()=" + getProcessor()
				+ ", getScreenType()=" + getScreenType() + ", getModelNo()=" + getModelNo() + ", hashCode()="
				+ hashCode() + ", getId()=" + getId() + ", getSeller()=" + getSeller() + ", getPrice()=" + getPrice()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

}
