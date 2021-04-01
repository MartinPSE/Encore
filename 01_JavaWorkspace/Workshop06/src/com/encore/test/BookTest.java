package com.encore.test;

import com.encore.manage.BookManager;
import com.encore.vo.Book;
import com.encore.vo.Magazine;
import java.util.Scanner;

public class BookTest {
	
	

	public static void main(String[] args) {
		
		Book b1 = new Book("202103050001","�����ϱ� û���̴�","�賭��","Encore��",10000,"desc1");
		Book b2 = new Book("202103050002","�ڹ� ���α׷��� �Թ�","������","�������ۺ���",15000,"desc2");
		Book b3 = new Book("202103050003","������ ��Ʈ�� ���� �ڹ� �� ����","������","������",20000,"desc3");
		Book b4 = new Book("202103050004","�̰��� MySQL�̴�","���糲","�Ѻ��̵��",25000,"desc4");
		Book b5 = new Magazine("200103050005","MAXIM ȭ����","MAXIM���ǻ�","�ƽɻ�",18000,"desc5",2020,05);
		Book b6 = new Book("202103050007","������ ��Ʈ�� ���� �ڹ� �� ����","������","������",20000,"desc3");
		
		Book[] books = {b1,b2,b3,b4,b5,b6};
		
		printBooks(books);
		
	}
		
		
		
		
		
	public static void printBooks(Book[] books) {
		
		BookManager manager = new BookManager(50);
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0 ; i < books.length ; i ++) {
			manager.insertBook(books[i]);
		}
		
		
		System.out.println("=== 1. ��üå ȣ�� ===");
		
		System.out.println("��ü å ȣ��");
		for (Book b : manager.getAllBook()) {
			System.out.println(b);
		}
		
		
		
		System.out.println("������ å�� ã�ƺ��� (ISBN�� �̿��Ͽ�)");
		System.out.println("ISBN�� �Է��ϼ���");
		String isbn = sc.next();
		if(manager.searchBookByIsbn(isbn)== null) {
			System.out.println("å�� ���׿�");
			
		}
		else System.out.println(manager.searchBookByIsbn(isbn));
		
		System.out.println("������ å�� ã�ƺ��� (��������)");
		System.out.println("������ �Է��ϼ���"); sc.nextLine();
		String title = sc.nextLine();
		int count = 0;
		for (Book b : manager.searchBookByTitle(title)) {
			if ( b != null) System.out.println(b);
			else count++;
			
		}
		if (count == manager.searchBookByTitle(title).length) {
			System.out.println("�˼��մϴ�. ��ġ�ϴ� å�� �������� �ʽ��ϴ�.");
		} // next�� nextLine�� ��������.
		
		System.out.println("������ å�� ã�ƺ��� (���ǻ������)");
		System.out.println("���ǻ���� �Է��ϼ���");
		String publisher = sc.next();
		int count1 = 0;
		for (Book b : manager.searchBookByPublisher(publisher)) {
			if ( b != null) System.out.println(b);
			else count1++;
			
		}
		if (count1 == manager.searchBookByPublisher(publisher).length) {
			System.out.println("�˼��մϴ�. ��ġ�ϴ� å�� �������� �ʽ��ϴ�.");
		} // next�� nextLine�� ��������.
		
		System.out.println("å�� �������� å�� ã�ƺ���");
		System.out.println("������ �Է����ּ��� >> ");
		double price = sc.nextDouble();
		
		int count2 = 0;
		for ( Book b : manager.searchBookByPrice(price)) {
			if ( b != null) System.out.println(b);
			else count2++;
		}
		if (count2 == manager.searchBookByPrice(price).length) {
			System.out.println("���ݿ� �´� å�� ã�� ���Ͽ����ϴ�.");
		}
		
		System.out.println("������ ��� å���� �� �ݾ� : " + manager.getSumPriceOfBooks() +"��");
		System.out.println("������ ��� å���� ��� �ݾ� : " + manager.getAveragePriceOfBooks()+"��");
			
			

	}

	

}
