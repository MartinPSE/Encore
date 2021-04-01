package com.encore.util;

public class MyDate {
	private int year;
	private int month;
	private int day;
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
//	
//	public String printMyDate() {
//		return year + "년 " + month + "월 " + day +"일" ;
//		}
//	
	
	// 1step  Object가 가지고 있는 기능을 물려받은거야
	// 2step ---> 1step을 수정해서 사용한다. 
	@Override
	
	public String toString() {
		return  year + "-" + month + "-" + day ;
	}

}
