package com.encore.algo.test;
import java.util.Scanner;

// 02_javaWokrshop �� ���� 

public class ArrayPersonTypeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ���� �Է����ּ��� >> " );
		int num = sc.nextInt(); // ��� �� --> 
		
		int [] arr = new int[num]; // array�� ������ .
		
		System.out.println("����� ������ �Է����ּ��� >> ");
		for ( int i = 0 ; i < arr.length ; i ++) {
		arr[i] = sc.nextInt()-1;	
		} // �ʱ�ȭ
		
		int many = 0;
		int [] index = new int[num]; // ������ Ȯ���غ���
		int max =0; // index �񱳸� ���� ��.
		
		for ( int i = 0 ; i < arr.length; i ++) {
			index[arr[i]]++;	
		}
		
		for ( int i = 0 ; i < index.length ;i++) {
			if ( max < index[i]) {
				max = index[i];
				many = i;
						
			}
		}
		System.out.println(many+1);	
		
		}
}
