package exception.compile.test;

import java.io.FileNotFoundException;

// 1. try~ catch 2. throws !


import java.io.FileReader;
import java.io.IOException;



public class CompileExceptionTest6 {

	public static void main(String[] args) throws IOException { // 다시 또 JVM 으로 던지자!!
		String path = "C:\\encore_ohs\\util\\poem.txt";
		FileReader fr = null;
		
		System.out.println("1.FileReader 객체를 생성..");
		
		try {
			fr = new FileReader(path);

			System.out.println("2. FileReader의 기능을 이용해서 파일의 내용을 읽어드립니다.");
			fr.read();
		} finally
		{
			fr.close();
		}
		
		
		
		
		
		
		System.out.println("3.. 파일을 잘 읽어들였습니다.");
		

	}

}
