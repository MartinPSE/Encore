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
		Engineer eg = new Engineer("Gosling " , new MyDate(1978,1,2), 33000, "JAVA");
		Secretary ss = new Secretary("Honey", new MyDate(1995, 3, 26), 15000, "James");
		
		
		
		System.out.println(emp);
		System.out.println(m);
		System.out.println(eg);
		System.out.println(ss);

	}

}
