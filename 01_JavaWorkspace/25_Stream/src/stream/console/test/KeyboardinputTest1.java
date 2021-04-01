package stream.console.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  Keyboard(Source)�� �о���� �����͸� Console(sink)�� ����ϴ� ����
 *  
 	�ҽ��ڵ� ����
 		1. ��Ʈ�� ��ü ����
 		2. �о���δ� . ( �Է� )
 		3. �ַܼ� ����Ѵ�. ( ��� ) 
 		4. �׸��� �������� ���� �ݾ��־�� �Ѵ�. finally�� �̿��ؼ�!
 	
 * 
 * 
 */
public class KeyboardinputTest1 {

	public static void main(String[] args) {
		// 1. �Է� ��Ʈ���� �ʿ�! ... 2�� ( �⺻ (node), ���� (filter) )
		System.out.println("1. ��Ʈ�� ���� ");
		// InputStreamReader �� raping �ؼ� BufferedReader �� 2�� 1��Ʈ ó�� ���
		
		InputStreamReader ir = new InputStreamReader(System.in); // �⺻
		BufferedReader br = new BufferedReader(ir); // ����
		
		// 2. ������ ��Ʈ���� ����� ��� !! --> �о���δ�.
		System.out.println("2. �����͸� �о���δ�.");
		try {
			String line = br.readLine();	// ������ IOException Error �� ���ɰ� �־�.
			while (line != null ) {
				// 3. �о���� �����͸� �ַܼ� ����Ѵ�.
				//		System.out <- �˾Ƽ� ��� ��Ʈ���� ���ش�!!
				System.out.println("Reading Data :: " + line);
				line = br.readLine(); // �� �κ��� �� �߰��Ǿ�� ��� �о ����Ѵ�.
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 3. �о���� �����͸� �ַܼ� ����Ѵ�.
		//		System.out <- �˾Ƽ� ��� ��Ʈ���� ���ش�!!
		//		System.out.println("Reading Data :: " + line);
		
		finally {
			try {
				br.close();
			} catch (IOException e) {
			}
		}
		

	}

}
