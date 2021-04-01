package stream.file.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

/*
 * 
 *  ���Ͽ� �Էµ� ������ �о 
 *  �Ǵٸ� ���Ϸ� ����ϴ� ������ �ۼ�
 
 	��Ʈ��
 	1. �Է� 2�� -- FileReader , BufferedReader
 	2. ��� 2�� -- FileWriter, BufferedWriter
 	
 	::
 	
 	1. ��Ʈ�� ���� -> 4�� ����
 	2. ������ ������ �о
 	3. �Ǵٸ� ���Ϸ� ��� ( Sink ) 
 	
 * 
 * 
 */
public class FileReadingAndWritingTest2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("src\\hope.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("src\\result.txt",true)); 
		// FileWriter �� boolean --> true �� �ٲٸ� �̾�Ⱑ �ȴ�.
		
		try {
			String line = null;
			while ( (line = br.readLine()) != null) {
				bw.write(line); // println ���� ���ϰ�, print ��ɸ� �����Ѵ�.
				bw.newLine();
				
			}
		bw.flush(); // auto flushing ��� --> Data�� ��Ƶ��� ���� �ԷµǴ� ���� �ٷ� ����Ѵ�.
		}finally {
			br.close();
			bw.close();
		}
		

	}

}
