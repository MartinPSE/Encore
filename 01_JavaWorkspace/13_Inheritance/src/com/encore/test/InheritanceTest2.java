package com.encore.test;

import com.encore.child.Student;
import com.encore.child.Teacher;

public class InheritanceTest2 {

	public static void main(String[] args) {
		
		Student s1 = new Student("������", 28 , "�ٻ굿", 123);
		Teacher t1 = new Teacher("���̸�", 30 , "������ ��", "����");
		
		System.out.println(s1);
		System.out.println(t1);

	}

}
