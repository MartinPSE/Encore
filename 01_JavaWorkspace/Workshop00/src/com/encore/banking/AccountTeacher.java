package com.encore.banking;

/*
1. 필드 선언
2. 값을 주입할 통로를 고민 -> 1) SETTER   2) 생성자 --> 보통 2개 써놓고 골라서 한다.
3. 필드 값을 받아온다.
 
*/


public class AccountTeacher {
	public double balance;

	public AccountTeacher(double balance) { // 생성자 주입. 객체 생성 동시에 + 값을 주입 ---> 동시에 
		this.balance = balance;
	}

	public void setBalnace(double balance) { // 셋터로 주입. 객체생성 하고 -> 나중에 값을 주입 
		this.balance = balance;
	}
	
	
	public double getBalance() {
		return balance;
	}

	// 입금
	public void deposit (double amount) {
		
			if (amount >= 1000) {
				balance += amount;
			}
			else System.out.println("1000원 이하는 입금이 불가 합니다. 돈을 더 넣어주세요");
			return;
		}
		
	
	// 출금 
	public void withdraw (double amount) {
		
			// balance = amount - balance;
			if ( amount > balance) {
				System.out.println("통장에 돈이 부족하여 " + amount + " 출금이 부족합니다.");
			}
			else balance -= amount;
		}
	

}
