package com.encore.test;
/*
* 2) switch 
* : 해당하는 Case의 문장을 실행하도록 제어한다. --> 범위가 아니라.
* : 조건이 명확한 경우에 사용한다. case by case 느낌!
* : case 는 콜론 (:) 으로 끝내고 
* : break는 세미콜론 (;) 으로 끝낸다.
* 
*  	switch (변하는 변수를 대입한다.) {
*  		case 90:
*  		case 95:
*  			// --> 결과;
*  		break; 
*  
*  		case 80: 
*  		case 85:
*  			// --> 결과;
* 			break;
*  			--> 즉 switch 를 빠져 나간다.
*  			--> break 걸어줘야 빠져나온다. 해당하는 case를 빠져나간다.
* 
* 			default; // else와 동일한 역할 
* 				// 결과;
* 
*  	}
**/

import java.util.Scanner;

public class SwitchGradeTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 시험성적을 입력하세요 >> ");
		
		int score = sc.nextInt();
		
		switch (score) {
			case 90:
			case 95:
			case 100:
				System.out.println(" 잘했어 이자식아 " );
//				break ;
		
			case 80:
			case 85:
				System.out.println(" 공부좀 더 하자~");
				break;
			
			case 70:
			case 75:
				System.out.println("떄려쳐!");
				break;
				
			default:
				System.out.println("재수강을 축하드립니다");
				break;
			
			
		} // switch 끝나고
		System.out.println("switch 문을 빠져나오자");
	}// main 끝나고

} // class 가 닫히고
