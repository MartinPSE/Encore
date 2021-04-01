package stream.file.test;
/*
 *  hope.txt ������ ���� �����͸� �о --> FileReader Character�迭!
 *  �ٸ� ����� result.txt ���Ϸ� ���� �����͸� ��� --> FileWriter Charcter�迭 ���
 *  
 *  
 *    << ��Ʈ�� �ڵ� �ۼ� ���� >>
 *    	1. �Է�,��� ��Ʈ�� ����
 *    	2. �ݺ��� �ȿ��� �����͸� ���δ� �о 
 *    	3. �ݺ��� �ȿ��� �о���� �����͸� Sink�������� ���δ� ���
 *    		--> ���� �����͸� ����Ҷ��� �о���̴� ���� ������� �ʰ�
 *    			��������ŭ ��Ƶξ��ٰ� �Ѳ����� ����Ѵ�!!! 
 *    			1) auto flush --> �о���̴� ���� ��� flush()
 *    			2) �ڿ��� ������ �� �ȿ� �ִ� ����Ÿ�� �Ѳ����� ��� --> close()
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


class FileReaderWriterReview{
	FileReaderWriterReview() throws IOException{
		
		// {} �� ������ ���� �� �ۿ��� ���ֱ�.
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		
		try {
			br = new BufferedReader(new FileReader("src\\hope.txt"));
			// "���丮�� �����ؾ�����" ��½�Ʈ���� �����ȴ�. �� �ȿ� ��������� ���������.
			pw = new PrintWriter("src\\printWriterResult.txt"); 
			System.out.println("1. Stream Creating");
			
			String line = null;
			System.out.println("2. FileReding & Print");
			while((line=br.readLine())!=null) pw.println(line);
		
		} finally {
			br.close();
			pw.close();
		
		}
		}
	}




public class FileReadWriterReviewTest4 {

	public static void main(String[] args) throws IOException {
		new FileReaderWriterReview();
		
	
		

	}

}
