package functional_streams;

import java.util.ArrayList;

public class Library {

	public static void main(String[] args) {
		ArrayList<Book> books = populateLib();
		books.stream().filter(book -> {
			return book.getAuthor().startsWith("a");
		}).filter(book -> {
			return book.getTitle().startsWith("b");
		}).forEach(System.out::println);
		
	}
	
	static ArrayList<Book> populateLib() {
		ArrayList<Book> books = new ArrayList();
		books.add(new Book("bookName", "authorName"));
		books.add(new Book("book1", "author1"));
		books.add(new Book("book2", "author2"));
		books.add(new Book("author1", "bookname"));
		books.add(new Book("cuthor1", "bookname2"));
		return books;
		
	}
}
