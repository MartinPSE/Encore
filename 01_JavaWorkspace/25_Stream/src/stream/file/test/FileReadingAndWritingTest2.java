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
 *  파일에 입력된 내용을 읽어서 
 *  또다른 파일로 출력하는 로직을 작성
 
 	스트림
 	1. 입력 2개 -- FileReader , BufferedReader
 	2. 출력 2개 -- FileWriter, BufferedWriter
 	
 	::
 	
 	1. 스트림 생성 -> 4개 생성
 	2. 파일의 내용을 읽어서
 	3. 또다른 파일로 출력 ( Sink ) 
 	
 * 
 * 
 */
public class FileReadingAndWritingTest2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("src\\hope.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("src\\result.txt",true)); 
		// FileWriter 의 boolean --> true 로 바꾸면 이어쓰기가 된다.
		
		try {
			String line = null;
			while ( (line = br.readLine()) != null) {
				bw.write(line); // println 하지 못하고, print 기능만 수행한다.
				bw.newLine();
				
			}
		bw.flush(); // auto flushing 기능 --> Data를 모아두지 말고 입력되는 족족 바로 출력한다.
		}finally {
			br.close();
			bw.close();
		}
		

	}

}
