package com.encore.banking;

/*
1. �ʵ� ����
2. ���� ������ ��θ� ��� -> 1) SETTER   2) ������ --> ���� 2�� ����� ��� �Ѵ�.
3. �ʵ� ���� �޾ƿ´�.
 
*/


public class AccountTeacher {
	public double balance;

	public AccountTeacher(double balance) { // ������ ����. ��ü ���� ���ÿ� + ���� ���� ---> ���ÿ� 
		this.balance = balance;
	}

	public void setBalnace(double balance) { // ���ͷ� ����. ��ü���� �ϰ� -> ���߿� ���� ���� 
		this.balance = balance;
	}
	
	
	public double getBalance() {
		return balance;
	}

	// �Ա�
	public void deposit (double amount) {
		
			if (amount >= 1000) {
				balance += amount;
			}
			else System.out.println("1000�� ���ϴ� �Ա��� �Ұ� �մϴ�. ���� �� �־��ּ���");
			return;
		}
		
	
	// ��� 
	public void withdraw (double amount) {
		
			// balance = amount - balance;
			if ( amount > balance) {
				System.out.println("���忡 ���� �����Ͽ� " + amount + " ����� �����մϴ�.");
			}
			else balance -= amount;
		}
	

}
