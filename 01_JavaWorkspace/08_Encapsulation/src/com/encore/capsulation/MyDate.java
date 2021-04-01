package com.encore.capsulation;
/*
 * Encapsulation Pattern
 * 1. �ٸ� Ŭ���� �տ� ���� �� �� ������
 * 		�ʵ� �տ� --> private �����Ѵ�.
 * 
 * 2. Ŭ������ field �� ������ setter() �� getter() �Ѵ�.
 * 		�׸��� ��׵��� �ٸ� class������ ���� ������ �� �ֵ��� public 
 * 		public void set---(o) --> ���°� return Ÿ�� ��� �� 
 * 		public int get---(x)  --> ���ö��� return Ÿ���� �־����!
 * 
 * 3. 
 * 		set() {
 *		// ù ���ο��� (�ʵ� �ʱ�ȭ �Ǳ� ����!!!!! ) �� Ÿ���� ���� ���� �� �ֵ��� ������ �����Ѵ�. ( ��� ��� �ؼ� ) 
 *
 *		setDay()
 *		:: 
 *		1, 3, 5, 7, 8 , 10, 12�� -> day 1 - 31 
 *		2 -> day 1 - 28
 *      4, 6, 9 , 11 -> day 1 - 30
 *      
 *      :: 
 *      0�� 22�� �Դϴ�.
 *      2�� 0�Դϴ�. 
 *      
 *      ---> 0�� �ȳ������� ��°�� 
 * 
 * 
 */

public class MyDate {
	// private �����ϸ� ���� Ŭ���������� ������ ����Ѵ�.
	private int month;
	private int day;
	
	
	public int getMonth() {
			return month;
	}
	
	public int getDay() {
		return day;
		}
	
	
	
	public void setMonth(int month) {
		if (( month >=1  && month <= 12) ) {
			this.month = month;		
		} 
		else {System.out.println("���� 1 ~ 12 ���� �Է����ּ���.");
		//		return;
		System.exit(0); // ���α׷��� ���������� �����Ѵ�. 
	}
	}
	
	public void setDay(int day) {
		// ���� ���� ���̰� �޶�����.
		switch (month) {
			case 2:
			if ( (day >=1 ) && (day <= 28)) {
					this.day= day;}	
			else {
				System.out.println("��Ȯ�� ��¥�� ���� ������ �Է����ּ���.");
//				return;
				System.exit(0);
				}
				break;
		
			case 4:
			case 6:
			case 9:
			case 11:
				if ( (day >=1 ) && (day <= 30)) {
					this.day= day;}	
			else {
				System.out.println("��Ȯ�� ��¥�� ���� ������ �Է����ּ���.");
//				return;
				System.exit(0);
				}
				break;
				
				default:
					if ( (day >=1 ) && (day <= 31)) {
						this.day= day;
						}	
					
				else {
					System.out.println("��Ȯ�� ��¥�� ���� ������ �Է����ּ���.");
//					return;
					System.exit(0);
					}
		
	
	} // switch off
} // setDay
} // class 

	
		
		
		
	
	