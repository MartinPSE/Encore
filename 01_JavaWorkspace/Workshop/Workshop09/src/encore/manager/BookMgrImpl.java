package encore.manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import encore.exception.ISBNNotFoundException;
import encore.exception.QuantityException;
import encore.manager.impl.IBookMgr;
import encore.vo.Book;

public class BookMgrImpl implements IBookMgr{
	BufferedReader br;
	BufferedWriter bw;
	FileReader fr;
	FileWriter fw;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	FileOutputStream fos;
	FileInputStream fis;
	ArrayList<Book> bList = new ArrayList<Book>();
	File file;
	
	

	
	private static BookMgrImpl mgr = new BookMgrImpl();
	
	private BookMgrImpl() {
		file = new File("book.dat");
		if (file.exists()) {
			open();
		} else {
			try{
				if(file.createNewFile()) {
					System.out.println("���� ���� ����");
				}
			} catch ( IOException e) {
				System.out.println("���� ���� ����.");
			}
			
		}
	}
	
	public static BookMgrImpl getInstance() {
		return mgr;
	}
	
	
	public void open() {
		try {
		ois = new ObjectInputStream(new FileInputStream(file));
		bList =(ArrayList<Book>)ois.readObject();
		}
		catch (IOException e) {
			
		}catch ( ClassNotFoundException e) {
		}
		
		
		finally {
			try {
				if (br != null)
					br.close();
			} catch ( Exception e ) {
				
			}
			}
		
			
	}
	

	@Override
	public void add(Book b) {
		bList.add(b);
		
	}

	@Override
	public ArrayList<Book> search() {
		ArrayList<Book> temp = new ArrayList<Book>();
		for (Book b : bList) {
			temp.add(b);
		}
		return temp;
	}

	@Override
	public void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException
	
	{ 	boolean find = false;
		int price = 0;
		
		for (Book b : bList) {
			if (b != null) {
				if ((b.getIsbn().equals(isbn) & b.getQuantity() < quantity)) {
					throw new QuantityException("\n***** �˼��մϴ�. å�� ��� �����մϴ�! *****\n");
				}
			
				if (b.getIsbn().equals(isbn)) {
					find = true;
					price += b.getPrice() * b.getQuantity();
					b.setQuantity(b.getQuantity()-quantity);
					System.out.println("<< �Ǹ��Ͻ� ������ �̸��� "+b.getTitle()+"�Դϴ� >>");
					System.out.println("<< �Ǹ��Ͻ� �� å�� ������ "+b.getQuantity()+"(��)�Դϴ�\n");
					}
			}
		} if (find == false ) throw new ISBNNotFoundException("***** �˼��մϴ�, å�� ã�� �� �� �����ϴ�. *****\n");
		System.out.println("<< �Ǹ��Ͻ� ������ ������"+ price +"�� �Դϴ�. >>\n");}
	 

	@Override
	public void buy(String isbn, int quantity) throws ISBNNotFoundException{
		boolean find = false;
		int price = 0;
		for ( Book b : bList) {
			if ( b != null ) {
				if ( b.getIsbn().equals(isbn)) {
					find = true;
					price += b.getPrice() * b.getQuantity();
					b.setQuantity(b.getQuantity()+quantity);
					System.out.println("<< �����Ͻ� ������ �̸��� "+b.getTitle()+"�Դϴ� >>");
					System.out.println("<< �����Ͻ� �� å�� ������ "+b.getQuantity()+"(��)�Դϴ�\n");
								
					
				}
			}
		} if (find == false ) throw new ISBNNotFoundException("\n***** �˼��մϴ�, å�� ã�� ���߽��ϴ� *****\n");
		
		System.out.println("<< �����Ͻ� ������ ������ " + price +"�� �Դϴ�. >>\n");
	} 

	@Override
	public int getTotalAmount() {
		int sum = 0;
		int total = 0;
		int totalQuantity = 0;
		for ( Book b : bList) {
			total += b.getPrice();
			totalQuantity += b.getQuantity();
			sum = total * totalQuantity;
			
			
		}
		
		return sum;
	}
	
	public void close() {
			
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(bList);
			
		}catch(IOException e){
			
		}finally{
			try {
				if (bw != null) bw.close();
			}catch (Exception e) {
				System.out.println(e);
			}
			
		}
	
	}
	
	
	
}
