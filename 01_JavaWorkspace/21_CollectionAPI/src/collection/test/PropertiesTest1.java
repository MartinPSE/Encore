package collection.test;

import java.util.Enumeration;
import java.util.Properties;

/*
 * System���� ž��� VM���� ȯ�溯���� ���� �ַܼ� ����ϴ� ������ �ۼ�.
 *  proporties �� �̿��Ͽ� -----> key -- value ( String -- String )
 *  
 *  1. Key ������ �����´� ---> getProperties.
 *  2. KEY�� VALUE���� �������� --> propertyNames;
 *  3. Key�� ���� value�� ���� ������ (while) --> hasMoreElements; key --> nextelement ����
 *  4. key�� ���� value�� ����. --> getProperty(key);
 */

public class PropertiesTest1 {

	public static void main(String[] args) {
		Properties p = System.getProperties();
		Enumeration e = p.propertyNames();
		while ( e.hasMoreElements()) {
			String key = (String) e.nextElement();
			String value = p.getProperty(key);
			System.out.println("SYSTEM�� KEY : " + key + "\nSYSTEM�� VALUE : " + value);
			
			
			
		}
			
		
		
		
		}
			
		
				

		}




