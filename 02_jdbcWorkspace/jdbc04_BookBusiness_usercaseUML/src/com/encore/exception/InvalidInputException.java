package com.encore.exception;

public class InvalidInputException extends Exception{
	
	public InvalidInputException() {
		this("Sorry, Invalid Input ");
	}
	
	public InvalidInputException(String s) {
		super(s);
	}

}
