package com.encore.banking.test;

import java.util.Scanner;


import com.encore.banking.AccountTeacher;
import com.encore.banking.CustomerTeacher;


public class BankingTestTeacher {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("고객의 이름과 주민번호를 입력하세요>>");
			
			String name = sc.next();
			int ssn = sc.nextInt();
			
			CustomerTeacher custom = new CustomerTeacher(name,ssn);
			
			// 2. 고객이 통장을 개설한다
			custom.setAccount(new AccountTeacher(10000.0));
			
			//3. 고객이 개설한 통장을 반환.
			
			AccountTeacher myAccount = custom.getAccount();
			
			// 4. 통장을 사용 1만원 입금, 5천원 입금, 2천원 입금, 7천원 출금
			
			myAccount.deposit(10000.0);
			myAccount.deposit(300);
			myAccount.withdraw(10000);
			myAccount.withdraw(20000);
			
			System.out.println("현재 통장 잔고는 " + myAccount.getBalance()+ " 입니다.");
		}

	}

}
