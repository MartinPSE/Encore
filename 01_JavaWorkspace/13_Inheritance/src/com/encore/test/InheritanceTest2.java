package com.encore.test;

import com.encore.child.Student;
import com.encore.child.Teacher;

public class InheritanceTest2 {

	public static void main(String[] args) {
		
		Student s1 = new Student("오형석", 28 , "다산동", 123);
		Teacher t1 = new Teacher("아이린", 30 , "형석이 옆", "영어");
		
		System.out.println(s1);
		System.out.println(t1);

	}

}
