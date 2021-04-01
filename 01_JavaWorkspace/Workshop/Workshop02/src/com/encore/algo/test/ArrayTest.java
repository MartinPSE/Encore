package com.encore.algo.test;


/*
 *  34 23 64 25 12 75 22 88 53 37
 */

 
public class ArrayTest {
	public static int [] arr = {34, 23,64, 25, 12, 75 ,22 ,88, 53 ,37};
	
	public static void print() {
		for (int i = 0 ; i < arr.length ; i ++ ) System.out.print(arr[i] + " ");
		}
	public static void total() {
		int sum = 0;
		for (int i = 0 ; i < arr.length ; i ++ ) {
			sum += arr[i];
		} System.out.println("\n배열의 합 : " + sum );
	}
	
	public static void average() {
		int ave = 0, sum = 0 ;
		for ( int i = 0 ; i< arr.length;i++) {
			sum += arr[i];
			ave = sum/ arr.length;
		} System.out.println("배열의 평균 : " + ave);
		
	}
	
	public static void minimum() {
		int min = arr[0];
		for ( int i = 0 ; i < arr.length ; i++) {
			if(arr[i] < min) {
				min = arr[i];
				
			} 
		} System.out.println("배열의 최소값 : " + min);
	}
	
	public static void selectionSort() {
		int temp = 0 ;
		for(int j = 0 ; j < arr.length - 1; j++) {
			for (int i = 0 ; i < arr.length - 1; i ++) {
				if (arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;			
			}
		}
	} for (int u : arr) System.out.print(u+ " ");}
	
	
	public static void main (String[] args) {
		print();
		total();
		average();
		minimum();
		System.out.println("=== selection sort ( Ascending Order ) ===");
		selectionSort();
	}
}

