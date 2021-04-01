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

public class HeterogeneousCollectionTest2 {

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
		
		for (Employee e : emps) {
			System.out.println(e);
		}
		
			
		System.out.println("======== 모든 고용인들의 연봉을 계산해봅시다 =========");
		double total = 0;
		for ( Employee e : emps) {
			if (e instanceof Engineer) {
				System.out.println("Information :: " + e);
				System.out.println("Annual Salary :: " + ( e.getSalary()*12 + ((Engineer) e).getBonus()));
			}
			else {
			System.out.println("Information :: " + e);
			System.out.println("Annual Salary :: " + e.getSalary() * 12);
			}
		}
	}
	

}
