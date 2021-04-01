package jdbc.test;
/*
 *  1. 서버와 연결하기 위해서 먼저 Driver를 메모리에 로딩
 *  
 *  2. DB 서버와 연결하기 --> 연결에 성공하면 Connection 객체가 반환된다.
 *  
 *  3. PreparedStatement를 반환 받는다. 
 *  	(2번에서 생성된 connection이 그 기능을 가지고 있다.)
 * 
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionTest1 {
	
	public DBConnectionTest1 () {
		try {
			
			// 1. 드라이버 로딩 
			String className = "com.mysql.cj.jdbc.Driver";
			Class.forName(className);
			System.out.println("<< Driver Loading Success!! >>");
			
			//2. DB 서버와 연결
			String url ="jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8";
			//             Protocol // ServerIP:Port / Schema(Database) 
			Connection conn = DriverManager.getConnection(url,"root","1234");
			System.out.println("<< DB Server Connection Success!! >>");
			
			//3. PreparedStatement 생성 -- > 쿼리문을 실행하기 위한 기능을 가지고 있는 !
			String sql = "SELECT * FROM myscott";
			PreparedStatement ps = conn.prepareStatement(sql); // SQL문이 매개변수로 들어가야한다.
			System.out.println("<< PreparedStatement Creating >>");
			
			
			//4. Query문 실행 ( SQL 문 실행 )
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+","+rs.getInt(2));
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("<< Sorry, Driver Loading failure >>");
		}catch (SQLException e) {
			System.out.println("<< Sorry DB Server Connection Error ! >>");
		}
	}

	public static void main(String[] args) {
		new DBConnectionTest1();

	}

}
