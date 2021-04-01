package jdbc.step1.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 	DB Access 하기 위한 4단계 작업을 작성하는 로직 --> Business Logic 이라고 한다. ( DatabaseAccessObject )
 	
 	Step1. DB Server에 대한 파편적인 정보 (서버 실제 값)들을 '상수' 값으로 지정.
 	Step2. Driver Loading 
 	Step3. DB Server connection
 	Stpe4. PreparedStatement 생성
 	Step5. Query문 실행
 
 
 	---------------- 하지만 문제가 있어 ------------------
*/




public class JDBC4StepTest {
	// Step 1.
	
	public static String Driver = "com.mysql.cj.jdbc.Driver";
	public static String URL = "jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8";
	public static String USER = "root";
	public static String PASSWORD = "1234";
	

	
	public JDBC4StepTest() {
		
		try { // Step 03. 
			
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("<< DB Server Connection Complete >>");
			
			// Step 04. 
//			String queryupdate = "UPDATE mytable SET name=?, address=? WHERE num=?";
//			PreparedStatement ps = conn.prepareStatement(queryupdate);
//			
//			ps.setString(1, "한소희");
//			ps.setString(2, "서초동");
//			ps.setInt(3, 111 );
////			
//			
//			int row = ps.executeUpdate();
//			System.out.println(row+"(명)이 업데이트되었습니다.");
			
			
			
			// 
			String sql = "SELECT num,name,address FROM mytable"; // SELECT * FROM 사용 자제하자요!
			PreparedStatement ps1 = conn.prepareStatement(sql);
			ResultSet rs = ps1.executeQuery();
			System.out.println("================== Table 의 전체 Data 출력 ==================");
			while (rs.next()) { // Column 명으로 해도 된다. 
				System.out.println("고유번호 : " +rs.getInt("num")+", 이름 : " +rs.getString("NAME")+", 사는곳 : " + rs.getString("ADDRESS"));
			}
			
			
			
			// Step 05. 
			
			
			
		}catch( SQLException e) {
			System.out.println("<<< DB Server Connection Error >>");
		}
		
		

	
	}

	public static void main(String[] args) {
		new JDBC4StepTest();
	}
	
	static { // Step 2.
		try {
			Class.forName(Driver);
			System.out.println("<< Drvier Loading Complete >>");
		} catch (ClassNotFoundException e) {
			System.out.println("<<<< Driver Loading Error >>>>");
		}
		
	}

}
