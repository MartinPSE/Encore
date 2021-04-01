package com.encore.vo;

public class Novel extends Book{
	
	public Novel(String isbn, String title, String author, String publisher, double price, String desc) {
		super(isbn, title, author , publisher, price, desc);
	}

	@Override
	public String toString() {
		return super.toString();
	
	}
}
