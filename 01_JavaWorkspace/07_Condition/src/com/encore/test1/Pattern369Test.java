package com.encore.test1;

import java.util.Scanner;

/*
 * 
 * Scanner 객체를 통해서
 * 10~ 99 사이의 정수를 하나 입력받는다.
 * 
 * 
 * 2자리수
 * 앞자리 --- / 몫 
 * 뒷자리 --- % 나머지 
 */
public class Pattern369Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10~99 사이의 정수를 하나 입력해주세요");
		int number = sc.nextInt();
		int a = number / 10;
		int b = number % 10;
		
		if ( a % 3 == 0 &&  b % 3 == 0)
		{	
			System.out.println("@@");
			
		} else if(a % 3== 0 || b % 3== 0) {
			System.out.println("@");
		}
		else {
			System.out.println(number);
		}
	 
	}

}
