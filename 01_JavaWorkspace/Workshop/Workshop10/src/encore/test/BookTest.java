package encore.test;



import java.util.ArrayList;

import encore.exception.ISBNNotFoundException;
import encore.exception.QuantityException;
import encore.manager.BookMgrImpl;
import encore.vo.Book;
import encore.vo.Magazine;




public class BookTest {
	public static void main(String[] args) {
		BookMgrImpl mgr = BookMgrImpl.getInstance();
		
		
		mgr.add(new Book("21424", "Java Pro",15000,5));
		mgr.add(new Book("35355","분석설계",30000,3));
		mgr.add(new Book("35895","화학분석",28000,7));
		mgr.add(new Magazine("35535", "Java World", 23000,0,2));
		mgr.add(new Magazine("66541", "Python",25000,3,3));
		mgr.add(new Magazine("77833", "JavaScript",13000,5,4));
		mgr.add(new Magazine("92020", "HTML/CSS",17000,2,7));
		mgr.add(new Magazine("18840", "Spring",15000,1,7));
		
	
		
		System.out.println("\n===========전체 도서 정보 출력 기능===========\n");
		ArrayList<Book> books = (ArrayList<Book>)mgr.search();
		for(Book book:books) {
			System.out.println(book);
		}
		
		System.out.println("\n===========도서가 판매되어 재고 수량을 빼는 기능===========\n");
		try {
			mgr.sell("2599595", 6);			
		}catch(QuantityException e) {
			System.out.println(e.getMessage());
		}catch(ISBNNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		books = (ArrayList<Book>)mgr.search();
		for(Book book:books) {
			System.out.println(book);
		}
		
		System.out.println("\n===========도서가 구매되어 재고 수량을 더하는 기능===========\n");
		try {
			mgr.buy("21424", 3);			
		}catch(ISBNNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		books = (ArrayList<Book>)mgr.search();
		for(Book book:books) {
			System.out.println(book);
		}
		
		System.out.println("\n===========재고 도서들의 수량*금액을 하여 총 재고 금액을 리턴===========");
		System.out.format("모든 책의 총 재고 금액은 :: %d\n", mgr.getTotalAmount());
		
	
		
		System.out.println("**********************************************");
		BookMgrImpl mgr2 = BookMgrImpl.getInstance();
		System.out.println("===========전체 도서 정보 출력 기능===========");
		ArrayList<Book> books1 = (ArrayList<Book>)mgr2.search();
		for(Book book:books1) {
			System.out.println(book);
		}
		
		mgr.close();
		
		mgr.send();
		
		
		
		
	}
	
	
}
