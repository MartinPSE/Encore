package com.encore.array.test;

import com.encore.array.Account;
import com.encore.array.Customer;


public class AccountArrayTest2 {

	public static void main(String[] args) {
		// Account Type의 배열 선언, 생성, 초기화
		
		Account[] acc = { new Account(1000, "신한은행"),
								new Account (30000, "국민은행"),
								new Account (1000,"우리은행")
				
		};

			// 1. Customer 객체를 생성
		
			Customer customer = new Customer("James" , 940324);
		
		
			//2. James 라는 고객이 통장 3개를 Hasing 하도록 한다. --> I got it.
			customer.setAccount(acc);
			
			//3. James가 개설한 통장을 받아온다.  --> 배열을 받아야해.
			Account[ ] returnAcc = customer.getAccount();
			
		
			//4. James의 통장들 중에서 신한은행 통장에만 5만원을 입금한다.  --> 배열 안에서의 내용.
			for (Account a : returnAcc) {
				if(a.getBankName().equals("신한은행")) a.deposit(50000);
				
			}
		
			//5. 각 통장들의 잔고를 확인한다.  --> 배열안에서의 내용.
			for (Account account : returnAcc) System.out.println(account.getDetail());
			
			// 필요한 기능이 있다면 알아서 추가---
			

	}

}
