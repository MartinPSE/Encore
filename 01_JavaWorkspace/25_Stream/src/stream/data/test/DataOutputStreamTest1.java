package stream.data.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 
   1. ������ �������� ���Ϸ� ����ϴ� �ڵ带 �ۼ�
  	  ���࿡ score.dat ���� ������ �������� �ʾƼ� ��µ��� �����޼����� ����
  	  ����Ʈ �迭 ��Ʈ���� ��µǴ� ������ ������ ���ڱ���� �ƴ�, Binary Data(���� ������) �̱⿡
  	  ���� ������� ���Ƶ� �� �� ���� �������� ������.
  	  �׷��� �ᱹ �̸� Ȯ���ϱ� ���ؼ��� 
  	  scrre.dat���Ͽ� ��µ� Binary Data�� �ٽ� DataInputStream�� ���ؼ� �ڹ� �⺻�� (int)����
  	  �ڵ���ȯ���Ѽ� �о�鿩�� �Ѵ�.
  	  
 * 
 * 
 */

public class DataOutputStreamTest1 {

	public static void main(String[] args) throws IOException {
		int [] scores = {100,90,70,75,66}; // ���� ����� �ƴ� Byte�迭 ��Ʈ�� ���
											// ��� ��Ʈ�� ��� �ؾ���! (FileOutputStream)
		String outFile = "src\\scores.dat";
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
		
		System.out.println("score.data������ �����Ǿ����ϴ�.");
		
		//2. �迭�ȿ� ����ִ� ������ ������ ���Ϸ� ���. writeInt()
		for (int score: scores) {
			dos.writeInt(score); // BinaryData�� �ѷ����Եȴ�.
			
		}
		

	}

}
