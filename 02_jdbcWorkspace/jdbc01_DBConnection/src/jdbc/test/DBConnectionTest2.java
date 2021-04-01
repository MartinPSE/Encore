package jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 
 *  DB Server 정보에 해당하는 것들을 상수값으로 세팅.
   	1. 드라이버 FQCN --> 이게 무조건 우선적으로 작동 후에 나머지 작업 진행
   	
   	2. 서버주소, 계정이름, 비번 ....
   	
 
 *  
 */


public class DBConnectionTest2 {
	
	public static String Driver = "com.mysql.cj.jdbc.Driver";
	public static String URL = "jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8";
	public static String USER = "root";
	public static String PASSWORD = "1234";
	
	
	
	
	
	public DBConnectionTest2 () {
		// JDBC 기본 작업 진행 --> 2,3,4 단계 작업을 진행!
		
		try {
			// 2. DB 연결
			Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("<< DB 서버 연결 성공 >>");
			
			// 3. PreparedStatement 생성
			String insertQuery = "INSERT INTO mytable VALUES(?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(insertQuery);
			System.out.println("<< PreparedStatement 생성 >>");
			
			// 4. 값 바인딩 및 쿼리 문 실행
			ps.setInt(1, 111); // 1번째 물음표에 111 넣는다.
			ps.setString(2, "오형석"); // 2 번째 물음표에 '오형석' 넣는다.
			ps.setString(3, "여의도"); // 3 번째 물음표에 '여의도'를 넣자
			
//			int row = ps.executeUpdate(); // 업데이트(추가) 된 row의 갯수가 반환
//			System.out.println(row+" 명 추가됐습니다.");
			
			String deleteQuery = "DELETE FROM mytable where name=?";
			PreparedStatement ps2 = conn.prepareStatement(deleteQuery);
			ps2.setString(1, "오형석");
			System.out.println(ps2.executeUpdate() +"명 삭제됐습니다.");

			
			
		}catch (Exception e) {
			System.out.println("<<<<<<<< ERROR >>>>>>>>");
		}

			}
	
	public static void main(String[] args) {
		new DBConnectionTest2();

	}
	static {
		// 1. Driver 로딩 작업 --> public 보다 먼저 돌아가니깐
		try {
			Class.forName(Driver);
			System.out.println("<< Driver Loading Success!! >>");
		} catch (ClassNotFoundException e) {
			System.out.println("<<<<<<<<<<<< ERROR >>>>>>>>>>>>");
		}
		
		
		
	}

}
