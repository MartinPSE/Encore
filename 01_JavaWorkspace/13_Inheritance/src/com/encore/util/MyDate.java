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
//		return year + "�� " + month + "�� " + day +"��" ;
//		}
//	
	
	// 1step  Object�� ������ �ִ� ����� ���������ž�
	// 2step ---> 1step�� �����ؼ� ����Ѵ�. 
	@Override
	
	public String toString() {
		return  year + "-" + month + "-" + day ;
	}

}
