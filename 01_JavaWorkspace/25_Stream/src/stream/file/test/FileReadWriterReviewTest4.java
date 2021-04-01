package stream.file.test;
/*
 *  hope.txt 파일의 문자 데이터를 읽어서 --> FileReader Character계열!
 *  다른 경로의 result.txt 파일로 문자 데이터를 출력 --> FileWriter Charcter계열 사용
 *  
 *  
 *    << 스트림 코드 작성 패턴 >>
 *    	1. 입력,출력 스트림 생성
 *    	2. 반복문 안에서 데이터를 전부다 읽어서 
 *    	3. 반복문 안에서 읽어들인 데이터를 Sink방향으로 전부다 출력
 *    		--> 문자 데이터를 출력할때는 읽어들이는 족족 출력하지 않고
 *    			일정량만큼 모아두었다가 한꺼번에 출력한다!!! 
 *    			1) auto flush --> 읽어들이는 족족 출력 flush()
 *    			2) 자원을 닫을때 그 안에 있는 데이타를 한꺼번에 출력 --> close()
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
		
		// {} 이 많을때 선언 꼭 밖에서 해주기.
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		
		try {
			br = new BufferedReader(new FileReader("src\\hope.txt"));
			// "디렉토리가 존재해야지만" 출력스트림이 생성된다. 그 안에 출력파일이 만들어진다.
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
