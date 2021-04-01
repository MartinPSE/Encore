package jdbc.step3.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import config.ServerInfo;

/*
 	DB Access 하기 위한 4단계 작업을 작성하는 로직 --> Business Logic 이라고 한다. ( DatabaseAccessObject )
 	
 	Step1. DB Server에 대한 파편적인 정보 (서버 실제 값)들을 '상수' 값으로 지정.
 	Step2. Driver Loading 
 	Step3. DB Server connection
 	Stpe4. PreparedStatement 생성
 	Step5. Query문 실행
 
 
 	---------------- 하지만 문제가 있어 ------------------
 	서버 정보가 그대로 노출되어져 있다.

 	'서버 실제값' 이 하드코딩 되고 있어
 			-> '외부 자원'으로 모듈화 시켜야한다. ( Extra Resource )
 			            <"metadata화">
 	------------------ Solution --------------------
 	상수값과 추상메소드를 구상요소로 가지는 'Interface'를 별도의 모듈로 생성하고
 		그 안에 '서버 정보'를 'metadata화' 시킨다.
  
    자바 진영에서 가장 많이 사용하는 Meta Data는
  	'Properties'파일이다. 
  		Key - Value 값을 모두 스트링으로 저장할 수 있다는 특징에 착안되어져있다.
  		서버정보를 저장하는 '메타데이터'로 가장 많이 사용되어진다.
  		config < db.properties 
  
  
 */





public class JDBC4StepTest3 {
	
	static String driver;
	static String url;
	static String user;
	static String pass;
	static String query;
	


	
	public JDBC4StepTest3() throws ClassNotFoundException  {
		
		try { 
			
			
			Connection conn = DriverManager.getConnection(url,user,pass);
			System.out.println("<< DB Server Connection Complete >>");
			

			PreparedStatement ps1 = conn.prepareStatement(query);
			
			ResultSet rs = ps1.executeQuery();
			System.out.println("================== Table 의 전체 Data 출력 ==================");
			while (rs.next()) { // Column 명으로 해도 된다. 
				System.out.println("고유번호 : " +rs.getInt("num")+", 이름 : " +rs.getString("NAME")+", 사는곳 : " + rs.getString("ADDRESS"));
			}
				
			
		}catch( SQLException e) {
			System.out.println("<<< DB Server Connection Error >>");
		}
		
		

	
	}

	public static void main(String[] args) throws ClassNotFoundException {
		new JDBC4StepTest3();
	}
	
	static { 
		// 1. Properties 파일의 내용을 로드해온다.
		try {
		Properties p = new Properties();
			p.load(new FileInputStream("src/config/db.properties"));
			
			
			driver = p.getProperty("jdbc.mysql.driver");
			url = p.getProperty("jdbc.mysql.url");
			user = p.getProperty("jdbc.mysql.user");
			pass = p.getProperty("jdbc.mysql.pass");
			query = p.getProperty("jdbc.sql.selectAll");
			
			Class.forName(driver);
			System.out.println("<< Driver Loading Complete >>");
			
			
		} catch (Exception e) {
			
		}
		
	}
		

}
