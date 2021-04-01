package stream.console.test;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  1. ��Ʈ�� ��ü ���� --> �Է� (ir, br) , ���(System.out.print ... )
 *  2. while �� �ȿ��� ��� �о���̰�
 *  3. ���� �����͸� ���
 *  ::
 *  Ű����� �Է��� �����͸� �ַܼ� ����ϴ� ���� ����
 *  ::
 *  �Է� --> 2�� InputStreamReader, BufferedReader.
 *  ��� X --> System.out.println() �˾Ƽ� ���ش�.
 *  
 */

public class KeyboardinputTest2 {

	public static void main(String[] args) throws IOException {
		
		
		
		
		// 1. �Է�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("InputSream Creating.... Ű����� ������ �Է� \n");
		System.out.println("���Ḧ ���Ͻø� exit �� �Է����ּ���");
		
		
		// 2.
		String line = null;
		try {
			while( (line = br.readLine()) != null) {
				if(line.equals("exit")) {
					Toolkit tool = Toolkit.getDefaultToolkit();
					tool.beep();					
					System.out.println("�ý����� �����մϴ�....�Է±���!");
					break;
				}
				System.out.println("Reading Data >> "+line); // 3.
			}
			
			
			
		}finally {
			br.close();
		}
		

	}

}
