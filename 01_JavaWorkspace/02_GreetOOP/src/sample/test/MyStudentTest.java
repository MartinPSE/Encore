package sample.test;
/*
 *  1. MyStudent ��ü ���� -> ms�� �̸�����
 *  2. MyStudent�� �޼ҵ� ���� ���Ѽ� ��� Ȯ�� 
 */

import sample.MyStudent;

public class MyStudentTest {

	public static void main(String[] args) {
		
		MyStudent ms = new MyStudent();
		
		//2. Field�� ���� --> �� �Ҵ� // ���� ���� ������.
		// Program �� �������� �ϵ��ڵ� �Ǹ��� ���α׷��� �ƴϴ�.
		ms.name = "������";
		ms.age = 28;
		ms.address = "�ٻ굿";
		
		// Method�� ���� --> Calling 
		ms.printInfo();

	}

}
