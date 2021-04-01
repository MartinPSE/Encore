package com.encore.array.test;

import com.encore.array.Account;
import com.encore.array.Customer;


public class AccountArrayTest2 {

	public static void main(String[] args) {
		// Account Type�� �迭 ����, ����, �ʱ�ȭ
		
		Account[] acc = { new Account(1000, "��������"),
								new Account (30000, "��������"),
								new Account (1000,"�츮����")
				
		};

			// 1. Customer ��ü�� ����
		
			Customer customer = new Customer("James" , 940324);
		
		
			//2. James ��� ���� ���� 3���� Hasing �ϵ��� �Ѵ�. --> I got it.
			customer.setAccount(acc);
			
			//3. James�� ������ ������ �޾ƿ´�.  --> �迭�� �޾ƾ���.
			Account[ ] returnAcc = customer.getAccount();
			
		
			//4. James�� ����� �߿��� �������� ���忡�� 5������ �Ա��Ѵ�.  --> �迭 �ȿ����� ����.
			for (Account a : returnAcc) {
				if(a.getBankName().equals("��������")) a.deposit(50000);
				
			}
		
			//5. �� ������� �ܰ� Ȯ���Ѵ�.  --> �迭�ȿ����� ����.
			for (Account account : returnAcc) System.out.println(account.getDetail());
			
			// �ʿ��� ����� �ִٸ� �˾Ƽ� �߰�---
			

	}

}
