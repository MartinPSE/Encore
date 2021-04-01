package stream.file.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 

	출력에선 PrintWriter 가 BufferedWriter 보다 훨씬 더 좋은 API!!!!

 * 
 * 
 */
public class FileReadingAndWritingTest3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("src\\hope.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("src\\resultPrintWriter.txt"));
//		PrintWriter pw = new PrintWriter("src\\resultPrintWriter.txt");
		
		// FileWriter 의 boolean 을 true 로 키면 --> 이어쓰기가 되고
		// PrintWriter 의 boolean 을 true 로 키면 --> 덮어쓰기가 된다.
		
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
