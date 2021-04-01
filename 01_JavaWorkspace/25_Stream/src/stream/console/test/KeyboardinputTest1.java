package stream.console.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  Keyboard(Source)로 읽어들인 데이터를 Console(sink)로 출력하는 로직
 *  
 	소스코드 패턴
 		1. 스트림 객체 생성
 		2. 읽어들인다 . ( 입력 )
 		3. 콘솔로 출력한다. ( 출력 ) 
 		4. 그리고 마지막에 문을 닫아주어야 한다. finally를 이용해서!
 	
 * 
 * 
 */
public class KeyboardinputTest1 {

	public static void main(String[] args) {
		// 1. 입력 스트림만 필요! ... 2개 ( 기본 (node), 보조 (filter) )
		System.out.println("1. 스트림 생성 ");
		// InputStreamReader 를 raping 해서 BufferedReader 랑 2이 1셋트 처럼 사용
		
		InputStreamReader ir = new InputStreamReader(System.in); // 기본
		BufferedReader br = new BufferedReader(ir); // 보조
		
		// 2. 생성한 스트림의 기능을 사용 !! --> 읽어들인다.
		System.out.println("2. 데이터를 읽어들인다.");
		try {
			String line = br.readLine();	// 무조건 IOException Error 를 껴앉고 있어.
			while (line != null ) {
				// 3. 읽어들인 데이터를 콘솔로 출력한다.
				//		System.out <- 알아서 출력 스트림을 해준다!!
				System.out.println("Reading Data :: " + line);
				line = br.readLine(); // 이 부분이 더 추가되어야 계속 읽어서 출력한다.
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 3. 읽어들인 데이터를 콘솔로 출력한다.
		//		System.out <- 알아서 출력 스트림을 해준다!!
		//		System.out.println("Reading Data :: " + line);
		
		finally {
			try {
				br.close();
			} catch (IOException e) {
			}
		}
		

	}

}
