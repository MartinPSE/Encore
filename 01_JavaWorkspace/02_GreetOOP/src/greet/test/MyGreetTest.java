package greet.test;

import greet.MyGreet;

/*
 * MyGreet Ŭ������ �޼ҵ带 ���۽�Ű�� ���� Ŭ���� ... Test 
 
 * 1. Ŭ���� ��ü�� ���� == �ı�(�������)���� �޸𸮿� �ö󰣴�.
 * 2. ����
 *     1) �ʵ� - - -  ���� �Ҵ��Ѵ�. 
 *     2) �޼ҵ� - - - ȣ�� ( Calling ) 
 */
public class MyGreetTest {

	public static void main(String[] args) {
		
		// ��ü�� ����
		/*
		 * �޸𸮿� mg��� �̸����� ��ü�� �ö󰣴�.
		 * Ŭ������ �ı����� �ö󰣴�. 
		 * -> 2�� ..(�ʵ�, �޼ҵ�) 
		 
		 * �޸� �ø��� ���� (��ü �����ϴ� ����)??
		 * �޸� �ö� �ֵ鸸 �����ؼ� ����� �� �ִ�.
		 */
		MyGreet mg = new MyGreet();
		mg.sayHello("������"); // Calling 

	}

}
