package com.encore.exception;

public class BookNOTFoundException extends Exception {

	public BookNOTFoundException() {
		this("Sorry, We Can't find the book ");
	}
	
	public BookNOTFoundException(String s){
		super(s);
		
	}
	
	

}
