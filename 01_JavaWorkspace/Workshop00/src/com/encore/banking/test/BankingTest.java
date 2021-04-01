package com.encore.banking.test;

import java.util.Scanner;

import com.encore.banking.Customer;
import com.encore.banking.Account;

public class BankingTest {

	private static Scanner sc;

	public static void main(String[] args) {
		// 1. Customer 객체를 생성.. 고객 정보는 Scanner 객체를 통해서 입력 .. 이름, ssn 만
		// 2. 고객이 통장을 개설한다 -> 이때 Has a relation이 연결된다. 즉 해징 연결
		// 3. 고객이 개설한 통장을 반환
		// 4. 통장을 사용 -> 1만원 입금, 5천원 입금, 2천원 입금, 
		//                           7천원 출금
		// 5. 최종적인 잔액을 콘솔로 출력.
		
		Account ac = new Account();
		sc = new Scanner(System.in);
		System.out.println("고객님의 성함을 입력해주세요 >> ");
		String name = sc.next();
		System.out.println("고객님의 ssn 정보를 입력해주세요 >>");
		int ssn = sc.nextInt();
		Customer cu = new Customer(name,ssn);
		System.out.println(cu.getCustInfo(name,ssn));
		ac.deposit();
		ac.deposit();
		ac.deposit();
		ac.withdraw();
		System.out.println("고객님의 현재 남은잔고는 : " + ac.balance);
		
		
	}

}
