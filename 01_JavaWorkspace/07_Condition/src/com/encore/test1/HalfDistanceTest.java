/*
 *  Ȧ�� , Ȧ���� ���� �ذ��ؾ��ϳ�
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
		System.out.println("�达�� �Ÿ��� �Է����ּ��� >> ");
		int kims = sc.nextInt();
		System.out.println("�Ӿ��� �Ÿ��� �Է����ּ���>>");
		int lims = sc.nextInt();
		
		int result  = halfDistance(kims, lims);
		System.out.println("�λ���� �����µ� �ɸ� Ƚ���� : " +result + " �Դϴ�.");
	}
}


