package org.srysoft.javafeatures.book;

import java.util.List;

import org.srysoft.javafeatures.bean.Book;

public class BookService {
	
	public List<Book> getBooksinSort(){
		List<Book> books = new BookDAO().getBooks();
		
		
		
		return books;
	}

}
