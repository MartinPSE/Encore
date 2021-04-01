package com.encore.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.encore.exception.BookNOTFoundException;
import com.encore.exception.DuplicateISBNException;
import com.encore.exception.InvalidInputException;
import com.encore.vo.Book;

public interface BookDAO {
	
	void registerBook(Book vo) throws SQLException, DuplicateISBNException;
	void deleteBook(String isbn) throws SQLException, BookNOTFoundException; 
	Book findByIsbn(String isbn) throws SQLException;
	ArrayList<Book> findByWriter(String writer) throws SQLException;
	ArrayList<Book> findByPublisher(String publisher) throws SQLException;
	
	
	// 가격에 대한 검색
	ArrayList<Book> findByPrice(int min, int max) throws SQLException, InvalidInputException; // InvalidInputException
	void discountBook(int per, String publisher) throws SQLException;
	void printAllInfo() throws SQLException;
	
	
	
	
	
	
	

}
