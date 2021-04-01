package com.encore.workshop;

public class WorkshopTest1 {

	public static void main(String[] args) {
		int number = 1;
		for ( int i = 0 ; i < 5 ; i ++ ) {
			for (int j = 0; j<i ;j ++) {
				System.out.print(" ");
			}
			
			for (int j = 5 ; j > i ; j--) {
				System.out.print(number++);
			}
			System.out.println("");
			
			
		}
		
		

	}
}
		

