package com.encore.test;

import java.util.Scanner;

import com.encore.manage.impl.BookManagerImpl;
import com.encore.vo.Book;
import com.encore.vo.Magazine;
import com.encore.vo.Novel;

public class BookTest {
	
	

	public static void main(String[] args) {
		
		Book b1 = new Book("202103050001","�����ϱ� û���̴�","�賭��","Encore��",10000,"desc1");
		Book b2 = new Book("202103050002","�ڹ� ���α׷��� �Թ�","������","�������ۺ���",15000,"desc2");
		Book b3 = new Book("202103050003","������ ��Ʈ�� ���� �ڹ� �� ����","������","������",20000,"desc3");
		Book b4 = new Book("202103050004","�̰��� MySQL�̴�","���糲","�Ѻ��̵��",25000,"desc4");
		Book b5 = new Magazine("200103050005","MAXIM ȭ����","MAXIM���ǻ�","�ƽɻ�",18000,"desc5",2020,05);
		Book b6 = new Book("202103050007","������ ��Ʈ�� ���� �ڹ� �� ����","������","������",20000,"desc3");
		Book b7 = new Novel("202103080008","��������-1984","��������","���л�",17500,"desc6");
		
		
		Book[] books = {b1,b2,b3,b4,b5,b6,b7};
		
		printBooks(books);
		
	}
		
		
		
		
		
	public static void printBooks(Book[] books) {
		
		BookManagerImpl manager = new BookManagerImpl(50);
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0 ; i < books.length ; i ++) {
			manager.insertBook(books[i]);
		}
		
		System.out.println("======== �ɼ��� ���� ========");
		System.out.println("1. ��äå ���");
		System.out.println("2. å ã�ƺ��� (ISBN����)");
		System.out.println("3. �������� å ã��");
		System.out.println("4. ���ǻ������ å ã��");
		System.out.println("5. �������� å ã��");
		System.out.println("6. å ��Ͽ� �� ���ݰ� ��հ���");
		System.out.println("==========================");
		
		
		int number = sc.nextInt();
		
		switch (number) {
		
		
		case 1:
		
		
			System.out.println("��ü å ȣ��");
			for (Book b : manager.getAllBook()) {
				System.out.println(b);
			}
			break;
		
		
		case 2:
			System.out.println("������ å�� ã�ƺ��� (ISBN�� �̿��Ͽ�)");
			System.out.println("ISBN�� �Է��ϼ���");
			String isbn = sc.next();
			if(manager.searchBookByIsbn(isbn)== null) {
				System.out.println("å�� ���׿�");
			
			}
			else System.out.println(manager.searchBookByIsbn(isbn));
			break;
			
		case 3:
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
			break;
			
		case 4:
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
			break;
			
		case 5:
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
			break;
		case 6:
			System.out.println("===============�� �ݾװ� ��� �ݾ�============");
			System.out.println("������ ��� å���� �� �ݾ� : " + manager.getSumPriceOfBooks() +"��");
			System.out.println("������ ��� å���� ��� �ݾ� : " + manager.getAveragePriceOfBooks()+"��");
			break;
			
		}
	}

	

}
