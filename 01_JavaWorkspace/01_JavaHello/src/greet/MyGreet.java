package greet; // package 선언 -> 소스코드 최상단, 이름은 무조건 소문자로, 분류는 . 사용해서 

public class MyGreet {
	
	
	public static void main(String[] args) {
		System.out.println("Hello Java");
	
	} // main () { method }  -> 무슨일을 하는지 기술

}

/*
 * 01 프로젝트의 문제점 
 * :: Hello Java라는 인삿말만 출력하는 코드가 생산된다.
 *  다른 인삿말을 출력하려면 다시 코드를 수정해야 한다.
 *  --> 유지보수성, 재사용성이 낮은 코드 
 */

// package 에선 --> .class 가 들어가서 작동하게된다. (기계어) 
// package greet.vo; -> greet에 vo라는 package // . <- package의 상,하관계를 구분해준다. 
// 자바는 OOP -> Object Oriented Programming // 객체지향형 프로그래밍!!

