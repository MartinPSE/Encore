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
		System.out.println(" 입금할 금액을 입력해주세요 >> ");
		double i = sc.nextDouble();
		if ( i <= 1000) {
			System.out.println("죄송합니다. 고갱님 1000원 이하는 입금이 불가능합니다");
			
		} else 
			this.balance = this.balance + i;
			System.out.println("현재 통잔 잔고는 : " + this.balance);
			
	
	}
	public void withdraw() {
		sc = new Scanner(System.in);
		System.out.println(" 출금할 금액을 입력해주세요 >> ");
		double j = sc.nextDouble();
		
		if ( j > this.balance) {
			System.out.println("고객님의 통장잔고는 " + this.balance + " 입니다");
			System.out.println("잔액부족으로 출금이 불가능합니다.");
		}
		
		else {
		this.balance = this.balance - j;
		System.out.println("현재 통잔 잔고는 : " +this.balance);}
	}
	
	
		public double getbalance() {
			return balance;
		}

	

}
