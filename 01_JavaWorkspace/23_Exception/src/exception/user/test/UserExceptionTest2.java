package exception.user.test;

import java.util.Scanner;

import exception.user.vo.ZeroDivide;

	
class User2{
	public void go() throws ZeroDivide{
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է����ּ���!>>");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		// j ���� 0�̸� ���ܸ� ���������� �߻����Ѽ� ���̻� ������� �ʵ��� ó��.
		// ��������� Exception���� throw�� �������!
		if ( j == 0) throw new ZeroDivide("�Է��Ͻ� j���� 0�� �� �� �����ϴ�.");
		
		// �Ʒ��κп��� i/j --> j�� �и� �Ǵ� ������ ����ȴٰ� ����
		
		
		
	}
}
	
public class UserExceptionTest2 {

	public static void main(String[] args) {
		User2 user = new User2();
		try {
		user.go();
		System.out.println("2. ��ź�� �̰����� ����Խ��ϴ�..");
		}
		catch(ZeroDivide e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("4. ���α׷��� ���� ����˴ϴ�.");
	}
	 

}



