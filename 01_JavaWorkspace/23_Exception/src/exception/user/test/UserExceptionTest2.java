package exception.user.test;

import java.util.Scanner;

import exception.user.vo.ZeroDivide;

	
class User2{
	public void go() throws ZeroDivide{
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력해주세요!>>");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		// j 값이 0이면 예외를 고의적으로 발생시켜서 더이상 진행되지 않도록 처리.
		// 사용자정의 Exception에선 throw를 사용해줘!
		if ( j == 0) throw new ZeroDivide("입력하신 j값은 0이 될 수 없습니다.");
		
		// 아랫부분에서 i/j --> j가 분모가 되는 연산이 진행된다고 가정
		
		
		
	}
}
	
public class UserExceptionTest2 {

	public static void main(String[] args) {
		User2 user = new User2();
		try {
		user.go();
		System.out.println("2. 폭탄이 이곳으로 날라왔습니다..");
		}
		catch(ZeroDivide e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("4. 프로그램이 정상 종료됩니다.");
	}
	 

}



