package org.srysoft.javafeatures.service;

import java.util.ArrayList;
import java.util.List;

import org.srysoft.javafeatures.bean.Book;

public class BookDAO {

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();

		books.add(new Book(101, "Core Java", 400));
		books.add(new Book(101, "Angular", 300));
		books.add(new Book(101, "Hibernate", 150));
		books.add(new Book(101, "Spring Boot", 450));
		books.add(new Book(101, "JPA", 300));

		return books;
	}

}
