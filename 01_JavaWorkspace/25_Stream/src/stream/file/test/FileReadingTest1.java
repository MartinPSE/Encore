package stream.file.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingTest1 {

	public static void main(String[] args) throws IOException {
		// 1. 스트림생성 -- 입력 2개 ( FileReader, BufferedReader)
		// 2.
		BufferedReader br = new BufferedReader(new FileReader("src\\hope.txt"));
		try {
			String line = null;
			while ((line = br.readLine()) != null ) {
				System.out.println(line);
				
			}	
			
		} finally {
			br.close();
			
		}
		

	}

}
