package com.encore.test;

import com.encore.manage.BookManager;
import com.encore.vo.Book;
import com.encore.vo.Magazine;
import java.util.Scanner;

public class BookTest {
	
	

	public static void main(String[] args) {
		
		Book b1 = new Book("202103050001","아프니깐 청춘이다","김난도","Encore사",10000,"desc1");
		Book b2 = new Book("202103050002","자바 프로그래밍 입문","박은종","이지스퍼블리싱",15000,"desc2");
		Book b3 = new Book("202103050003","스프링 부트로 배우는 자바 웹 개발","윤석진","제이펍",20000,"desc3");
		Book b4 = new Book("202103050004","이것이 MySQL이다","우재남","한빛미디어",25000,"desc4");
		Book b5 = new Magazine("200103050005","MAXIM 화보집","MAXIM출판사","맥심사",18000,"desc5",2020,05);
		Book b6 = new Book("202103050007","스프링 부트로 배우는 자바 웹 개발","윤석진","제이펍",20000,"desc3");
		
		Book[] books = {b1,b2,b3,b4,b5,b6};
		
		printBooks(books);
		
	}
		
		
		
		
		
	public static void printBooks(Book[] books) {
		
		BookManager manager = new BookManager(50);
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0 ; i < books.length ; i ++) {
			manager.insertBook(books[i]);
		}
		
		
		System.out.println("=== 1. 전체책 호출 ===");
		
		System.out.println("전체 책 호출");
		for (Book b : manager.getAllBook()) {
			System.out.println(b);
		}
		
		
		
		System.out.println("도서관 책을 찾아보자 (ISBN을 이용하여)");
		System.out.println("ISBN을 입력하세요");
		String isbn = sc.next();
		if(manager.searchBookByIsbn(isbn)== null) {
			System.out.println("책이 없네요");
			
		}
		else System.out.println(manager.searchBookByIsbn(isbn));
		
		System.out.println("도서관 책을 찾아보자 (제목으로)");
		System.out.println("제목을 입력하세요"); sc.nextLine();
		String title = sc.nextLine();
		int count = 0;
		for (Book b : manager.searchBookByTitle(title)) {
			if ( b != null) System.out.println(b);
			else count++;
			
		}
		if (count == manager.searchBookByTitle(title).length) {
			System.out.println("죄송합니다. 일치하는 책이 존재하지 않습니다.");
		} // next와 nextLine을 주의하자.
		
		System.out.println("도서관 책을 찾아보자 (출판사명으로)");
		System.out.println("출판사명을 입력하세요");
		String publisher = sc.next();
		int count1 = 0;
		for (Book b : manager.searchBookByPublisher(publisher)) {
			if ( b != null) System.out.println(b);
			else count1++;
			
		}
		if (count1 == manager.searchBookByPublisher(publisher).length) {
			System.out.println("죄송합니다. 일치하는 책이 존재하지 않습니다.");
		} // next와 nextLine을 주의하자.
		
		System.out.println("책의 가격으로 책을 찾아보자");
		System.out.println("가격을 입력해주세요 >> ");
		double price = sc.nextDouble();
		
		int count2 = 0;
		for ( Book b : manager.searchBookByPrice(price)) {
			if ( b != null) System.out.println(b);
			else count2++;
		}
		if (count2 == manager.searchBookByPrice(price).length) {
			System.out.println("가격에 맞는 책을 찾지 못하였습니다.");
		}
		
		System.out.println("가지고 계신 책들의 총 금액 : " + manager.getSumPriceOfBooks() +"원");
		System.out.println("가지고 계신 책들의 평균 금액 : " + manager.getAveragePriceOfBooks()+"원");
			
			

	}

	

}
