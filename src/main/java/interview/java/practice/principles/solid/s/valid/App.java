package interview.java.practice.principles.solid.s.valid;

/**
 * In this example for Single responsibility principle. If we want to change the
 * way book is getting printed on console. We will have to change
 * {@link ConsoleBookPrinter} class and not {@link Book} as the responsibility
 * of printing on console is of {@link ConsoleBookPrinter}
 * 
 * @author tgirase
 *
 */
public class App {
	public static void main(String[] args) {
		Book book = new Book();
		book.setAuthor("John Doe");
		book.setId(1);
		book.setText("This is the text from Book.");

		// lets print book on console
		BookPrinter printer = new ConsoleBookPrinter();
		printer.print(book);
	}
}
