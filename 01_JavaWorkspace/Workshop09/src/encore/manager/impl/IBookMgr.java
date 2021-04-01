package encore.manager.impl;

import java.util.ArrayList;

import encore.exception.ISBNNotFoundException;
import encore.exception.QuantityException;
import encore.vo.Book;

public interface IBookMgr {
	
	public void add(Book b);
	public ArrayList<Book> search();
	public void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException;
	public void buy(String isbn, int quantity) throws ISBNNotFoundException;
	public int getTotalAmount();
	
	
	
	
	
	

}
