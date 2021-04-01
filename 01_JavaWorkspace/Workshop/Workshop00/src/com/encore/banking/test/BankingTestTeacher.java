package com.encore.banking.test;

import java.util.Scanner;


import com.encore.banking.AccountTeacher;
import com.encore.banking.CustomerTeacher;


public class BankingTestTeacher {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("���� �̸��� �ֹι�ȣ�� �Է��ϼ���>>");
			
			String name = sc.next();
			int ssn = sc.nextInt();
			
			CustomerTeacher custom = new CustomerTeacher(name,ssn);
			
			// 2. ���� ������ �����Ѵ�
			custom.setAccount(new AccountTeacher(10000.0));
			
			//3. ���� ������ ������ ��ȯ.
			
			AccountTeacher myAccount = custom.getAccount();
			
			// 4. ������ ��� 1���� �Ա�, 5õ�� �Ա�, 2õ�� �Ա�, 7õ�� ���
			
			myAccount.deposit(10000.0);
			myAccount.deposit(300);
			myAccount.withdraw(10000);
			myAccount.withdraw(20000);
			
			System.out.println("���� ���� �ܰ�� " + myAccount.getBalance()+ " �Դϴ�.");
		}

	}

}
