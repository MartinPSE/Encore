package com.encore.manage.impl;


import java.util.ArrayList;

import com.encore.manager.BookMgr;
import com.encore.vo.Book;
import com.encore.vo.Magazine;


public class BookMgrImpl implements BookMgr {
	
	ArrayList<Book> list = new ArrayList<Book>();
	

	private static BookMgrImpl manager = new BookMgrImpl(); //1
	
	private BookMgrImpl() {
		list = new ArrayList<Book>();
	} //2
	
	public static BookMgrImpl getInstance() { //3
		return manager;
	}

	@Override
	public void addBook(Book book) {
		boolean find = false;
		for( Book b : list) {
			if(b.getIsbn().equals(book.getIsbn())) {
				System.out.println(book.getTitle()+"은 이미 존재하는 책입니다.");
				find = true;
				break;
			}
		}
		if ( find == false) {
			list.add(book);
			System.out.println(book.getTitle()+"이(가) 정상적으로 추가되었습니다.");
		}
		
	}

	@Override
	public ArrayList<Book> getAllBook() {
		ArrayList<Book> temp = new ArrayList<Book>();
		for (Book b : list) {
			temp.add(b);
			}
		return temp;
	}
	

	@Override
	public Book searchBookByIsbn(String isbn) {
		Book bk = new Book();
		for(Book bk1 : list) {
			if (bk1.getIsbn().equals(isbn))
				bk = bk1; 
				
		} 
		return bk;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> temp = new ArrayList<Book>();
		for (Book bk : list) {
			if (bk.getTitle().equals(title)) {
				temp.add(bk);
			}
		}
		
		
		return temp;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> temp = new ArrayList<Book>();
		for ( Book bk : list ) {
			if (bk instanceof Magazine) continue; // KeyPoint!
			else temp.add(bk);
		}
		return temp;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> temp = new ArrayList<Book>();
		for ( Book bk : list) {
			if (bk instanceof Book) continue;
			else temp.add(bk);
		} 
		
		return temp;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> temp = new ArrayList<Book>();
		for ( Book bk : list ) {
			if ( bk instanceof Magazine) {
				if (((Magazine) bk).getYear()== year) {
					temp.add(bk);
				}
			}
				
		}
		
		return temp;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		ArrayList<Book> temp = new ArrayList<Book>();
		for( Book bk : list) {
			if(bk.getPublisher().equals(publisher)) {
				temp.add(bk);
			}
			
		} 
		
		return temp;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> temp = new ArrayList<Book>();
		for ( Book bk : list) {
			if(bk.getPrice() < price) {
				temp.add(bk);
			}
		}
		
		return temp;
	}

	@Override
	public int getTotalPrice() {
		int total = 0;
		for ( Book bk : list ) {
			total += bk.getPrice();
		} 
		
		return total;
	}

	@Override
	public int getAvgPrice() {
		int avg = getTotalPrice()/list.size();
		return avg;
	}

	
	
			
	}


