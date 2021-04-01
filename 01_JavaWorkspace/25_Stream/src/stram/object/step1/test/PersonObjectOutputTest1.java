package stram.object.step1.test;
/*
 * 
 *  ====== Serialization(직렬화) ======
 *    ====== < Data UnPack > ======
 *    Person객체의 정보를(필드값) 다른 곳(Sink::person.obj)으로 날리는 로직을 작성.
 *    1. Stream 객체를 생성(ObjectOutputStream | FileOuPutStream 
 *    2. 날린다.. 뿌린다.. 출력한다.. --- ObjectOuptutStream의 기능을 사용 ( writeObject(객체명) )
 *    
 *    
 *  
 * 
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonObjectOutputTest1 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:"+File.separator+"objfile"+File.separator+"person.obj");
		f.getParentFile().mkdirs();
		
		//1.
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		
		
		//2. 객체 생성
		Person p = new Person("김연아", 30,"2233","여의도");
		oos.writeObject(p); // sink 쪽으로 날라간다.
		
		//3. 
		oos.close(); // 문 닫고 나오자.
		System.out.println("person.obj 파일이 생성...확인....");
		System.out.println("정보가 정확하게 출력되었는지는 추후에 역직렬화해서 정보를 확인!");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		
		
		
		

	}

}
