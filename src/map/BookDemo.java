package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BookDemo {

	public static void main(String[] args) {
		
		// Creating maps of Books
		Map<Integer, Book> map2 = new HashMap<Integer, Book>();

		// Creating Books
		Book b1 = new Book(1, "Let us C", "Nootan", "Yashwant", 2);
		Book b2 = new Book(2, "Java", "Oracle", "Gibson", 4);

		// Adding Books to Map
		map2.put(1, b1);
		map2.put(2, b2);

		// Transversing MAp

		for (Entry<Integer, Book> z : map2.entrySet()) {

			int insert = z.getKey();
			System.out.println(insert + " Details");

			System.out.println(z.getValue().id + " " + z.getValue().name + " " + z.getValue().Author + " "
					+ z.getValue().publisher + " " + z.getValue().quantity);

		}

	}

}

class Book {

	int id, quantity;
	String name, Author, publisher;

	public Book(int id, String name, String Author, String publisher, int quantity) {

		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.Author = Author;
		this.quantity = quantity;

	}
}