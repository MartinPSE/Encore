package com.encore.cons;

import com.encore.util.MyDate;

// 개발자 정보를 담고 있는 클래스
public class Programmer {
	
	// 1. 필드선언
	public String name;
	public MyDate birthday;
	public float salary;
	public int bonus;
	
	//2. 주입
	/*
	 * public void setProgrammer(String name, MyDate birthday, float salary, int
	 * bonus) { this.name = name; this.birthday= birthday; this.salary = salary;
	 * this.bonus = bonus; }
	 */
	
	// 추가 -> 생성자 // 명시적 생성자
//	public void setProgrammer(String name, MyDate birthday, float salary, int bonus) {
//		this.name = name;
//		this.birthday = birthday;
//		this.salary = salary;
//		this.bonus = bonus;
//	}
	
	// 기본 생성자 ... 필드 초기화 안한다.
	public Programmer() {	}



	public Programmer(String name, MyDate birthday, float salary, int bonus) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
		this.bonus = bonus;
	}



	// 추가 -> 개발자의 연봉을 리턴하는 기능을 정의
	public String getSalary() {
		return name + "의 연봉은 : " + ( (int) salary * 12 +(int)bonus )+ " 달러 입니다.";
	}
	
	
	//3. 필드 값 받아오기
	public String getProgrammer(){
		return name+ "," + birthday.getDate() + "," + salary + ","+ bonus ;
	}

}
