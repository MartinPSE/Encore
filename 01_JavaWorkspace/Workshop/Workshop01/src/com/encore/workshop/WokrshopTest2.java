package com.encore.workshop;

public class WokrshopTest2 {

	public static void main(String[] args) {

			int a = 1;
			for (int i = 0 ; i < 3; i++) {
				for ( int j = 0 ; j < i ; j++) {
					System.out.print("_");
				}
				for ( int k = 0 ; k < (2*3-1) -(2*i);k++) {
					System.out.print(a++);
				}System.out.println("");
					
			}
			for (int i = 0; i < 2; i++) {
				for (int j = 1; j<2-i; j++) {
					System.out.print("_");
				}
				for (int k = 0 ; k < 3 +(2*i) ; k++) {
					System.out.print(a++);
				}System.out.println("");
			}
			
		
			
		}
		

}
