package com.encore.test;

public class SwitchNoBreakTest3 {
	public static void main(String[] args) { // 실행 Method 
		/*
		 *  1. 객체생성  == 식구를 메모리에 올린다.
		 *  2. Method 호출
		 *   결과적으로 메모리에 안올라간 놈은 사용 불가능. 
		 *   사용하려면 메모리에 올려야 하니깐 == 객체를 생성. ( Field, constructor ... e.t.c.)
		 *   
		 *   
		 *   
		 	객체 생성하지 않고 바로 사용할 수 있는 것들이 있다.
		 	이미 메모리에 올라가 있다. --> static한 성질의 것들은 미리 올라가 있다.  
		 									**api 가서 확인해보자!** 
		 */
		int time = (int) (Math.random() * 4) + 8; // 8~ 11 
		System.out.println("[현재시간 : "+ time + "시]");
		
		switch(time) {
		case 8:
			System.out.println(" 일어나셔야죠 ?");
		case 9:
			System.out.println("아침을 드셔야죠?");
		case 10:
			System.out.println("일을 시작하셔야죠");
		case 11:
			System.out.println("꿀 그만 빠시죠?");
		
		
		}
		System.out.println("---End Switch ---");
	}

}
