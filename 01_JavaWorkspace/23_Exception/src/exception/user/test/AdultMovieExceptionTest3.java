package exception.user.test;

import java.util.Scanner;

/*
 * 사용자 정의 Exception
 * 1. 예외 클래스를 내가 직접 작성해서 사용
 * 		class A extends Exception {}
 * 
 * 2.  강력한 "제어문"으로 사용됨
 * 		특정한 조건이 형성되면 예외를 고의적으로 생성시켜서 프로그램을 핸들링.
 * 
 * 	----------------------------------------
 * 	성인영화를 관람하는데 나이가 19세가 안되는 사람이
 * 	극장에 입장하는 경우, 입장을 허용 X / 19세 이상만!!
 * 
 * 	--> 
 * 	UnderAgeException !
 */


class UnderAgeException extends Exception {
	// 생성자 오버로딩 !
	UnderAgeException() {
		this("19세 나이가 안되면 영화 관람이 불가능합니다.");
	}
	
	UnderAgeException(String message) {
		super(message);
		
	}
	
}

class AdultMovieService{
	public void entrance(int age) throws UnderAgeException {
		if(age < 20) throw new UnderAgeException();{
			System.out.println("바보야");// 나이가 19세가 안되면 == > 예외 객체 생성
		}
		
		System.out.println("즐거운 영화관람 되십시오.");
		}
		
	}





public class AdultMovieExceptionTest3 {

	public static void main(String[] args) {
		AdultMovieService adult = new AdultMovieService();
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		
		try {
			adult.entrance(age);
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
