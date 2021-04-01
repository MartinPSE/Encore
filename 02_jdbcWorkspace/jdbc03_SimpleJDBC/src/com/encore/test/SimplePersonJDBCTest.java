package com.encore.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.encore.vo.Person;

import config.ServerInfo;

/*
 	DAO + Test
 	
 	JDBC 4단계( 드라이버 로딩은 제외 )
 	2. DB 연결
 	3. Prepared Statement 생성
 	4. Query 실행
 	5. 자원 닫기 / 즉 종료 
 	
 	-- > 2번과 5번은 Method 마다 고정적으로 로직이 작성되는 부분!
 			하나의 method로 만들어서, 그냥 호출만하자!!
 	
 
  
 */

public class SimplePersonJDBCTest {
	public SimplePersonJDBCTest() throws ClassNotFoundException{
		
		Class.forName(ServerInfo.Driver);
		System.out.println("<< Driver Lodading Complete >>");
		
	
	}
	// 고정적으로 반복되는 부분을 공통적인 로직으로 정의... getConnect(), close();
	
	public Connection getConnect() throws SQLException{
		Connection conn = DriverManager.getConnection(ServerInfo.URL,ServerInfo.USER,ServerInfo.PASSWORD);
		System.out.println("<< DB Server Connection Complete >> ");
		
		return conn;
		
	}
	
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		if (ps != null) ps.close();
		if (conn != null) conn.close();
		
	
	}
	
	
	
	
	// 비지니스 로직 (DB Access 하는 로직 ) 정의
	public void addPerson(Person p) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
	
		conn = getConnect();
		
			String query = "INSERT INTO person VALUES(?,?,?)";
			ps = conn.prepareStatement(query);
			System.out.println("<< Prepared Statement Creating >>");
			
			ps.setInt(1, p.getSsn());
			ps.setString(2, p.getName());
			ps.setString(3, p.getAddress());
			int row = ps.executeUpdate();
			if ( row > 0 ) {
				System.out.println(row+"(명) 생성 완료");
			}
			else System.out.println("죄송합니다, 추가하는데 오류가 발생했습니다.");
			
			closeAll(ps, conn);
		
	
	}
	public void deletePerson(int ssn) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		
		conn = getConnect();
			
			String sql = "DELETE FROM person where ssn=?";
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, ssn);
			int row = ps.executeUpdate();
			if ( row > 0 ) {
				System.out.println(row + "(명) 삭제완료");
			}
			else System.out.println("죄송합니다, 삭제하는데 오류가 발생했습니다.");
			
			closeAll(ps, conn);
	}
	
	public void updatePerson (Person p) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		
		conn = getConnect();
		
			String sql = "UPDATE person SET name= ?, address=? WHERE ssn= ?"; 
			ps = conn.prepareStatement(sql);
			System.out.println("<< PreparedStatement Creating >>");
			
			ps.setString(1, p.getName());
			ps.setString(2, p.getAddress());
			ps.setInt(3, p.getSsn());
			int row = ps.executeUpdate();
			if (row > 0 ) {
				System.out.println(row+"(명) 수정 완료되었습니다.");
			}else System.out.println("죄송합니다, 수정을 실패하였습니다.");
			
			closeAll(ps, conn);
			
			
		
		
	}
	
	public ArrayList<Person> findAllPerson() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs= null;
		ArrayList<Person> temp = new ArrayList<Person>();
		
		conn = getConnect();
		
		String sql = "SELECT ssn , name, address FROM person";
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		
		// 이 rs를 어떻게 ArrayList에 넣을까요? --> 걍 때려박으세요
		
		while ( rs.next ()){
			temp.add(new Person(rs.getInt("ssn"),
					rs.getString("name"),
					rs.getString("address")));
			
		}
		
		closeAll(ps, conn);
		return temp;
	}
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, Exception{
		SimplePersonJDBCTest jdbc = new SimplePersonJDBCTest();
		jdbc.addPerson(new Person (333,"Thomas","Canada"));
		//jdbc.deletePerson(222);
//		jdbc.updatePerson(new Person(333,"Edison","SouthKorea"));
//		ArrayList<Person> returnList = jdbc.findAllPerson();
//		for(Person p : returnList) System.out.println(p);
//		
		
				
		
		
	}

}
