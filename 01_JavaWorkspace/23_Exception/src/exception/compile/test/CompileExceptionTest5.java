package exception.compile.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 *  1. 
 *  ���ܶ�� ���� �ſ� �پ��� ��Ȳ���� �߻��� �� �ִ�.
 *  �̷��� ��� ���ܸ� Exception ���� Ŭ������ �ϳ��� ó���ϴ� ���� ���� ����� �ƴϴ�.
 *  	--> ������� ����ȭ �ϴ� ���� �� ����.
 *  	--> �������� ī�װ��� ���ܴ� �Ѱ����� �����ִ� �͵� ����.
 *  	--> 
 *  
 *  
 * 
 */

public class CompileExceptionTest5 {

	public static void main(String[] args) { // ���� �� Exception���� �����ָ� �ȵ�?
		try {
			Class.forName("exception.compile.test.CompileExceptionTest5");// FQCN Full Qualified Class Name
			new FileInputStream("Hello");
			DriverManager.getConnection("aaa");
		}
		
		 catch (ClassNotFoundException e) {
			 System.out.printf("�ش� Ŭ������ ã������ �����ϴ�...  : %s%n",e.getMessage());
			
		} 
		catch (FileNotFoundException | SQLException e) {
			System.out.printf("�ش��ϴ� ���ҽ��� �����ϴ� : %s%n",e.getMessage());
			
		}
		System.out.println("���α׷� ��������");
	}
}
		
		
	
		

		
		

