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
					System.out.println("파일 생성 성공");
				}
			} catch ( IOException e) {
				System.out.println("파일 생성 실패.");
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
					throw new QuantityException("\n***** 죄송합니다. 책의 재고가 부족합니다! *****\n");
				}
			
				if (b.getIsbn().equals(isbn)) {
					find = true;
					price += b.getPrice() * b.getQuantity();
					b.setQuantity(b.getQuantity()-quantity);
					System.out.println("<< 판매하신 도서의 이름은 "+b.getTitle()+"입니다 >>");
					System.out.println("<< 판매하신 후 책의 갯수는 "+b.getQuantity()+"(권)입니다\n");
					}
			}
		} if (find == false ) throw new ISBNNotFoundException("***** 죄송합니다, 책을 찾을 수 가 없습니다. *****\n");
		System.out.println("<< 판매하신 도서의 가격은"+ price +"원 입니다. >>\n");}
	 

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
					System.out.println("<< 구입하신 도서의 이름은 "+b.getTitle()+"입니다 >>");
					System.out.println("<< 구입하신 후 책의 갯수는 "+b.getQuantity()+"(권)입니다\n");
								
					
				}
			}
		} if (find == false ) throw new ISBNNotFoundException("\n***** 죄송합니다, 책을 찾지 못했습니다 *****\n");
		
		System.out.println("<< 구입하신 도서의 가격은 " + price +"원 입니다. >>\n");
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
