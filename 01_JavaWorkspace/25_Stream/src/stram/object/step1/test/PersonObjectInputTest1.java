package stram.object.step1.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 
 *  ������ȭ �ڵ� (DeSerialziation)
 *  ������ person.obj ������ ������ �о�ͼ� 
 *  �ַܼ� ������ ���
 * 
 */


public class PersonObjectInputTest1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File f = new File("C:"+File.separator+"objfile"+File.separator+"person.obj");

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		System.out.println("ObjectInputStream Creating");
		
		Person p = (Person) ois.readObject(); // ĳ���� ���־���Ѵ�.
		System.out.println(p);
		
	}

}
