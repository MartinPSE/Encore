package com.encore.test1;

import java.util.Scanner;

/*
 * 
 * Scanner ��ü�� ���ؼ�
 * 10~ 99 ������ ������ �ϳ� �Է¹޴´�.
 * 
 * 
 * 2�ڸ���
 * ���ڸ� --- / �� 
 * ���ڸ� --- % ������ 
 */
public class Pattern369Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10~99 ������ ������ �ϳ� �Է����ּ���");
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
