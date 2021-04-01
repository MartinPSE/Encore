package com.encore.test;
import java.util.ArrayList;
import java.util.Scanner;

import com.encore.vo.Book;
import com.encore.manage.impl.BookMgrImpl;
import com.encore.vo.Magazine;

public class BookTest2 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Book> books = new ArrayList<>();
		
		books.add(new Book("202103100001","Doit! 자바 프로그래밍 입문","박은종","이지스퍼블리싱",15000,"desc1"));
		books.add(new Magazine("202103100002","메종드 끌레르 화보 집","박은종","메종드 끌레르",10000,"desc2",2020,3));
		books.add(new Book("202103100003","Doit! 파이썬 프로그래밍 입문","김수화무","민음사",19000,"desc3"));
		books.add(new Magazine("202103100004","MAXIM 화보 집","박은종","MAXIM",12500,"desc4",2021,3));
		books.add(new Book("202103100005","Doit! MySQL 프로그래밍 입문","거북이","관음사",23000,"desc5"));
		books.add(new Magazine("202103100006","ARENA","박은종","ARENA",15000,"desc6",2020,4));
		books.add(new Book("202103100007","Doit! 스프링부트캠프 프로그래밍 입문","두루미","관셈보살",27000,"desc7"));
		
		
		BookMgrImpl mgr = BookMgrImpl.getInstance();
		
		for ( Book b : books) {
			System.out.println(b);
			mgr.addBook(b);
		}
		
		
		
		aaa : while(true)
		{
			String menu = "";
			menu += "번호를 선택하세요\n";
			menu += "1:데이터 입력 기능\t";
			menu += "2:데이터 전체 검색기능\n";
			menu += "3:isbn으로 정보를 검색하는 기능\t";
			menu += "4:Title로 정보를 검색하는 기능(파라메터로 주어진 제목을 포함하는 모든 정보)\n";
			menu += "5:Book만 검색하는 기능\t";
			menu += "6:Magazine만 검색하는 기능\n";
			menu += "7:Magazine중 올해 잡지만 검색하는 기능\t";
			menu += "8:출판사로 검색하는 기능\n";
			menu += "9:가격으로 검색 기능(파라메터로 주어진 가격보다 낮은 도서 정보 검색)\t";
			menu += "10:저장된 모든 도서의 금액 합계를 구하는 기능\n";
			menu += "11:저장된 모든 도서의 금액 평균을 구하는 기능\t";
			menu += "0:끝내기";

			System.out.println(menu);
			int number = sc.nextInt();
			
			switch(number)
			{
			case 0: 
				break;
			case 1:
//				bm.add(new Book("11", "자바", "Alpha", "a.kr", 100, "aaaa"));
//				bm.add(new Magazine("22", "C", "Bravo", "b.kr", 300, "bbbb", 2019, 7));
//				bm.add(new Book("11", "C++", "Charlie", "c.kr", 200, "cccc"));
//				bm.add(new Magazine("44", "자바", "Delta", "d.kr", 50, "dddd", 2020, 2));
//				
				System.out.println("번호 선택 (1:Book / 2:Magazine) : ");
				int num = sc.nextInt();
				
				if(num < 0 || 2 < num)
					continue;
					
				System.out.println("isbn(String) : ");
				String isbn = sc.next();
				System.out.println("title(String) : ");
				String title = sc.next();
				System.out.println("author(String) : ");
				String author = sc.next();
				System.out.println("publisher(String) : ");
				String publisher = sc.next();
				System.out.println("price(int) : ");
				int price = sc.nextInt();
				System.out.println("desc(String) : ");
				String desc = sc.next();
				
				
				if(num==1)
				{
					Book book = new Book(isbn,title,author,publisher,price,desc);
					mgr.addBook(book);
				}
				else if(num == 2)
				{
					System.out.println("year(int) : ");
					int year = sc.nextInt();
					System.out.println("month(int) : ");
					int month = sc.nextInt();
					
					Magazine maga = new Magazine(isbn,title,author,publisher,price,desc,year,month);
					mgr.addBook(maga);
				}
				
				break;
				
			case 2:
				ArrayList<Book> list=mgr.getAllBook();
				for(Book b : list) {
					System.out.println(b);
				}
				break;
			case 3:
				System.out.println("검색할 isbn 입력 : ");
				String name1 = sc.next();				
				System.out.println(mgr.searchBookByIsbn(name1));
				break;
			case 4:
				System.out.println("검색할 title 입력 : ");
				String name2 = sc.next();
				ArrayList<Book> returnList=mgr.searchBookByTitle(name2);
				for(Book b : returnList) System.out.println(b);
				
				break;
			case 5:
				ArrayList<Book> returnList2=mgr.onlySearchBook();
				for(Book b : returnList2) {
					System.out.println(b);
				}
				
				break;
			case 6:
				ArrayList<Book> returnList3=mgr.onlySearchMagazine();
				for(Book b : returnList3) {
					System.out.println(b);
				}
				break;
			case 7:
				System.out.println("찾고자 하는 잡지의 연도를 입력해주세요");
				int year = sc.nextInt();
				ArrayList<Book> returnList4 = mgr.magazineOfThisYearInfo(year);
				if (returnList4.isEmpty()) System.out.println(" <입력하신 년도의 잡지는 존재하지 않습니다.> ");
				
				else {
					System.out.println(mgr.magazineOfThisYearInfo(year));
				}
					
						
					
					
				break;
				
			case 8:
				System.out.println("검색할 publisher(출판사) 입력 : ");
				String name3 = sc.next();
				ArrayList<Book> returnList5 = mgr.searchBookByPublisher(name3);
				for(Book b : returnList5) System.out.println(b);
				break;
			case 9:
				System.out.println("검색할 가격 입력 : ");
				int num2 = sc.nextInt();
				ArrayList<Book> returnList6 = mgr.searchBookByPrice(num2);
				for(Book b : returnList6)System.out.println(b);
				break;
			case 10:
				System.out.println("구입하신 책의 총 금액은 : " + mgr.getTotalPrice());
				break;
			case 11:
				System.out.println("구입하신 책의 평균 금액은 : " +mgr.getAvgPrice());
				
			}
		}	
	}
}