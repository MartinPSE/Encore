package stram.object.step1.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 
 *  역직렬화 코드 (DeSerialziation)
 *  생성된 person.obj 파일의 내용을 읽어와서 
 *  콘솔로 정보를 출력
 * 
 */


public class PersonObjectInputTest1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File f = new File("C:"+File.separator+"objfile"+File.separator+"person.obj");

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		System.out.println("ObjectInputStream Creating");
		
		Person p = (Person) ois.readObject(); // 캐스팅 해주어야한다.
		System.out.println(p);
		
	}

}
