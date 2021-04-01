package exception.compile.test;


// 1. try~ catch 2. throws !


import java.io.FileReader;
import java.io.IOException;


public class CompileExceptionTest4 {

	public static void main(String[] args)  { // 다시 또 JVM 으로 던지자!!
		
		String path = "C:\\encore_ohs\\util\\poem.txt";
		FileReader fr = null;
		
		System.out.println("1. FileReader 객체를 생성.");
		try {
			fr = new FileReader(path);
			System.out.println("2. FileReader의 기능을 이용해서 파일의 내용을 읽어들인다.");
			fr.read();
			
			
		}  
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				fr.close(); // 상당히 중요한 코드!! < reading 했으면(즉 문을 열었으면) 무조건 닫아줘야 한다 >
			} 
			catch (IOException e) {
				
			} 
		}
		
	
		
		

	}

}
