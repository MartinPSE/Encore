package com.encore.capsulation;
/*
 * Encapsulation Pattern
 * 1. 다른 클래스 앞에 접근 할 수 없도록
 * 		필드 앞에 --> private 지정한다.
 * 
 * 2. 클래스의 field 에 접근은 setter() 와 getter() 한다.
 * 		그리고 얘네들이 다른 class에서도 서로 접근할 수 있도록 public 
 * 		public void set---(o) --> 들어가는건 return 타입 없어도 됨 
 * 		public int get---(x)  --> 나올때는 return 타입이 있어야지!
 * 
 * 3. 
 * 		set() {
 *		// 첫 라인에서 (필드 초기화 되기 직전!!!!! ) 에 타당한 값만 받을 수 있도록 로직을 제어한다. ( 제어문 사용 해서 ) 
 *
 *		setDay()
 *		:: 
 *		1, 3, 5, 7, 8 , 10, 12월 -> day 1 - 31 
 *		2 -> day 1 - 28
 *      4, 6, 9 , 11 -> day 1 - 30
 *      
 *      :: 
 *      0월 22일 입니다.
 *      2월 0입니다. 
 *      
 *      ---> 0이 안나오도록 출력결과 
 * 
 * 
 */

public class MyDate {
	// private 지정하면 같은 클래스에서만 접근을 허용한다.
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
		else {System.out.println("달은 1 ~ 12 달을 입력해주세요.");
		//		return;
		System.exit(0); // 프로그램을 정상적으로 종료한다. 
	}
	}
	
	public void setDay(int day) {
		// 월에 따라서 데이가 달라진다.
		switch (month) {
			case 2:
			if ( (day >=1 ) && (day <= 28)) {
					this.day= day;}	
			else {
				System.out.println("정확한 날짜에 대한 정보를 입력해주세요.");
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
				System.out.println("정확한 날짜에 대한 정보를 입력해주세요.");
//				return;
				System.exit(0);
				}
				break;
				
				default:
					if ( (day >=1 ) && (day <= 31)) {
						this.day= day;
						}	
					
				else {
					System.out.println("정확한 날짜에 대한 정보를 입력해주세요.");
//					return;
					System.exit(0);
					}
		
	
	} // switch off
} // setDay
} // class 

	
		
		
		
	
	