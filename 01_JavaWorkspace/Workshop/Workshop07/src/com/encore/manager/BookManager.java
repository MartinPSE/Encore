package com.encore.manager;

import com.encore.vo.Book;

public interface BookManager {
	
	int getNumberOfBooks();
	void insertBook(Book book);
	Book[] getAllBook();
	Book searchBookByIsbn (String isbn);
	Book[] searchBookByTitle (String title);
	Book[] searchBookByPublisher (String publisher);
	Book[] searchBookByPrice (double price);
	double getSumPriceOfBooks();
	 double getAveragePriceOfBooks();
}
