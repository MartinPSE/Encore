package exception.compile.test;


// 1. try~ catch 2. throws !


import java.io.FileReader;
import java.io.IOException;


public class CompileExceptionTest4 {

	public static void main(String[] args)  { // �ٽ� �� JVM ���� ������!!
		
		String path = "C:\\encore_ohs\\util\\poem.txt";
		FileReader fr = null;
		
		System.out.println("1. FileReader ��ü�� ����.");
		try {
			fr = new FileReader(path);
			System.out.println("2. FileReader�� ����� �̿��ؼ� ������ ������ �о���δ�.");
			fr.read();
			
			
		}  
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				fr.close(); // ����� �߿��� �ڵ�!! < reading ������(�� ���� ��������) ������ �ݾ���� �Ѵ� >
			} 
			catch (IOException e) {
				
			} 
		}
		
	
		
		

	}

}
