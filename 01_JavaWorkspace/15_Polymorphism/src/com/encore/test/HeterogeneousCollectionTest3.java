package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.util.MyDate;

/*
 *  Collection ( 집합 )
 *  	1. homogeneous collection (동종간의 집합체)
 *  	2. heterogenous collection (이기종간의 집합체)
 * 
 */

public class HeterogeneousCollectionTest3 {

	public static void main(String[] args) {
		
		
		// 상속이 전제가 되면 --> 배열에서 Samedatetype이 무너지게된다.
		// 즉, 이기종 집합을 할 수 있어. 
		// 부모타입으로 묶은뒤!! 
		Employee[] emps = {
				new Employee("James", new MyDate(1994,03,24), 23000),
				new Manager("Robert", new MyDate(1994,03,04), 35000, "SAMSUNG"),
				new Engineer("Gosling " , new MyDate(1978,1,2), 33000, "JAVA",200),
				new Secretary("Honey", new MyDate(1995, 3, 26), 15000, "James")
		};
		
		/*
		 * 
		 * for 문과 instanceof 를 사용해서 
		 * Robert 의 부서를 --> LG 로 바꿔보자.
		 * Gosling 의 Ttech를 --> Python 으로 바꿔보자.
		 * Honey의 nameOfBoss 를 --> Gosling 으로 바꾸
		 * 
		 */
		
		for (Employee e : emps) {
			System.out.println("=== 바뀌기 전 ===");
			System.out.println(e);
			
			if (e instanceof Manager) {
				((Manager) e).changeDept("LG");
			}
			if ( e instanceof Engineer) {
				((Engineer) e).changeTech("Python");
			}
			if ( e instanceof Secretary) {
				((Secretary) e).changeNameOfBoss("Gosling");
			}
			System.out.println("=== 바뀐 후 ===");
			System.out.println(e+"\n");
		}

	}
	/* 
	 * 
	 *  PolyMorphism
	 *  1. HeteroCollection
	 *  2. Virtual Method Invocation
	 *  3. Object Casting
	 *  4. 부모타입으로 동일하게 묶여져 있지만, 각각 실질적으로 생성된 '객체 타입'을 알아내기 위한
	 *   		--> instanceof 이용!!
	 *   		--> if ( * instanceof 자식클래스 ) 
	 *   
	 * 
	 */
}

