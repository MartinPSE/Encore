package com.encore.test;

public class SwitchNoBreakTest3 {
	public static void main(String[] args) { // ���� Method 
		/*
		 *  1. ��ü����  == �ı��� �޸𸮿� �ø���.
		 *  2. Method ȣ��
		 *   ��������� �޸𸮿� �ȿö� ���� ��� �Ұ���. 
		 *   ����Ϸ��� �޸𸮿� �÷��� �ϴϱ� == ��ü�� ����. ( Field, constructor ... e.t.c.)
		 *   
		 *   
		 *   
		 	��ü �������� �ʰ� �ٷ� ����� �� �ִ� �͵��� �ִ�.
		 	�̹� �޸𸮿� �ö� �ִ�. --> static�� ������ �͵��� �̸� �ö� �ִ�.  
		 									**api ���� Ȯ���غ���!** 
		 */
		int time = (int) (Math.random() * 4) + 8; // 8~ 11 
		System.out.println("[����ð� : "+ time + "��]");
		
		switch(time) {
		case 8:
			System.out.println(" �Ͼ�ž��� ?");
		case 9:
			System.out.println("��ħ�� ��ž���?");
		case 10:
			System.out.println("���� �����ϼž���");
		case 11:
			System.out.println("�� �׸� ������?");
		
		
		}
		System.out.println("---End Switch ---");
	}

}
