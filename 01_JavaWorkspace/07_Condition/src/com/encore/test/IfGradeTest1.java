package com.encore.test;

import java.util.Scanner;
/*
 * ���
 * :
 * ������ �����Ҷ��� ������ �����ϵ��� �����ϴ� ����.
 * 1) if / if ~ else / else 
	 *   int i =1 ;
	 *   if (i != 1 <- ������ ������ ����� true,false�� �� ���;���) {
	 *   // code block --> true �϶�
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
		System.out.println("����� ���輺���� �Է��ϼ��� >> ");
		
		int score = sc.nextInt();
		
		if (score<100 && score >= 90) {
			System.out.println("����� A �Դϴ�");		
		} else if (score <90 && score >= 80) {
			System.out.println("����� B �Դϴ�.");
		} else if (score < 80 && score >= 70) {
			System.out.println("����� C �Դϴ�");
		} else if (score < 70 && score >= 60 ) {
			System.out.println("����� D �Դϴ�");
		} else {
			System.out.println("Try again");
		}
// ���� �϶��� {} ���� ����. 
	}

}
