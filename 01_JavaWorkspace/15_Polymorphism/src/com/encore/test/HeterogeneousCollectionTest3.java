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

public class HeterogeneousCollectionTest3 {

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
		
		/*
		 * 
		 * for ���� instanceof �� ����ؼ� 
		 * Robert �� �μ��� --> LG �� �ٲ㺸��.
		 * Gosling �� Ttech�� --> Python ���� �ٲ㺸��.
		 * Honey�� nameOfBoss �� --> Gosling ���� �ٲ�
		 * 
		 */
		
		for (Employee e : emps) {
			System.out.println("=== �ٲ�� �� ===");
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
			System.out.println("=== �ٲ� �� ===");
			System.out.println(e+"\n");
		}

	}
	/* 
	 * 
	 *  PolyMorphism
	 *  1. HeteroCollection
	 *  2. Virtual Method Invocation
	 *  3. Object Casting
	 *  4. �θ�Ÿ������ �����ϰ� ������ ������, ���� ���������� ������ '��ü Ÿ��'�� �˾Ƴ��� ����
	 *   		--> instanceof �̿�!!
	 *   		--> if ( * instanceof �ڽ�Ŭ���� ) 
	 *   
	 * 
	 */
}

