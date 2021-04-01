package com.encore.cons.test;

import com.encore.util.MyDate;
import com.encore.cons.Programmer;

public class ProgrammerTest {

	public static void main(String[] args) {
		// 1. ��ü���� ...  �޸� �Ҵ�
		/*
		 * Programmer pro = new Programmer(); Programmer pro1 = new Programmer();
		 * 
		 * 
		 * MyDate md = new MyDate(); md.setDate(1980, 1, 1); // 2. �޼ҵ� ȣ��
		 * 
		 * 
		 * // 3. �������� ������ �ܼ�â�� ��µǵ��� �ۼ� // birthday�� ������ 1980-1-1
		 * pro.setProgrammer("Martin", md, 300000, 10000); pro1.setProgrammer("Peter",
		 * md, 400000, 20000);
		 * 
		 * pro = pro1;
		 * 
		 * System.out.println(pro.getProgrammer());
		 * System.out.println(pro1.getProgrammer());
		 */
		 // step2
		/*
		 *  1. pro1, pro2 ��ü�� ����
		 
		 *  2. �����ڸ� �̿��ؼ� �ʵ忡 ���� ���� �Ҵ��Ѵ�.
		 *  
		 *  3. �ʵ� ������ �ܼ�â���� ���.
		 *  
		 *  4. Peter�� ������ 450000.0 �޷� �Դϴ�. ����� �ǵ��� �ϼ�
		 */
//		MyDate md = new MyDate(1980, 1, 1);
		
		Programmer pro1 = new Programmer("Martin", new MyDate(1980,1,1), 550000, 100000);
		Programmer pro2 = new Programmer("Peter", new MyDate(1980,1,1), 450000, 200000);
		
	
		
		System.out.println(pro1.getProgrammer());
		System.out.println(pro2.getProgrammer()+"\n");
		System.out.println(pro2.getSalary());
		 
	}

}
