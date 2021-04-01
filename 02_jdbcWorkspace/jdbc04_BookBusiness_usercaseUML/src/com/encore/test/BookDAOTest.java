package com.encore.test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

import com.encore.dao.impl.BookDAOImpl;
import com.encore.exception.InvalidInputException;
import com.encore.vo.Book;

public class BookDAOTest {
	public static void main(String[] args) throws ClassNotFoundException, Exception {
	
		
	BookDAOImpl dao = BookDAOImpl.getInstance();
//	dao.registerBook(new Book("123","오오오","형형형","석석석",15000));
//	System.out.println(dao.findByIsbn("1A1"));
    Scanner scan = new Scanner(System.in);
	int cmdNo = 0;



		while (true) {

			System.out.println("");

			System.out.println("<< 원하는 메뉴를 선택하십시오. >>");

			System.out.println("1.등록 2.삭제 3.찾기 4.책 할인 5. 모든 책 리스트 6.종료");

			cmdNo = scan.nextInt();


			if (cmdNo == 1) {
				System.out.println("1. ISBN 입력");
				String isbn = scan.next();
				
				System.out.println("2. 제목 입력");
				String title = scan.next();
				
				System.out.println("3. 작가 입력");
				String author = scan.next();
				
				System.out.println("4. 출판사 입력");
				String publisher = scan.next();
				
				System.out.println("5. 가격 입력");
				int price = scan.nextInt();
				
				
				dao.registerBook(new Book(isbn,title,author,publisher,price));
				


			}

			else if (cmdNo == 2) {
				
				System.out.println("<< 삭제 >>");
				System.out.println("<< 삭제할 책의 ISBN 을 입력해주세요 >>");
				String isbn = scan.next();
				dao.deleteBook(isbn);
				



			}

			else if (cmdNo == 3) {
				System.out.println("<< 찾을 방법을 선택해주세요. >>");
				System.out.println("1.ISBN  2.작가  3.출판사  4.가격");
				int number = scan.nextInt();
				switch(number) {
				
				case 1:
					System.out.println("<< ISBN 으로 책 찾기 >>");
					System.out.println("ISBN 을 입력해주세요.");
					String isbn = scan.next();
					System.out.println(" 찾으신 책의 목록입니다.");
					System.out.println("===================");
					System.out.println(dao.findByIsbn(isbn));
					break;
				case 2:
					System.out.println("<< 작가로 책 찾기 >>");
					System.out.println("작가 이름을 을 입력해주세요.");
					String writer = scan.next();
					System.out.println(" 찾으신 책의 목록입니다.");
					System.out.println("===================");
					System.out.println(dao.findByWriter(writer));
					break;
				case 3:	
					System.out.println("<< 출판사로 책 찾기 >>");
					System.out.println("출판사 명을 을 입력해주세요");
					String publisher = scan.next();
					System.out.println(" 찾으신 책의 목록입니다.");
					System.out.println("===================");
					System.out.println(dao.findByPublisher(publisher));
					break;
				case 4:	
					System.out.println("<< 가격으로 책 찾기 >>");
					
					System.out.println("원하는 최저가를 입력해주세요");
					int min = scan.nextInt();
					System.out.println("원하는 최고가를 입력해주세요");
					int max = scan.nextInt();
					System.out.println(dao.findByPrice(min, max));	
					System.out.println(min+"(원) 이상 " + max +"(원) 이하의 책 목록은 다음과 같습니다.");
						
					break;
				}
			}

			else if (cmdNo == 4) {
				System.out.println("<< 출판사에 따른 할인율 적용하기 >>");
				System.out.println("원하는 할인가(%)를 입력해주세요");
				int per = scan.nextInt();
				
				
				System.out.println("출판사명을 입력해주세요");
				String publisher = scan.next();
				dao.discountBook(per, publisher);
				

			}
			else if (cmdNo == 5) {
				
				System.out.println("<< 모든 책에 대한 정보 출력 >>\n");
				dao.printAllInfo();

			}

			else {
				System.out.println("<<< 시스템이 종료되었습니다 >>>");
				scan.close();

			break;

	
	}
}
}
}
	

