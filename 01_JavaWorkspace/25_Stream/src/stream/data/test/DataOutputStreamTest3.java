package stream.data.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.crypto.Data;

/*
 *  scores.data ������ ������ readInt()�� �о�鿩��
 *  ������ ������ ����ϰ� --> ��� ������ ������ ���ϴ� ������ �ۼ�.
 *  --------------------------------------------------------
 *  EOFException �� ������ ������ �������� �ʰ�, ����������� �������� ������
 *  main method ����ο��� throws�� ������ �� ����.
 *  --------------------------------------------------------
 *  main method ����ο��� throws�� ���ܸ� ������ main�� ȣ���� ��(JVM)����
 *  ���ܸ� ó�� �� �� �ִ� ���� 'CompileException' �迭���� �����ϴ�.
 *  
 *  Exception �� �����ͺ��� <<<< ū�� ������ ��ƾ� �Ѵ�.
 *  
 * 
 * 
 */


public class DataOutputStreamTest3 {

	public static void main(String[] args) throws IOException {
		int sum = 0;
		int score = 0;
		DataInputStream dis = null;
		
		//1. ��Ʈ�� ����
		try {
			
			dis = new DataInputStream(new FileInputStream("src\\scores.dat"));
			System.out.println("Stream Creating");
			
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
			
		}catch(EOFException e){ // File�� ���� �������ϱ�
			System.out.println("��� ������ ������ " + sum + "�� �Դϴ�.");
			
		}finally {
			dis.close();
		}
		
		
	}

}
