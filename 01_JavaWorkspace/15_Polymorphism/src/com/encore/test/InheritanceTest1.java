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
		
		
		// Robert�� �μ��� �ٲ۴�. SAMSUNG -> LG ��.
		m.changeDept("LG");
		System.out.println(emp);
		System.out.println(m);
		System.out.println(eg);
		System.out.println(ss);

		
		//////////// Polymorphism /////////////
		// �θ�Ÿ��(��ü) ���� �ڽ��� �����Ѵ�.
		System.out.println("\n====================Polymorphism============\n");
		
		Employee e1 = new Manager("Robert1", new MyDate(1994,03,04), 35000, "SAMSUNG");
		Employee e2 = new Engineer("Gosling1" , new MyDate(1978,1,2), 33000, "JAVA",200);
		Employee e3 = new Secretary("Honey1", new MyDate(1995, 3, 26), 15000, "James");
		
		// 2. Object Casting ��� �ʿ�... �θ�� ã���� �ȵǰ� �ڽĺ����� ã�ƾ� �Ѵ�.
		
		((Manager) e1).changeDept("LG"); // Object Casting ����� #1
		
//		Manager m1 = (Manager) e1;  // ����� #2
//		m1.changeDept("LG");
		/*
		 * 
		 *  Virtual Method(������ �ڽ��� �޼ҵ�) Invocation ����
		 *   ��Ӱ����� 2���� Ŭ�������� 
		 *   -- > �޼ҵ� �������̵��� ������ �߻��ϴ� ����.
		 *  
		 *  Compile Time Type �޼ҵ�
		 *  Runtime Type �޼ҵ�
		 *  
		 */
		
		System.out.println(e1); // V M I  �߻�
		System.out.println(e2);
		System.out.println(e3);
		
	}

}
