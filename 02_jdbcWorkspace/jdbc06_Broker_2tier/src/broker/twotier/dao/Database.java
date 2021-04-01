package broker.twotier.dao;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.naming.spi.DirStateFactory.Result;

import broker.twotier.exception.DuplicateSSNException;
import broker.twotier.exception.InvalidTransactionException;
import broker.twotier.exception.RecordNotFoundException;
import broker.twotier.vo.CustomerRec;
import broker.twotier.vo.SharesRec;
import broker.twotier.vo.StockRec;
import config.ServerInfo;

public class Database implements DatabaseTemplate {
	
	
	

	public Database(String serverIp) {
		try{
			Class.forName(ServerInfo.Driver);
			System.out.println("<< Driver Loading Complete >>");
		}catch(ClassNotFoundException e) {
			System.out.println("<<<<< Driver Loading Error >>>>>");
			Toolkit tool = Toolkit.getDefaultToolkit();
			tool.beep();
		}
		
		
	}



	@Override
	public Connection getConnect() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(ServerInfo.URL,ServerInfo.USER,ServerInfo.PASSWORD);
		System.out.println("<<<<< DB Server Connection Complete >>>>>");
		
		
		return conn;
	}

	@Override
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		if ( ps != null) ps.close();
		if ( conn != null ) conn.close();
		
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		if (rs != null) rs.close();
		closeAll(ps, conn);
				
		
	}
	
	// SSN이 있는지 없는지 확인하는 기능 --> isIsbn()과 동일한 기능.
	
	public boolean isExist(String ssn, Connection conn) throws SQLException {
		String query = "SELECT ssn FROM Customer WHERE ssn=?";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setString(1, ssn);
		ResultSet rs = ps.executeQuery();
		return rs.next();
		
	}
	
	@Override
	public void addCustomer(CustomerRec cust) throws SQLException, DuplicateSSNException {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
		conn = getConnect();
		if (isExist(cust.getSsn(), conn)) throw new DuplicateSSNException();
		
		else {
			String query = "INSERT INTO customer VALUES(?,?,?)";
			ps = conn.prepareStatement(query);
			ps.setString(1, cust.getSsn());
			ps.setString(2, cust.getName());
			ps.setString(3, cust.getAddress());
			
			int row = ps.executeUpdate();
			if ( row >=1 ) System.out.println(row+"(row) add complete");
			else System.out.println("<<<<< Add customer error >>>>>");
		}
		} finally {	
			closeAll(ps, conn);	
		}
			
	}

	@Override
	public void deleteCustomer(String ssn) throws SQLException, RecordNotFoundException {
		Connection conn = null;
		PreparedStatement ps = null;
		// 외래키 지정을 제약조건에 추가 .. customer 테이블에서 ssn을 삭제를 하면 shares에서도 자동적으로 삭제.
		try {
			conn = getConnect();
			if (isExist(ssn, conn)) {
				
				String query = "DELETE FROM customer WHERE ssn = ?";
				ps = conn.prepareStatement(query);
				
				ps.setString(1, ssn);
				int row = ps.executeUpdate();
				System.out.println(row+"(row) delete complete");
				

				
				
			}
			
			else {
				throw new RecordNotFoundException();
			}
			
		}finally {
			closeAll(ps, conn);
		}
		
	
		
		
		
	}

	@Override
	public void updateCustomer(CustomerRec cust) throws SQLException, RecordNotFoundException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = getConnect();
			String query = "UPDATE customer SET cust_name=?, address = ? WHERE ssn=?"; 
			
			ps = conn.prepareStatement(query);
			ps.setString(1, cust.getName());
			ps.setString(2, cust.getAddress());
			ps.setString(3, cust.getSsn());
			
			int row = ps.executeUpdate();
			if (row >=1 ) System.out.println(row+"(row) update complete");
			else throw new RecordNotFoundException();
			
			
		}finally{
								
			closeAll(ps, conn);
			
		}

	}

	@Override
	public Vector<SharesRec> getPortfolio(String ssn) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Vector<SharesRec> v = new Vector<SharesRec>();
		
		try {
			conn = getConnect();
			
			String query = "SELECT ssn, symbol, quantity FROM shares WHERE ssn=?";
			ps = conn.prepareStatement(query);
			
			ps.setString(1, ssn);
			rs = ps.executeQuery();
			while (rs.next() ) {
				v.add(new SharesRec(ssn,
						rs.getString("symbol"),
						rs.getInt("quantity")));			
			}
	
			
		} finally {
			closeAll(rs, ps, conn);
		}
		
		return v;
	}

	
	@Override
	public CustomerRec getCustomer(String ssn) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		CustomerRec temp = new CustomerRec();
		ResultSet rs = null;
		try {
			
			conn = getConnect();
			String query = "SELECT ssn, cust_name, address FROM customer WHERE ssn=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, ssn);
			
			rs = ps.executeQuery();
			if ( rs.next()) {
				temp = new CustomerRec(ssn, 
						rs.getString("cust_name"), 
						rs.getString("address"),
						getPortfolio(ssn)); // 방법 1
				
			} 
			// cust.setPortfolio(getPortfolio(ssn)); --> 방법 2
		}finally {
			closeAll(rs, ps, conn);
		}
		
		
		return temp;
	}

	@Override
	public ArrayList<CustomerRec> getAllCustomers() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<CustomerRec> temp = new ArrayList<CustomerRec>();
		
		try {
			
			conn = getConnect();
			String sql = "SELECT ssn, cust_name, address FROM customer";
			
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();
			while ( rs.next()) {
				temp.add(new CustomerRec(
						rs.getString("ssn"),
						rs.getString("cust_name"),
						rs.getString("address"),
						getPortfolio(rs.getString("ssn"))));
				
			}
			
		}finally {
			
			closeAll(rs, ps, conn);
		}
		
		
		
		return temp;
	}

	@Override
	public ArrayList<StockRec> getAllStocks() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<StockRec> temp = new ArrayList<StockRec>();
		
		try {
			
			conn = getConnect();
			String sql = "SELECT symbol, price FROM stock";
			
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();
			while ( rs.next()) {
				temp.add(new StockRec(
						rs.getString("symbol"),
						rs.getFloat("price")));
				
			}
			
		}finally {
			
			closeAll(rs, ps, conn);
		}
		
		
		
		return temp;
	}
	

	
	/*
	 *  누가 어떤 주식을 몇개 살지를 정의
	 *  
	 * 	 즉 , 현재 가지고 있는 주식의 갯수부터 확인해봐야 한다.
	 * 
	  		1. 현재 주식을 안가지고 있다. --> insert into
	  		2. 현재 주식을 보유하고 있다. --> update 
	
	 * 
	 */
	@Override
	public void buyShares(String ssn, String symbol, int quantity) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = getConnect();
			
			String query = "SELECT quantity FROM shares WHERE ssn=? AND symbol=?";
			ps = conn.prepareStatement(query);
			
			ps.setString(1, ssn);
			ps.setString(2, symbol);
			
			rs = ps.executeQuery();
			if ( rs.next() ) { // 주식을 보유하고 있을 때 
				int q = rs.getInt(1); // q 는 현재 가지고 있는 주식의 수(양).
				int newQuantity = q+quantity;
				
				// UPDATE
				String query1= "UPDATE shares SET quantity =? WHERE ssn=? AND symbol= ?";
				ps = conn.prepareStatement(query1);
				
				ps.setInt(1, newQuantity);
				ps.setString(2, ssn);
				ps.setString(3, symbol);
				
				System.out.println(ps.executeUpdate()+"(row) buy shares(update) complete");
				
				
				
			} else { // 주식을 보유하고 있지 않을때 
				
				String query2= "INSERT INTO shares (ssn, symbol, quantity) VALUES (?,?,?)";
				ps = conn.prepareStatement(query2);
				
				ps.setString(1,ssn);
				ps.setString(2,symbol);
				ps.setInt(3,quantity);
				
				System.out.println(ps.executeUpdate() +"(row) buy shares(insert) complete");
		
			}	
		}finally {
			closeAll(rs, ps, conn);
			
		}
		
		
		
		
		
		
	}

	// 누가 어떤 주식을 몇개 팔것인가에 대한 기능을 정의
	// 현재 가지고 있는 주식의 수량을 먼저 알아야 한다... int q 
	
	// 1) 100개 중 -> 50개 팔게! --> UPDATE
	// 2) 100개 중 -> 100개 팔게 --> delete
	// 3) 100개 중 -> 200개 팔게 --> InvalidTranscactionException ( Error )
	// 4) 팔려는 주식이 없을때 --> RecordNotFoundException ( Error ) 

	
	@Override
	public void sellShares(String ssn, String symbol, int quantity) throws SQLException, InvalidTransactionException, RecordNotFoundException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			conn = getConnect();
			String query = "SELECT quantity FROM shares WHERE ssn=? AND symbol=?";
			ps = conn.prepareStatement(query);
			
			ps.setString(1, ssn);
			ps.setString(2, symbol);
			
			rs = ps.executeQuery();
			if (rs.next()) {
				int q = rs.getInt(1);
				int newQuantity = quantity;
				int finalQuantity = q-quantity;
				if ( q > newQuantity) {
					String query1 = "UPDATE shares SET quantity =? WHERE ssn=? AND symbol= ?";
					ps = conn.prepareStatement(query1);

					ps.setInt(1, finalQuantity);
					ps.setString(2,ssn);
					ps.setString(3, symbol);
					
					System.out.println(ps.executeUpdate()+"row sell shares(update) complete");}
				
			 
				else if (q == newQuantity) {
					String query2= "DELETE FROM shares WHERE symbol=?";
					ps = conn.prepareStatement(query2);
					
					ps.setString(1, symbol);
					System.out.println(ps.executeUpdate()+"row sell shares(delete) complete");
	
				}
				else if (q < newQuantity) throw new InvalidTransactionException();
				
			}else {
				throw new RecordNotFoundException();
			}
			
			
		}finally {
			closeAll(rs, ps, conn);
			
		}
		
	
		
	}

}
