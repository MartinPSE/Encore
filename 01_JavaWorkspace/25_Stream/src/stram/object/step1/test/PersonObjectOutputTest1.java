package stram.object.step1.test;
/*
 * 
 *  ====== Serialization(����ȭ) ======
 *    ====== < Data UnPack > ======
 *    Person��ü�� ������(�ʵ尪) �ٸ� ��(Sink::person.obj)���� ������ ������ �ۼ�.
 *    1. Stream ��ü�� ����(ObjectOutputStream | FileOuPutStream 
 *    2. ������.. �Ѹ���.. ����Ѵ�.. --- ObjectOuptutStream�� ����� ��� ( writeObject(��ü��) )
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
		
		
		//2. ��ü ����
		Person p = new Person("�迬��", 30,"2233","���ǵ�");
		oos.writeObject(p); // sink ������ ���󰣴�.
		
		//3. 
		oos.close(); // �� �ݰ� ������.
		System.out.println("person.obj ������ ����...Ȯ��....");
		System.out.println("������ ��Ȯ�ϰ� ��µǾ������� ���Ŀ� ������ȭ�ؼ� ������ Ȯ��!");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		
		
		
		

	}

}
