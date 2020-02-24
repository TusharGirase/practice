package interview.java.practice.principles.solid.s.valid;

public class ConsoleBookPrinter implements BookPrinter {

	public void print(Book book) {
		System.out.println(book.getText());
	}
}
