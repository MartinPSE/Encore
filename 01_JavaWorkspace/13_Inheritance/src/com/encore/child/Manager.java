package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

/*
 * 
 *  부모 클래스 Employee로 부터 모든것을 물려받고 
 *   "자기 자신만의 멤버를 추가하는 자식 class" 
 *  
 *   생성자 호출 --> 객체 생성 될 때 
 */
public class Manager extends Employee {

// 자식만의 멤버를 추가
	private String dept;
	
	/*
	 *  자식생성자 ---> 객체 생성 알고리즘
	 *  자식 생성자 { 첫 라인에서 무조건 부모기본 생성자 호출이 일어난다 }
	 * 
	 */
	
	public Manager(String name, MyDate birthDay, double salary, String dept) {// 자식이 생성되려할때 
		// 부모기본생성자호출 !! ** 무조건 **   super();
		super(name, birthDay, salary);
		this.dept = dept;
		
	}
	public String printDept(){
		return dept;
	}
	/*
	 *   Method Overriding
	 *   << 상속관계에서만 일어난다 . >>
	 *    1step : 부모가 가진 기능을 물려받는다.
	 *     2step : 그걸 자신에 맞게 고쳐쓴다.
	 *     
	 *     Overriding Rule ( Method Overriding )
	 *     0. 상속관계의 두 클래스 사이에서 일어난다.
	 *     1. 메소드 선언부는 모두 일치 !! 
	 *     		--> return Type argument 이름.
	 *     2. 구현부는 반드시 달라야 한다.
	 *     		--> 하는일이 달라지면 --> 즉, 새로운 Method가 만들어진다.
	 *     							< "메소드 재정의" >
	 *     
	 *   
	 */
	@Override
	public String toString() {
		return super.toString()+ ","+ dept;
	}
	

	

}
