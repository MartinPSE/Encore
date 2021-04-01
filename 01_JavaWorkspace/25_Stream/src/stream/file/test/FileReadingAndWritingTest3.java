package stream.file.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 

	��¿��� PrintWriter �� BufferedWriter ���� �ξ� �� ���� API!!!!

 * 
 * 
 */
public class FileReadingAndWritingTest3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("src\\hope.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("src\\resultPrintWriter.txt"));
//		PrintWriter pw = new PrintWriter("src\\resultPrintWriter.txt");
		
		// FileWriter �� boolean �� true �� Ű�� --> �̾�Ⱑ �ǰ�
		// PrintWriter �� boolean �� true �� Ű�� --> ����Ⱑ �ȴ�.
		
		try {
			String line = null;
			while ( (line = br.readLine()) != null) {
				pw.println(line);
				
			}
		}finally {
			br.close();
			pw.close();
		}
		

	}

}
