package exception.compile.test;

import java.io.FileNotFoundException;

// 1. try~ catch 2. throws !


import java.io.FileReader;
import java.io.IOException;



public class CompileExceptionTest6 {

	public static void main(String[] args) throws IOException { // �ٽ� �� JVM ���� ������!!
		String path = "C:\\encore_ohs\\util\\poem.txt";
		FileReader fr = null;
		
		System.out.println("1.FileReader ��ü�� ����..");
		
		try {
			fr = new FileReader(path);

			System.out.println("2. FileReader�� ����� �̿��ؼ� ������ ������ �о�帳�ϴ�.");
			fr.read();
		} finally
		{
			fr.close();
		}
		
		
		
		
		
		
		System.out.println("3.. ������ �� �о�鿴���ϴ�.");
		

	}

}
