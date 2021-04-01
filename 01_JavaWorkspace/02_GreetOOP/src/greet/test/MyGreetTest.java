package greet.test;

import greet.MyGreet;

/*
 * MyGreet 클래스의 메소드를 동작시키는 실행 클래스 ... Test 
 
 * 1. 클래스 객체를 생성 == 식구(구성요소)들이 메모리에 올라간다.
 * 2. 접근
 *     1) 필드 - - -  값을 할당한다. 
 *     2) 메소드 - - - 호출 ( Calling ) 
 */
public class MyGreetTest {

	public static void main(String[] args) {
		
		// 객체를 생성
		/*
		 * 메모리에 mg라는 이름으로 객체가 올라간다.
		 * 클래스의 식구들이 올라간다. 
		 * -> 2개 ..(필드, 메소드) 
		 
		 * 메모리 올리는 이유 (객체 생성하는 이유)??
		 * 메모리 올라간 애들만 접근해서 사용할 수 있다.
		 */
		MyGreet mg = new MyGreet();
		mg.sayHello("오형석"); // Calling 

	}

}
