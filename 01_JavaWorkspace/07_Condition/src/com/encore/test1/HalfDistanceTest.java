/*
 *  홀수 , 홀수를 어케 해결해야하나
 */



package com.encore.test1;

import java.util.Scanner;


public class HalfDistanceTest {
	
	private static int halfDistance(int kims, int lims) {
		int a= 0, b= 0;
							
		while (true) {
			if ((kims | lims) %  2 == 1 ) {
				kims = kims +1;
				lims = lims + 1;
			}
			
			kims = Math.round(kims/2);
			System.out.println("kims length left  >> " +kims);
			
			lims = Math.round(lims/2);
			System.out.println("lims length left  >> " +lims);
			a ++;
			b ++;
			if ( (kims == 1 | kims == 0 ) & ( lims == 1 | kims == 0 )) {
				return Math.max(a, b);
			}
			if ( kims == lims ) {
				return a;
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("김씨의 거리를 입력해주세요 >> ");
		int kims = sc.nextInt();
		System.out.println("임씨의 거리를 입력해주세요>>");
		int lims = sc.nextInt();
		
		int result  = halfDistance(kims, lims);
		System.out.println("두사람이 만나는데 걸린 횟수는 : " +result + " 입니다.");
	}
}


