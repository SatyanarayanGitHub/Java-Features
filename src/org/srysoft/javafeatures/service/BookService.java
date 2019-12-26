package org.srysoft.javafeatures.service;

import java.util.List;

import org.srysoft.javafeatures.bean.Book;

public class BookService {
	
	public List<Book> getBooksinSort(){
		List<Book> books = new BookDAO().getBooks();
		
		
		
		return books;
	}

}
