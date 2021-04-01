package sample.test;
/*
 *  1. MyStudent 객체 생성 -> ms란 이름으로
 *  2. MyStudent의 메소드 동작 시켜서 결과 확인 
 */

import sample.MyStudent;

public class MyStudentTest {

	public static void main(String[] args) {
		
		MyStudent ms = new MyStudent();
		
		//2. Field에 접근 --> 값 할당 // 값을 직접 넣지마.
		// Program 은 실제값이 하드코딩 되면은 프로그램이 아니다.
		ms.name = "오형석";
		ms.age = 28;
		ms.address = "다산동";
		
		// Method에 접근 --> Calling 
		ms.printInfo();

	}

}
