package com.encore.cons;

import com.encore.util.MyDate;

// ������ ������ ��� �ִ� Ŭ����
public class Programmer {
	
	// 1. �ʵ弱��
	public String name;
	public MyDate birthday;
	public float salary;
	public int bonus;
	
	//2. ����
	/*
	 * public void setProgrammer(String name, MyDate birthday, float salary, int
	 * bonus) { this.name = name; this.birthday= birthday; this.salary = salary;
	 * this.bonus = bonus; }
	 */
	
	// �߰� -> ������ // ����� ������
//	public void setProgrammer(String name, MyDate birthday, float salary, int bonus) {
//		this.name = name;
//		this.birthday = birthday;
//		this.salary = salary;
//		this.bonus = bonus;
//	}
	
	// �⺻ ������ ... �ʵ� �ʱ�ȭ ���Ѵ�.
	public Programmer() {	}



	public Programmer(String name, MyDate birthday, float salary, int bonus) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
		this.bonus = bonus;
	}



	// �߰� -> �������� ������ �����ϴ� ����� ����
	public String getSalary() {
		return name + "�� ������ : " + ( (int) salary * 12 +(int)bonus )+ " �޷� �Դϴ�.";
	}
	
	
	//3. �ʵ� �� �޾ƿ���
	public String getProgrammer(){
		return name+ "," + birthday.getDate() + "," + salary + ","+ bonus ;
	}

}
