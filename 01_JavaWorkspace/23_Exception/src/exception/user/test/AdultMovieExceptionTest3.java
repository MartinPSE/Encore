package exception.user.test;

import java.util.Scanner;

/*
 * ����� ���� Exception
 * 1. ���� Ŭ������ ���� ���� �ۼ��ؼ� ���
 * 		class A extends Exception {}
 * 
 * 2.  ������ "���"���� ����
 * 		Ư���� ������ �����Ǹ� ���ܸ� ���������� �������Ѽ� ���α׷��� �ڵ鸵.
 * 
 * 	----------------------------------------
 * 	���ο�ȭ�� �����ϴµ� ���̰� 19���� �ȵǴ� �����
 * 	���忡 �����ϴ� ���, ������ ��� X / 19�� �̻�!!
 * 
 * 	--> 
 * 	UnderAgeException !
 */


class UnderAgeException extends Exception {
	// ������ �����ε� !
	UnderAgeException() {
		this("19�� ���̰� �ȵǸ� ��ȭ ������ �Ұ����մϴ�.");
	}
	
	UnderAgeException(String message) {
		super(message);
		
	}
	
}

class AdultMovieService{
	public void entrance(int age) throws UnderAgeException {
		if(age < 20) throw new UnderAgeException();{
			System.out.println("�ٺ���");// ���̰� 19���� �ȵǸ� == > ���� ��ü ����
		}
		
		System.out.println("��ſ� ��ȭ���� �ǽʽÿ�.");
		}
		
	}





public class AdultMovieExceptionTest3 {

	public static void main(String[] args) {
		AdultMovieService adult = new AdultMovieService();
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է����ּ���");
		int age = sc.nextInt();
		
		try {
			adult.entrance(age);
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
