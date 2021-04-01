package com.encore.test;

import java.util.Scanner;
/*
 * 제어문
 * :
 * 조건을 만족할때만 문장을 수행하도록 제어하는 문장.
 * 1) if / if ~ else / else 
	 *   int i =1 ;
	 *   if (i != 1 <- 연산을 수행한 결과가 true,false로 만 나와야해) {
	 *   // code block --> true 일때
	 *   } else if (i==1) {
	 *   // code block2
	 *   } else {
	 *   // code block3 
	 *   }
 *   
 *   
 *   
 *  
 * 
 
 */
public class IfGradeTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 시험성적을 입력하세요 >> ");
		
		int score = sc.nextInt();
		
		if (score<100 && score >= 90) {
			System.out.println("당신의 A 입니다");		
		} else if (score <90 && score >= 80) {
			System.out.println("당신은 B 입니다.");
		} else if (score < 80 && score >= 70) {
			System.out.println("당신은 C 입니다");
		} else if (score < 70 && score >= 60 ) {
			System.out.println("당신은 D 입니다");
		} else {
			System.out.println("Try again");
		}
// 한줄 일때는 {} 생략 가능. 
	}

}
