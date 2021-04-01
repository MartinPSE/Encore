package config;  // package명은 config --> Convention.


// 메타데이터화!!

public interface ServerInfo {
	// public static final 이 생략되어있다.
	
	 String Driver = "com.mysql.cj.jdbc.Driver";
	 String URL = "jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8";
	 String USER = "root";
	 String PASSWORD = "1234";
	
	
	
}
