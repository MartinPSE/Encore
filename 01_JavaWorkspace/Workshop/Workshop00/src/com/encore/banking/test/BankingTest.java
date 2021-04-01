package com.encore.banking.test;

import java.util.Scanner;

import com.encore.banking.Customer;
import com.encore.banking.Account;

public class BankingTest {

	private static Scanner sc;

	public static void main(String[] args) {
		// 1. Customer ��ü�� ����.. �� ������ Scanner ��ü�� ���ؼ� �Է� .. �̸�, ssn ��
		// 2. ���� ������ �����Ѵ� -> �̶� Has a relation�� ����ȴ�. �� ��¡ ����
		// 3. ���� ������ ������ ��ȯ
		// 4. ������ ��� -> 1���� �Ա�, 5õ�� �Ա�, 2õ�� �Ա�, 
		//                           7õ�� ���
		// 5. �������� �ܾ��� �ַܼ� ���.
		
		Account ac = new Account();
		sc = new Scanner(System.in);
		System.out.println("������ ������ �Է����ּ��� >> ");
		String name = sc.next();
		System.out.println("������ ssn ������ �Է����ּ��� >>");
		int ssn = sc.nextInt();
		Customer cu = new Customer(name,ssn);
		System.out.println(cu.getCustInfo(name,ssn));
		ac.deposit();
		ac.deposit();
		ac.deposit();
		ac.withdraw();
		System.out.println("������ ���� �����ܰ�� : " + ac.balance);
		
		
	}

}
