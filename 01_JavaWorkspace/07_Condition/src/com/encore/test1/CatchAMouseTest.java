package com.encore.test1;
/*
 * 
 *  ����� ����� �˰����� �����ϰ� �ٷﺸ�� . 
 */

import java.util.Scanner;
public class CatchAMouseTest {

	private static String algoSolv(int cata, int catb, int mouse) {
		// if, else if, else ������ Math.abs()�� �̿��ؼ� �˰����� �����ϼ���!!
		int dis1 = Math.abs(mouse - cata);
		int dis2 = Math.abs(mouse - catb);
		if ( dis1 > dis2) {
			System.out.println("CatB catch!! ");
		}
		else if (dis1 < dis2)
		{
			System.out.println("CatA catch!!");
			
		}
		else System.out.println("Mouse Escapes!!");
		
		
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// ������� �Է�
		int cata = sc.nextInt();
		int catb = sc.nextInt();
		int mouse = sc.nextInt();
		
		String result = algoSolv(cata, catb, mouse);
		
	}

}
