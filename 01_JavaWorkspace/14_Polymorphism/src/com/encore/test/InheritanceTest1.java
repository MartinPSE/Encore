package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class InheritanceTest1 {

	public static void main(String[] args) {
		
		Employee emp = new Employee("James", new MyDate(1994,03,24), 23000);
		Manager m = new Manager("Robert", new MyDate(1994,03,04), 35000, "SAMSUNG");
		Engineer eg = new Engineer("Gosling " , new MyDate(1978,1,2), 33000, "JAVA",200);
		Secretary ss = new Secretary("Honey", new MyDate(1995, 3, 26), 15000, "James");
		
		
		// Robert가 부서를 바꾼다. SAMSUNG -> LG 로.
		m.changeDept("LG");
		System.out.println(emp);
		System.out.println(m);
		System.out.println(eg);
		System.out.println(ss);

		
		//////////// Polymorphism /////////////
		// 부모타입(객체) 으로 자식을 생성한다.
		System.out.println("\n====================Polymorphism============\n");
		
		Employee e1 = new Manager("Robert1", new MyDate(1994,03,04), 35000, "SAMSUNG");
		Employee e2 = new Engineer("Gosling1" , new MyDate(1978,1,2), 33000, "JAVA",200);
		Employee e3 = new Secretary("Honey1", new MyDate(1995, 3, 26), 15000, "James");
		
		// 2. Object Casting 기법 필요... 부모로 찾으면 안되고 자식변수로 찾아야 한다.
		
		((Manager) e1).changeDept("LG"); // Object Casting 방법론 #1
		
//		Manager m1 = (Manager) e1;  // 방법론 #2
//		m1.changeDept("LG");
		/*
		 * 
		 *  Virtual Method(생성된 자식의 메소드) Invocation 원리
		 *   상속관계의 2개의 클래스에서 
		 *   -- > 메소드 오버라이딩을 했을때 발생하는 원리.
		 *  
		 *  Compile Time Type 메소드
		 *  Runtime Type 메소드
		 *  
		 */
		
		System.out.println(e1); // V M I  발생
		System.out.println(e2);
		System.out.println(e3);
		
	}

}
