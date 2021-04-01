package stream.console.test;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  1. 스트림 객체 생성 --> 입력 (ir, br) , 출력(System.out.print ... )
 *  2. while 문 안에서 계속 읽어들이고
 *  3. 읽은 데이터를 출력
 *  ::
 *  키보드로 입력한 데이터를 콘솔로 출력하는 로직 생성
 *  ::
 *  입력 --> 2개 InputStreamReader, BufferedReader.
 *  출력 X --> System.out.println() 알아서 해준다.
 *  
 */

public class KeyboardinputTest2 {

	public static void main(String[] args) throws IOException {
		
		
		
		
		// 1. 입력.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("InputSream Creating.... 키보드로 데이터 입력 \n");
		System.out.println("종료를 원하시면 exit 을 입력해주세요");
		
		
		// 2.
		String line = null;
		try {
			while( (line = br.readLine()) != null) {
				if(line.equals("exit")) {
					Toolkit tool = Toolkit.getDefaultToolkit();
					tool.beep();					
					System.out.println("시스템을 종료합니다....입력금지!");
					break;
				}
				System.out.println("Reading Data >> "+line); // 3.
			}
			
			
			
		}finally {
			br.close();
		}
		

	}

}
