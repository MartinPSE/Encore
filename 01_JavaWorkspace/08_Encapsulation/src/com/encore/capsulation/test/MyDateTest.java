package com.encore.capsulation.test;

import java.util.Scanner;
import com.encore.capsulation.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월 에 대한 정보를 입력해주세요>>");
		int month = sc.nextInt();
		System.out.println("일 에 대한 정보를 입력해주세요>>");
		int day = sc.nextInt();
		
		
		
		
		MyDate md = new MyDate();
		System.out.println(md);
		md.setMonth(month);
		md.setDay(day);
		
		System.out.println("오늘의 날짜는 " + md.getMonth() + "월 " + md.getDay() + "일 입니다" );
	}

}
