package exception.user.test;

import java.util.Scanner;

	
class User{
	public void go() throws ArithmeticException{
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է����ּ���!>>");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		// j ���� 0�̸� ���ܸ� ���������� �߻����Ѽ� ���̻� ������� �ʵ��� ó��.
		// ��������� Exception���� throw�� �������!
		if ( j == 0) throw new ArithmeticException();{
			System.out.println("�Է��Ͻ� j���� 0�� �� �� �����ϴ�.");
			
		}
		// �Ʒ��κп��� i/j --> j�� �и� �Ǵ� ������ ����ȴٰ� ����
		
		
		
	}
}
	
public class UserExceptionTest1 {

	public static void main(String[] args) {
		User user = new User();
		try {
		user.go();
		System.out.println("2. ��ź�� �̰����� ����Խ��ϴ�..");
		}
		catch(ArithmeticException e) {
			System.out.println("3. ��ź ó�� ����");
		}
		System.out.println("4. ���α׷��� ���� ����˴ϴ�.");
	}
	 

}



