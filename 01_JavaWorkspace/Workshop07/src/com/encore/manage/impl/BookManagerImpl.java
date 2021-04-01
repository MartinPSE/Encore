package com.encore.manage.impl;


import com.encore.manager.BookManager;
import com.encore.vo.Book;


public class BookManagerImpl implements BookManager {
	

	static private BookManagerImpl manager = new BookManagerImpl(); //1
	
	private BookManagerImpl() {} //2
	
	public static BookManagerImpl getInstance() { //3
		return manager;
	}
	
	
	Book[] books;
	private int numberOfBooks;
	private int idx;
	
	public BookManagerImpl(int numberOfBooks) {
		books = new Book[numberOfBooks];
	}
	

	public int getNumberOfBooks() {
		
		return numberOfBooks;
	}
	
	public void insertBook(Book book) {
		for (int i=0 ; i<books.length;i++) {
			if(books[i] == null) {
				books[i] = book;
				numberOfBooks++;
				break;
			}
		}
		
		
	}
	
	public Book[] getAllBook() {
		Book[] temp = new Book[numberOfBooks];
		idx = 0;
		for (Book bk : books ) {
			if ( bk == null ) continue;
			
			else {
				if(bk.equals(books[idx]))
					temp[idx++] = bk;
			}
		}
		
	
		return temp;
		
	}
	
	public Book searchBookByIsbn (String isbn) {
		Book bk = null;
		for (Book b : books) {
			if ( b == null ) continue;
				if(b.getIsbn().equals(isbn)) {
					bk = b;
			}
			
		} return bk;
	}

	public Book[] searchBookByTitle (String title) {
		int idx = 0;
		Book[] temp = new Book[numberOfBooks];
		for (Book bk : books) {
			if ( bk != null ) {
				if (bk.getTitle().equals(title)) {
					temp[idx++] = bk;
				}
			}
		} 
		return temp;
		
	
	}
	
	public Book[] searchBookByPublisher (String publisher) {
		Book[] temp = new Book[numberOfBooks];
		int idx = 0;
		for ( Book bk : books ) {
			if ( bk != null ) {
				if (bk.getPublisher().equals(publisher)) 
				{
				temp[idx++] = bk;
				} 
			}
		} 
		return temp;

	}
	
	public Book[] searchBookByPrice (double price) {
		Book[] temp = new Book[numberOfBooks];
		idx = 0 ;
		for ( Book bk : books ) {
			if (bk == null) continue;
				if(bk.getPrice() == price) {
					temp[idx++] = bk;
			}
		} return temp;
		
	}
	
	public double getSumPriceOfBooks() {
		double total = 0;
		for ( Book bk : books ) {
			if( bk != null ) total += bk.getPrice();
		}
		
		return total;
	}
	
	public double getAveragePriceOfBooks() {
		return getSumPriceOfBooks() / numberOfBooks;
	}

	
		
	
	
	
	
			
	}


