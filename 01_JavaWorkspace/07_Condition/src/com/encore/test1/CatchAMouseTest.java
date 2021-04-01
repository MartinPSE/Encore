package com.encore.test1;
/*
 * 
 *  제어문을 사용한 알고리즘을 간단하게 다뤄보자 . 
 */

import java.util.Scanner;
public class CatchAMouseTest {

	private static String algoSolv(int cata, int catb, int mouse) {
		// if, else if, else 구문과 Math.abs()를 이용해서 알고리즘을 구현하세요!!
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
		// 순서대로 입력
		int cata = sc.nextInt();
		int catb = sc.nextInt();
		int mouse = sc.nextInt();
		
		String result = algoSolv(cata, catb, mouse);
		
	}

}
