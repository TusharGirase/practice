/**
 *
 */
package interview.java.practice.java8.features.methodreferences;

/**
 * @author tgirase
 *
 */
public class Employee {

	private Integer id;

	private String passportNo;

	/**
	 * @param id
	 * @param hasPassport
	 */
	public Employee(Integer id, String passportNo) {
		super();
		this.id = id;
		this.passportNo = passportNo;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the passportNo
	 */
	public String getPassportNo() {
		return passportNo;
	}

	/**
	 * @param passportNo the passportNo to set
	 */
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public boolean hasValidPassport() {
		return getPassportNo() == null ? false : true;
	}

}
