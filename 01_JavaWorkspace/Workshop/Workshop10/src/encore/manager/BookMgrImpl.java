package encore.manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
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
					System.out.println("颇老 积己 己傍");
				}
			} catch ( IOException e) {
				System.out.println("颇老 积己 角菩.");
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
					throw new QuantityException("\n***** 了价钦聪促. 氓狼 犁绊啊 何练钦聪促! *****\n");
				}
			
				if (b.getIsbn().equals(isbn)) {
					find = true;
					price += b.getPrice() * b.getQuantity();
					b.setQuantity(b.getQuantity()-quantity);
					System.out.println("<< 魄概窍脚 档辑狼 捞抚篮 "+b.getTitle()+"涝聪促 >>");
					System.out.println("<< 魄概窍脚 饶 氓狼 肮荐绰 "+b.getQuantity()+"(鼻)涝聪促\n");
					}
			}
		} if (find == false ) throw new ISBNNotFoundException("***** 了价钦聪促, 氓阑 茫阑 荐 啊 绝嚼聪促. *****\n");
		System.out.println("<< 魄概窍脚 档辑狼 啊拜篮"+ price +"盔 涝聪促. >>\n");}
	 

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
					System.out.println("<< 备涝窍脚 档辑狼 捞抚篮 "+b.getTitle()+"涝聪促 >>");
					System.out.println("<< 备涝窍脚 饶 氓狼 肮荐绰 "+b.getQuantity()+"(鼻)涝聪促\n");
								
					
				}
			}
		} if (find == false ) throw new ISBNNotFoundException("\n***** 了价钦聪促, 氓阑 茫瘤 给沁嚼聪促 *****\n");
		
		System.out.println("<< 备涝窍脚 档辑狼 啊拜篮 " + price +"盔 涝聪促. >>\n");
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

	@Override
	public void send() {
		
		try {
			Socket s = new Socket("127.0.0.1", 59999);
			System.out.println("<< Socket Creating >>");
			
			// Datatype 俊辑狼 坷幅啊 惯积窍绰 巴 鞍促.
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter pw = new PrintWriter(s.getOutputStream());
			
			BookClient bt = new BookClient(s);
			bt.start();
			
			System.out.println("<< Stream Creating >>");
			while ( true ) {
				String line = br.readLine();
				pw.println(line);
			}
			
			
		}catch (Exception e) {
			System.out.println("What's the Problem");
			
		}
				
			
		}
		
	}
	
	class BookClient extends Thread {
		Socket s;
		BufferedReader br1;
		
		BookClient (Socket s){
			this.s =s;
		}
		public void run () {
			try {
				br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
				while ( true ) {
					String str = br1.readLine();
					System.out.println("氓 沥焊  : " +str);
				}
				
				
			}catch (Exception e) {
				
			}
		}
		
	}		


 


