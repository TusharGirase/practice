package interview.java.practice.principles.solid.s.invalid;

/**
 * Class violets single responsibility principle
 * 
 * @author tgirase
 *
 */
public class Book {

	private int id;
	private String author;
	private String text;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Irrelevant method here. Should be done in another class.
	 */
	public void readBook() {
		System.out.println(text);
	}

}
