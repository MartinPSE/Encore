package sample.test;

import sample.MyStudent2;

/*
 *  MyStudentTest.java�� ������
 * ::
 * �л����� �þ������ 
 * ������ �ʵ忡 �ش��ϴ� ���� ���� �־���� �ϴ� ���ŷο��� �ִ�.
 
 * ���α׷��� �ۼ��� �������� �ϵ��ڵ� �Ǿ����� �ȵȴ�.
   ::
   �ذ�å?
   1) �ʵ忡 ���� ���� ������ �ȵȴ�. 
   2) ���� �ʵ忡 �ԷµǴ� ����� ���Ӱ� �ϳ� �����غ���.
 */

public class MyStudentTest2 {

	public static void main(String[] args) {
		MyStudent2 m1 = new MyStudent2();
		MyStudent2 m2 = new MyStudent2();
		MyStudent2 m3 = new MyStudent2();

		m1.setField("������", 28,"�ٻ굿");
		m2.setField("������", 30,"�ٻ�1��");
		m3.setField("ĥ����", 32,"�ٻ�2��");
			
		m1.printInfo();
		m2.printInfo();
		m3.printInfo();
		
		
		/*
		 * 1. MyStudent2 ��ü�� 3�� ����... m1 / m2 / m3
		 * ���� ��ü�� ���� �Ҵ�.. �ʵ� �ʱ�ȭ
		 * ���� ��ü�� ������ �ܼ�â���� ���
		 * 
		 */
	}
}
