package exception.compile.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 *  1. 
 *  예외라는 것은 매우 다양한 상황에서 발생할 수 있다.
 *  이럴때 모든 예외를 Exception 상위 클래스로 하나로 처리하는 것은 좋은 방법이 아니다.
 *  	--> 어느정도 세분화 하는 것이 더 좋다.
 *  	--> 공통적인 카테고리의 예외는 한가지로 묶어주는 것도 좋다.
 *  	--> 
 *  
 *  
 * 
 */

public class CompileExceptionTest5 {

	public static void main(String[] args) { // 모든걸 다 Exception으로 잡으주면 안됨?
		try {
			Class.forName("exception.compile.test.CompileExceptionTest5");// FQCN Full Qualified Class Name
			new FileInputStream("Hello");
			DriverManager.getConnection("aaa");
		}
		
		 catch (ClassNotFoundException e) {
			 System.out.printf("해당 클래스를 찾을수가 없습니다...  : %s%n",e.getMessage());
			
		} 
		catch (FileNotFoundException | SQLException e) {
			System.out.printf("해당하는 리소스가 없습니다 : %s%n",e.getMessage());
			
		}
		System.out.println("프로그램 정상종료");
	}
}
		
		
	
		

		
		

