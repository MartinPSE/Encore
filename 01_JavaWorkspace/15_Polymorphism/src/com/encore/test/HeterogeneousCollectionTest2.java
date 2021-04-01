package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.util.MyDate;

/*
 *  Collection ( ���� )
 *  	1. homogeneous collection (�������� ����ü)
 *  	2. heterogenous collection (�̱������� ����ü)
 * 
 */

public class HeterogeneousCollectionTest2 {

	public static void main(String[] args) {
		
		
		// ����� ������ �Ǹ� --> �迭���� Samedatetype�� �������Եȴ�.
		// ��, �̱��� ������ �� �� �־�. 
		// �θ�Ÿ������ ������!! 
		Employee[] emps = {
				new Employee("James", new MyDate(1994,03,24), 23000),
				new Manager("Robert", new MyDate(1994,03,04), 35000, "SAMSUNG"),
				new Engineer("Gosling " , new MyDate(1978,1,2), 33000, "JAVA",200),
				new Secretary("Honey", new MyDate(1995, 3, 26), 15000, "James")
		};
		
		for (Employee e : emps) {
			System.out.println(e);
		}
		
			
		System.out.println("======== ��� ����ε��� ������ ����غ��ô� =========");
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
