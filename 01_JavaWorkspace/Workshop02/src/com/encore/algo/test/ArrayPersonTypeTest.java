package com.encore.algo.test;
import java.util.Scanner;

// 02_javaWokrshop 에 제출 

public class ArrayPersonTypeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사람 수를 입력해주세요 >> " );
		int num = sc.nextInt(); // 사람 수 --> 
		
		int [] arr = new int[num]; // array를 만들자 .
		
		System.out.println("사람의 성격을 입력해주세요 >> ");
		for ( int i = 0 ; i < arr.length ; i ++) {
		arr[i] = sc.nextInt()-1;	
		} // 초기화
		
		int many = 0;
		int [] index = new int[num]; // 갯수를 확인해보자
		int max =0; // index 비교를 위한 값.
		
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
