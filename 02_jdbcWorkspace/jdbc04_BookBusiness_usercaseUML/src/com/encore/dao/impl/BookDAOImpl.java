package com.encore.dao.impl;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.encore.dao.BookDAO;
import com.encore.exception.BookNOTFoundException;
import com.encore.exception.DuplicateISBNException;
import com.encore.exception.InvalidInputException;
import com.encore.vo.Book;

import config.ServerInfo;

public class BookDAOImpl implements BookDAO {
	
	
	private static BookDAOImpl dao = new BookDAOImpl();
	
	private BookDAOImpl() {
		try{
			Class.forName(ServerInfo.Driver);
			System.out.println("<< Driver Loading Complete >>");
		}catch(ClassNotFoundException e) {
			System.out.println("<<<<< Driver Loading Complete >>>>>");
			Toolkit tool = Toolkit.getDefaultToolkit();
			tool.beep();
		}
		
		
	}
	
	public static BookDAOImpl getInstance( ) {
		return dao;
	}
	
	
	// 공통적인로직 .. Connection getConnect();
	// 공통적인 로직 closeAll... --> method overloading!
	
	public Connection getConnect() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(ServerInfo.URL,ServerInfo.USER,ServerInfo.PASSWORD);
		System.out.println("<< DB Server connection complete >>");
		
		return conn;
	}
	
	
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		if ( ps != null) ps.close();
		if ( conn != null ) conn.close();

	}
	
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		if ( rs != null ) rs.close();
		closeAll(ps, conn);
		
	}
	
	public boolean isIsbn(String isbn, Connection conn) throws SQLException{
		String query = "SELECT isbn FROM book WHERE isbn=?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, isbn);
		ResultSet rs = ps.executeQuery();
		return rs.next();
		
		
	}
	
	
	
	
	@Override
	public void registerBook(Book vo) throws SQLException, DuplicateISBNException {
		Connection conn = getConnect();
		PreparedStatement ps = null;
		ResultSet rs;
		
		
		String sql2= "SELECT * FROM book WHERE isbn=?";
		PreparedStatement ps2 = conn.prepareStatement(sql2);
		ps2.setString(1, vo.getIsbn());
		rs = ps2.executeQuery();
		
		if ( isIsbn(vo.getIsbn(), conn)) throw new DuplicateISBNException();
		
		else {
		
		
		String sql = "INSERT INTO book VALUES(?,?,?,?,?)";
		ps = conn.prepareStatement(sql);
		System.out.println("<< PreparedStatement Creating >>");
		
		ps.setString(1, vo.getIsbn());
		ps.setString(2, vo.getTitle());
		ps.setString(3, vo.getAuthor());
		ps.setString(4, vo.getPublisher());
		ps.setInt(5, vo.getPrice());
		
		
		
		int row1 = ps.executeUpdate();
		if 	( row1 >=1  ) {
			System.out.println(row1+"row register complete");
		} 	else {
			System.out.println("<<<<<< Register ERROR >>>>>>>");
			Toolkit tool = Toolkit.getDefaultToolkit();
			tool.beep();
		}
			
		closeAll(ps, conn);}
		
		
		
		
			
	}

	@Override
	public void deleteBook(String isbn) throws SQLException, BookNOTFoundException {
		
		Connection conn = getConnect();
		PreparedStatement ps = null;
		
		String sql = "DELETE FROM book WHERE isbn = ?";
		ps = conn.prepareStatement(sql);
		System.out.println("<< PreparedStatement Creating >>");

		
		ps.setString(1, isbn);
		int row = ps.executeUpdate();
		
		if ( row >= 1 ) {
			System.out.println(row+"(row) Delete Complete" );
			Toolkit tool = Toolkit.getDefaultToolkit();
			tool.beep();
		} else throw new BookNOTFoundException(); 
		
		
		closeAll(ps, conn);
	}

	@Override
	public Book findByIsbn(String isbn) throws SQLException {
		
		Connection conn = getConnect();
		PreparedStatement ps = null;
		ResultSet rs;
		Book temp = new Book();
		
		String sql = "SELECT isbn, title, author, publisher, price FROM book WHERE isbn =?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, isbn);
		
		rs = ps.executeQuery();
		while ( rs.next ()) {
				temp.setIsbn(rs.getString("isbn"));
				temp.setTitle(rs.getString("title"));
				temp.setAuthor(rs.getString("author"));
				temp.setPublisher(rs.getString("publisher"));
				temp.setPrice(rs.getInt("price"));
		}
		Toolkit tool = Toolkit.getDefaultToolkit();
		tool.beep();
		closeAll(rs, ps, conn);
		return temp;
	}

	@Override
	public ArrayList<Book> findByWriter(String writer) throws SQLException {
		Connection conn = getConnect();
		PreparedStatement ps = null;
		ResultSet rs;
		ArrayList<Book> list = new ArrayList<Book>();
		
		String sql = "SELECT * FROM book WHERE author=?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, writer);
		System.out.println("<< PreparedStatement Creating Complete >>");
		rs = ps.executeQuery();
		
		while ( rs.next () ) {
			list.add(new Book(rs.getString("isbn"),
						rs.getString("title"),
						rs.getString("author"),
						rs.getString("publisher"),
						rs.getInt("price")));
			
			
		}
		Toolkit tool = Toolkit.getDefaultToolkit();
		tool.beep();
		if(list.isEmpty()) {
			System.out.println("찾으시는 책이 존재하지 않습니다.");
		}
		
		closeAll(rs, ps, conn);
		return list;
	}

	@Override
	public ArrayList<Book> findByPublisher(String publisher) throws SQLException {
		Connection conn = getConnect();
		PreparedStatement ps = null;
		ResultSet rs;
		ArrayList<Book> list = new ArrayList<Book>();
		
		String sql = "SELECT * FROM book WHERE publisher=?";
		ps = conn.prepareStatement(sql);
		System.out.println("<< PreparedStatement Creating Complete >>");
		ps.setString(1, publisher);
		
		rs = ps.executeQuery();
		
		while ( rs.next () ) {
			list.add(new Book(rs.getString("isbn"),
					rs.getString("title"),
					rs.getString("author"),
					rs.getString("publisher"),
					rs.getInt("price")));
			
			
		} if(list.isEmpty()) {
			System.out.println("찾으시는 책이 존재하지 않습니다.");
		}
		Toolkit tool = Toolkit.getDefaultToolkit();
		tool.beep();
		closeAll(rs, ps, conn);
		return list;

	}

	@Override
	public ArrayList<Book> findByPrice(int min, int max) throws SQLException, InvalidInputException {
		if ( min <=0 || min <0 || min >= max) throw new InvalidInputException();
		
		Connection conn = getConnect();
		PreparedStatement ps = null;
		ResultSet rs;
		ArrayList<Book> list = new ArrayList<Book>();
		
		
		String sql = "SELECT * FROM book WHERE price BETWEEN ? AND ?";
		ps = conn.prepareStatement(sql);
		System.out.println("<< PreparedStatement Creating Complete >>");
		
		ps.setInt(1, min);
		ps.setInt(2, max);
		
		rs = ps.executeQuery();
		
		while ( rs.next () ) {
			list.add(new Book(rs.getString("isbn"),
					rs.getString("title"),
					rs.getString("author"),
					rs.getString("publisher"),
					rs.getInt("price")));
			
			
		}
		Toolkit tool = Toolkit.getDefaultToolkit();
		tool.beep();
		closeAll(rs, ps, conn);
		return list;
		
		
	}

	@Override
	public void discountBook(int per, String publisher) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = getConnect();
				
			String sql = "UPDATE book SET price = price * (100-?)*0.01 WHERE publisher = ?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, per);
		ps.setString(2, publisher);
		int row = ps.executeUpdate();
		
		System.out.println(row+"(row) update complete");
		Toolkit tool = Toolkit.getDefaultToolkit();
		tool.beep();
		}
		finally {
			closeAll(ps, conn);
			
		}
	
	}

	@Override
	public void printAllInfo() throws SQLException {
		ResultSet rs = null;
		PreparedStatement ps = null;
		Connection conn = getConnect();
		
		ArrayList<Book> list = new ArrayList<Book>();
		
		String selectsql = "SELECT isbn, title, author, publisher, price FROM book";
		
			ps = conn.prepareStatement(selectsql);
			rs = ps.executeQuery();
			
			while(rs.next()){
				list.add(new Book(rs.getString("isbn"),
						rs.getString("title"),
						rs.getString("author"),
						rs.getString("publisher"),
						rs.getInt("price")));

			}
			
			closeAll(rs, ps, conn);
			for (Book b : list) System.out.println(b);
	}

}
