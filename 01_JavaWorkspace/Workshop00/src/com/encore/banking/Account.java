package com.encore.banking;

import java.util.Scanner;

public class Account {
	public double balance;
	private Scanner sc;
	
	public double getBalance() {
		return balance;
	}
	public void deposit() {
		sc = new Scanner(System.in);
		System.out.println(" �Ա��� �ݾ��� �Է����ּ��� >> ");
		double i = sc.nextDouble();
		if ( i <= 1000) {
			System.out.println("�˼��մϴ�. ���� 1000�� ���ϴ� �Ա��� �Ұ����մϴ�");
			
		} else 
			this.balance = this.balance + i;
			System.out.println("���� ���� �ܰ�� : " + this.balance);
			
	
	}
	public void withdraw() {
		sc = new Scanner(System.in);
		System.out.println(" ����� �ݾ��� �Է����ּ��� >> ");
		double j = sc.nextDouble();
		
		if ( j > this.balance) {
			System.out.println("������ �����ܰ�� " + this.balance + " �Դϴ�");
			System.out.println("�ܾ׺������� ����� �Ұ����մϴ�.");
		}
		
		else {
		this.balance = this.balance - j;
		System.out.println("���� ���� �ܰ�� : " +this.balance);}
	}
	
	
		public double getbalance() {
			return balance;
		}

	

}
