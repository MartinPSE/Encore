package com.encore.cons.test;

import com.encore.util.MyDate;
import com.encore.cons.Programmer;

public class ProgrammerTest {

	public static void main(String[] args) {
		// 1. 객체생성 ...  메모리 할당
		/*
		 * Programmer pro = new Programmer(); Programmer pro1 = new Programmer();
		 * 
		 * 
		 * MyDate md = new MyDate(); md.setDate(1980, 1, 1); // 2. 메소드 호출
		 * 
		 * 
		 * // 3. 개발자의 정보가 콘솔창에 출력되도록 작성 // birthday의 정보가 1980-1-1
		 * pro.setProgrammer("Martin", md, 300000, 10000); pro1.setProgrammer("Peter",
		 * md, 400000, 20000);
		 * 
		 * pro = pro1;
		 * 
		 * System.out.println(pro.getProgrammer());
		 * System.out.println(pro1.getProgrammer());
		 */
		 // step2
		/*
		 *  1. pro1, pro2 객체를 생성
		 
		 *  2. 생성자를 이용해서 필드에 직접 값을 할당한다.
		 *  
		 *  3. 필드 정보를 콘솔창으로 출력.
		 *  
		 *  4. Peter의 연봉은 450000.0 달러 입니다. 출력이 되도록 완성
		 */
//		MyDate md = new MyDate(1980, 1, 1);
		
		Programmer pro1 = new Programmer("Martin", new MyDate(1980,1,1), 550000, 100000);
		Programmer pro2 = new Programmer("Peter", new MyDate(1980,1,1), 450000, 200000);
		
	
		
		System.out.println(pro1.getProgrammer());
		System.out.println(pro2.getProgrammer()+"\n");
		System.out.println(pro2.getSalary());
		 
	}

}
