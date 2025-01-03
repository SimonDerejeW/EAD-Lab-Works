package books;

public class LombokTest {
	public void main(String[] args) {
		Book book = new Book();
		book.setTitle("Test Title");
		String title = book.getTitle();
		System.out.println(title);
	}
}
