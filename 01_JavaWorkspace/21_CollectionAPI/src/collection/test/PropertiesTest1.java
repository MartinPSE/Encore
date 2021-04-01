package collection.test;

import java.util.Enumeration;
import java.util.Properties;

/*
 * System위에 탑재된 VM관련 환경변수들 값을 콘솔로 출력하는 로직을 작성.
 *  proporties 를 이용하여 -----> key -- value ( String -- String )
 *  
 *  1. Key 값들을 가져온다 ---> getProperties.
 *  2. KEY와 VALUE들을 가져오자 --> propertyNames;
 *  3. Key에 따른 value가 없을 때까지 (while) --> hasMoreElements; key --> nextelement 도출
 *  4. key에 따른 value를 도출. --> getProperty(key);
 */

public class PropertiesTest1 {

	public static void main(String[] args) {
		Properties p = System.getProperties();
		Enumeration e = p.propertyNames();
		while ( e.hasMoreElements()) {
			String key = (String) e.nextElement();
			String value = p.getProperty(key);
			System.out.println("SYSTEM의 KEY : " + key + "\nSYSTEM의 VALUE : " + value);
			
			
			
		}
			
		
		
		
		}
			
		
				

		}




