package com.encore.exception;

public class DuplicateISBNException extends Exception {
	
	public DuplicateISBNException() {
		this("Sorry, That ISBN is duplicated.");
		
	}
	
	public DuplicateISBNException(String s) {
		super(s);
		
	}

}
