package com.encore.test;
/*
* 2) switch 
* : �ش��ϴ� Case�� ������ �����ϵ��� �����Ѵ�. --> ������ �ƴ϶�.
* : ������ ��Ȯ�� ��쿡 ����Ѵ�. case by case ����!
* : case �� �ݷ� (:) ���� ������ 
* : break�� �����ݷ� (;) ���� ������.
* 
*  	switch (���ϴ� ������ �����Ѵ�.) {
*  		case 90:
*  		case 95:
*  			// --> ���;
*  		break; 
*  
*  		case 80: 
*  		case 85:
*  			// --> ���;
* 			break;
*  			--> �� switch �� ���� ������.
*  			--> break �ɾ���� �������´�. �ش��ϴ� case�� ����������.
* 
* 			default; // else�� ������ ���� 
* 				// ���;
* 
*  	}
**/

import java.util.Scanner;

public class SwitchGradeTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���輺���� �Է��ϼ��� >> ");
		
		int score = sc.nextInt();
		
		switch (score) {
			case 90:
			case 95:
			case 100:
				System.out.println(" ���߾� ���ڽľ� " );
//				break ;
		
			case 80:
			case 85:
				System.out.println(" ������ �� ����~");
				break;
			
			case 70:
			case 75:
				System.out.println("������!");
				break;
				
			default:
				System.out.println("������� ���ϵ帳�ϴ�");
				break;
			
			
		} // switch ������
		System.out.println("switch ���� ����������");
	}// main ������

} // class �� ������
